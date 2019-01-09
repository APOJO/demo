// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDeviceCapabilitiesOutDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class QueryDeviceCapabilitiesOutDTO
{

    public QueryDeviceCapabilitiesOutDTO()
    {
    }

    public List getDeviceCapabilities()
    {
        return deviceCapabilities;
    }

    public void setDeviceCapabilities(List deviceCapabilities)
    {
        this.deviceCapabilities = deviceCapabilities;
    }

    public String toString()
    {
        return (new StringBuilder("QueryDeviceCapabilitiesOutDTO [deviceCapabilities=")).append(deviceCapabilities).append("]").toString();
    }

    private List deviceCapabilities;
}
