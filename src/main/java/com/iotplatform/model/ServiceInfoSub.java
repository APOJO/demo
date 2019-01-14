package com.iotplatform.model;

import com.iotplatform.client.dto.ServiceInfo;

/**
 * @ClassName ServiceInfoSub
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/14 19:37
 */
public class ServiceInfoSub extends ServiceInfo {
    private String serviceId;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
