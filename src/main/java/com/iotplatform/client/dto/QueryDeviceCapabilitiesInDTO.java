// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDeviceCapabilitiesInDTO.java

package com.iotplatform.client.dto;


public class QueryDeviceCapabilitiesInDTO
{

    public QueryDeviceCapabilitiesInDTO()
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

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
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
        return (new StringBuilder("QueryDeviceCapabilitiesInDTO [deviceId=")).append(deviceId).append(", appId=").append(appId).append(", gatewayId=").append(gatewayId).append("]").toString();
    }

    private String deviceId;
    private String appId;
    private String gatewayId;
}
