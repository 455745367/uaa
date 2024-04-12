package com.renmaituan.base.uaa.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 商汤服务网关 class
 *
 * @author 孙悟空
 * @date 1:09 AM 2018/11/28
 */
@FeignClient(name="TencentCloud",url ="https://")
public interface TencentCloudGatewayClient {

    /**
     * 登录凭证校验。通过 wx.login() 接口获得临时登录凭证 code 后传到开发者服务器调用此接口完成登录流程
     * 备注：更多使用方法详见 小程序登录。
     * @param appid 小程序 appId
     * @param secret 小程序 appSecret
     * @param jsCode 登录时获取的 code
     * @param grantType 授权类型，此处只需填写 authorization_code
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "api.weixin.qq.com/sns/jscode2session")
    String jscode2session(@RequestParam("appid") String appid, @RequestParam("secret") String secret, @RequestParam("js_code") String jsCode, @RequestParam("grant_type") String grantType);

    /**
     * 获取小程序全局唯一后台接口调用凭据（access_token）。调调用绝大多数后台接口时都需使用 access_token，开发者需要进行妥善保存
     * 备注：
     * @param grantType 授权类型，此处只需填写 authorization_code
     * @param appid 小程序 appId
     * @param secret 小程序 appSecret
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "api.weixin.qq.com/cgi-bin/token")
    String getAccessToken(@RequestParam("grant_type") String grantType, @RequestParam("appid") String appid, @RequestParam("secret") String secret);

}

