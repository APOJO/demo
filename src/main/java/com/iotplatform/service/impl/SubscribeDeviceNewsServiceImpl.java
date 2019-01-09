package com.iotplatform.service.impl;

import com.iotplatform.mapper.SubscribeDeviceNewsMapper;
import com.iotplatform.model.DeviceInfo;
import com.iotplatform.service.SubscribeDeviceNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @ClassName SubscribeDeviceNewsServiceImpl
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/4 14:01
 */
@Service
public class SubscribeDeviceNewsServiceImpl implements SubscribeDeviceNewsService {
    @Autowired
    private SubscribeDeviceNewsMapper subscribeDeviceNewsMapper;

    @Override
    public Map<String, Object> deviceInfoChanged(String notifyType, String deviceId, String gatewayId, DeviceInfo deviceInfo) {
        return null;
    }
}
