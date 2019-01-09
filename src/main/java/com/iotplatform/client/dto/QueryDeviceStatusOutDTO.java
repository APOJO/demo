// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDeviceStatusOutDTO.java

package com.iotplatform.client.dto;


public class QueryDeviceStatusOutDTO
{

    public QueryDeviceStatusOutDTO()
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

    public boolean isActivated()
    {
        return activated;
    }

    public void setActivated(boolean activated)
    {
        this.activated = activated;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return (new StringBuilder("QueryDeviceStatusOutDTO [deviceId=")).append(deviceId).append(", activated=").append(activated).append(", name=").append(name).append("]").toString();
    }

    private String deviceId;
    private boolean activated;
    private String name;
}
