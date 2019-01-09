// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceDesiredHistoryDTO.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class DeviceDesiredHistoryDTO
{

    public DeviceDesiredHistoryDTO()
    {
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getGatewayId()
    {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId)
    {
        this.gatewayId = gatewayId;
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String getServiceId()
    {
        return serviceId;
    }

    public void setServiceId(String serviceId)
    {
        this.serviceId = serviceId;
    }

    public ObjectNode getData()
    {
        return desired;
    }

    public void setData(ObjectNode data)
    {
        desired = data;
    }

    public String getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceDesiredHistoryDTO [deviceId=")).append(deviceId).append(", gatewayId=").append(gatewayId).append(", appId=").append(appId).append(", serviceId=").append(serviceId).append(", desired=").append(desired).append(", timestamp=").append(timestamp).append("]").toString();
    }

    private String deviceId;
    private String gatewayId;
    private String appId;
    private String serviceId;
    private ObjectNode desired;
    private String timestamp;
}
