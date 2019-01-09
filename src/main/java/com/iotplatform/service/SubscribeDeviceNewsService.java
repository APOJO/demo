package com.iotplatform.service;

import com.iotplatform.model.DeviceInfo;

import java.util.Map;

/**
 * @ClassName SubscribeDeviceNewsService
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/4 14:00
 */

public interface SubscribeDeviceNewsService {

    Map<String, Object> deviceInfoChanged(String notifyType, String deviceId, String gatewayId, DeviceInfo deviceInfo);
}
