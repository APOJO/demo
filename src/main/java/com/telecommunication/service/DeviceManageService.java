package com.telecommunication.service;

import java.util.Map;

/**
 * @ClassName DeviceManageService
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/3 13:52
 */
public interface DeviceManageService {
    /**
     * @Description
     * @author xiebifeng
     * @date 2019/1/3 13:54
     * @param:
     * @return:
     */
    Map<String, Object> regDevice(String appId, String verifyCode, String nodeId, String endUserId, String psk, Integer timeout, Boolean isSecure) throws Exception;

    /**
     * @Description 刷新设备验证码
     * @author xiebifeng
     * @date 2019/1/3 19:06
     * @param:
     * @return:
     */

    Map<String, Object> updateVerifyCode(String verifyCode, String nodeId, String appId,String deviceId, Integer timeout) throws Exception;


}
