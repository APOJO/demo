// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceCapabilityDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class DeviceCapabilityDTO
{

    public DeviceCapabilityDTO()
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

    public List getServiceCapabilities()
    {
        return serviceCapabilities;
    }

    public void setServiceCapabilities(List serviceCapabilities)
    {
        this.serviceCapabilities = serviceCapabilities;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceCapabilityDTO [deviceId=")).append(deviceId).append(", serviceCapabilities=").append(serviceCapabilities).append("]").toString();
    }

    private String deviceId;
    private List serviceCapabilities;
}
