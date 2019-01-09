// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceEventHeader.java

package com.iotplatform.client.dto;


public class DeviceEventHeader
{

    public DeviceEventHeader()
    {
    }

    public String getEventType()
    {
        return eventType;
    }

    public void setEventType(String eventType)
    {
        this.eventType = eventType;
    }

    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getEventTime()
    {
        return eventTime;
    }

    public void setEventTime(String eventTime)
    {
        this.eventTime = eventTime;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getServiceType()
    {
        return serviceType;
    }

    public void setServiceType(String serviceType)
    {
        this.serviceType = serviceType;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceEventHeader [eventType=")).append(eventType).append(", from=").append(from).append(", timestamp=").append(timestamp).append(", eventTime=").append(eventTime).append(", deviceId=").append(deviceId).append(", serviceType=").append(serviceType).append("]").toString();
    }

    private String eventType;
    private String from;
    private String timestamp;
    private String eventTime;
    private String deviceId;
    private String serviceType;
}
