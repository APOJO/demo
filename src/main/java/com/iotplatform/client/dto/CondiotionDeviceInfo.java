// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CondiotionDeviceInfo.java

package com.iotplatform.client.dto;


public class CondiotionDeviceInfo
{

    public CondiotionDeviceInfo()
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

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public String toString()
    {
        return (new StringBuilder("CondiotionDeviceInfo [deviceId=")).append(deviceId).append(", path=").append(path).append("]").toString();
    }

    String deviceId;
    String path;
}
