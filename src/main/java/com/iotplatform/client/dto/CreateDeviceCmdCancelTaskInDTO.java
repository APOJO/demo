// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CreateDeviceCmdCancelTaskInDTO.java

package com.iotplatform.client.dto;


public class CreateDeviceCmdCancelTaskInDTO
{

    public CreateDeviceCmdCancelTaskInDTO()
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
        return (new StringBuilder("CreateDeviceCmdCancelTaskInDTO [deviceId=")).append(deviceId).append("]").toString();
    }

    private String deviceId;
}
