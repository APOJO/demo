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
    Map<String, Object> regDevice(String appId, String verifyCode, String nodeId, String endUserId, String psk, Integer timeout, Boolean isSecure)throws Exception;
}
