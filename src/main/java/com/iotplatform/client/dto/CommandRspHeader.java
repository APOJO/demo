// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CommandRspHeader.java

package com.iotplatform.client.dto;


public class CommandRspHeader
{

    public CommandRspHeader()
    {
    }

    public String getRequestId()
    {
        return requestId;
    }

    public void setRequestId(String requestId)
    {
        this.requestId = requestId;
    }

    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getTo()
    {
        return to;
    }

    public void setTo(String to)
    {
        this.to = to;
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

    public String getMethod()
    {
        return method;
    }

    public void setMethod(String method)
    {
        this.method = method;
    }

    public String toString()
    {
        return (new StringBuilder("CommandRspHeader [requestId=")).append(requestId).append(", from=").append(from).append(", to=").append(to).append(", deviceId=").append(deviceId).append(", serviceType=").append(serviceType).append(", method= ").append(method).append("]").toString();
    }

    private String requestId;
    private String from;
    private String to;
    private String deviceId;
    private String serviceType;
    private String method;
}
