package com.telecommunication.service.impl;

import com.telecommunication.dao.SubscribeDeviceNewsMapper;
import com.telecommunication.service.SubscribeDeviceNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
