package com.renmaituan.base.uaa.client;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.exception.ZkNodeExistsException;
import org.I0Itec.zkclient.serialize.BytesPushThroughSerializer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author 孙悟空
 * @date 8:22 AM 2018/11/30
 */
public class IdMaker {
    private ZkClient client = null;

    //记录服务器的地址
    private final String server;

    //记录父节点的路径
    private final String root;

    //节点的名称
    private final String nodeName;

    private volatile boolean running = false;

    private ExecutorService cleanExector = null;

    /**
     * 删除节点的级别
     */
    public enum RemoveMethod{
        NONE,IMMEDIATELY,DELAY
    }
    public IdMaker(String zkServer, String root, String nodeName){
        this.root = root;
        this.server = zkServer;
        this.nodeName = nodeName;
    }
    public void start() throws Exception {
        if (running){
            throw new Exception("server has stated...");
        }
        running = true;
        init();
    }
    public void stop() throws Exception {
        if (!running)
        {
            throw new Exception("server has stopped...");

        }
        running = false;
        freeResource();
    }
    /**
     * 初始化服务资源
     */
    private void init(){
        client = new ZkClient(server,5000,5000,new BytesPushThroughSerializer());
        cleanExector = Executors.newFixedThreadPool(10);

//        Executors executors = new ThreadPoolExecutor(10,100,0L,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>(1024));

        try{
            client.createPersistent(root,true);
        }catch (ZkNodeExistsException e){
            throw e;
        }
    }
    /**
     * 释放服务资源
     */
    private void freeResource(){
        cleanExector.shutdown();
        try{
            cleanExector.awaitTermination(2, TimeUnit.SECONDS);
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally{
            cleanExector = null;
        }
        if (client!=null){
            client.close();
            client=null;
        }
    }
    /**
     * 检测服务是否正在运行
     * @throws Exception
     */
    private void checkRunning() throws Exception {
        if (!running)
            throw new Exception("请先调用start");
    }
    private String ExtractId(String str){
        int index = str.lastIndexOf(nodeName);
        if (index >= 0){
            index+=nodeName.length();
            return index <= str.length()?str.substring(index):"";
        }
        return str;
    }
    /**
     * 产生ID
     * 核心函数
     * @param removeMethod 删除的方法
     * @return
     * @throws Exception
     */
    public String generateId(RemoveMethod removeMethod) throws Exception{
        checkRunning();
        final String fullNodePath = root.concat("/").concat(nodeName);
        //返回创建的节点的名称
        final String ourPath = client.createPersistentSequential(fullNodePath, null);
        /**
         * 在创建完节点后为了不
         */
        if (removeMethod.equals(RemoveMethod.IMMEDIATELY)){
            client.delete(ourPath);
        }else if (removeMethod.equals(RemoveMethod.DELAY)){
            cleanExector.execute(new Runnable() {
                public void run() {
                    // TODO Auto-generated method stub
                    client.delete(ourPath);
                }
            });
        }
        //node-0000000000, node-0000000001，ExtractId提取ID
        return ExtractId(ourPath);
    }
//    public static void main(String[] args) throws Exception {
//        IdMaker idMaker = new IdMaker("112.74.43.58:2181,112.74.43.58:2182,112.74.43.58:2183","/NameService/IdGen", "ID");
//        idMaker.start();
//        try {
//            String id = idMaker.generateId(RemoveMethod.DELAY);
//            System.out.println(id);
//        } finally {
//            idMaker.stop();
//        }
//    }
}
