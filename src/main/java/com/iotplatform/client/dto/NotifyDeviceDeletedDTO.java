// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifyDeviceDeletedDTO.java

package com.iotplatform.client.dto;


public class NotifyDeviceDeletedDTO
{

    public NotifyDeviceDeletedDTO()
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

    public String toString()
    {
        return (new StringBuilder("NotifyDeviceDeletedDTO [notifyType=")).append(notifyType).append(", deviceId=").append(deviceId).append(", gatewayId=").append(gatewayId).append("]").toString();
    }

    private String notifyType;
    private String deviceId;
    private String gatewayId;
}
