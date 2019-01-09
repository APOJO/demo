// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifyDeviceDatasChangedDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class NotifyDeviceDatasChangedDTO
{

    public NotifyDeviceDatasChangedDTO()
    {
    }

    public String getNotifyType()
    {
        return notifyType;
    }

    public void setNotifyType(String notifyType)
    {
        this.notifyType = notifyType;
    }

    public String getRequestId()
    {
        return requestId;
    }

    public void setRequestId(String requestId)
    {
        this.requestId = requestId;
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

    public List getServices()
    {
        return services;
    }

    public void setServices(List services)
    {
        this.services = services;
    }

    public String toString()
    {
        return (new StringBuilder("NotifyDeviceDatasChangedDTO [notifyType=")).append(notifyType).append(", requestId=").append(requestId).append(", deviceId=").append(deviceId).append(", gatewayId=").append(gatewayId).append(", services=").append(services).append("]").toString();
    }

    private String notifyType;
    private String requestId;
    private String deviceId;
    private String gatewayId;
    private List services;
}
