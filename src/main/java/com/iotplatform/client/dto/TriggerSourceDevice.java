// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TriggerSourceDevice.java

package com.iotplatform.client.dto;


public class TriggerSourceDevice
{

    public TriggerSourceDevice()
    {
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getServiceId()
    {
        return serviceId;
    }

    public void setServiceId(String serviceId)
    {
        this.serviceId = serviceId;
    }

    public String toString()
    {
        return (new StringBuilder("TriggerSourceDevice [type=")).append(type).append(", deviceId=").append(deviceId).append(", serviceId=").append(serviceId).append("]").toString();
    }

    String type;
    String deviceId;
    String serviceId;
}
