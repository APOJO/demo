// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceCmdCancelTaskInDTO.java

package com.iotplatform.client.dto;


/**
 * @deprecated Class DeviceCmdCancelTaskInDTO is deprecated
 */

public class DeviceCmdCancelTaskInDTO
{

    public DeviceCmdCancelTaskInDTO()
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

    public String toString()
    {
        return (new StringBuilder("DeviceCmdCancelTaskInDTO [deviceId=")).append(deviceId).append("]").toString();
    }

    private String deviceId;
}
