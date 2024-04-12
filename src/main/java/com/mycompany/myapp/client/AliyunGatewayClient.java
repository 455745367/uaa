package com.renmaituan.base.uaa.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 阿里云API 网关 AliyunGatewayService class
 *
 * @author 孙悟空
 * @date 下午1:51 2017/11/2
 */
@FeignClient(name="aliyun",url ="http://")
public interface AliyunGatewayClient {


    /**
     * 身份证实名认证（校验）
     * 通过身份证号码和姓名来校验是否一致，准确度100%，同时返回省份、城市、性别等信息。
     * 备注地址：https://market.aliyun.com/products/57000002/cmapi011452.html?spm=5176.2020520132.101.25.wedLgO#sku=yuncode545200005
     * @param headers
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "jisusfzsm.market.alicloudapi.com/idcardverify/verify", headers = {"Authorization=APPCODE 8bedd7bd102f4849a79e94c537bef815"})
    String idcardVerify(@RequestParam MultiValueMap<String, String> headers);

    /**
     * 银行卡归属地查询
     * 支持中国银工行、农行、建行、邮政、交通银行、招商银行、浦发银行、兴业银行、华夏银行、民生银行、光大银行等在内的400多家银行卡归属地查询。
     * 通过银行卡号查询该卡的归属地、银行卡信息及发卡银行的相关信息。
     * 备注地址：https://market.aliyun.com/products/57000002/cmapi013985.html?spm=5176.2020520132.101.20.wedLgO#sku=yuncode798500000
     * @param headers
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "jisuyhkgsd.market.alicloudapi.co/bankcard/query", headers = {"Authorization=APPCODE 8bedd7bd102f4849a79e94c537bef815"})
    String bankcardQuery(@RequestParam MultiValueMap<String, String> headers);

    /**
     * 银行卡二元素（二要素）实名认证
     * 通过银行卡号和姓名来校验是否一致。
     * 备注地址：https://market.aliyun.com/products/57000002/cmapi011451.html?spm=5176.2020520132.101.30.wedLgO#sku=yuncode545100005
     * @param headers
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "jisubank2.market.alicloudapi.com/bankcardverify/verify", headers = {"Authorization=APPCODE 8bedd7bd102f4849a79e94c537bef815"})
    String bankcarderify(@RequestParam MultiValueMap<String, String> headers);


}

