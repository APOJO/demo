package com.iotplatform.service;



/**
 * @ClassName AuthorizationController
 * @Description 鉴权接口
 * @Author xiebifeng
 * @Date 2019/1/2 12:33
 */
public interface AuthorizationService {
    /**
     * @Description 获取鉴权
     * @author xiebifeng
     * @date 2019/1/2 12:34
     */
   Boolean getAccessToken() ;

   Boolean refreshToken() ;
}
