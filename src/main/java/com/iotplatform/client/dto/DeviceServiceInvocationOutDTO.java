// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceServiceInvocationOutDTO.java

package com.iotplatform.client.dto;


/**
 * @deprecated Class DeviceServiceInvocationOutDTO is deprecated
 */

public class DeviceServiceInvocationOutDTO
{

    public DeviceServiceInvocationOutDTO()
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

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getTimeStamp()
    {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp)
    {
        this.timeStamp = timeStamp;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceServiceInvocationOutDTO [requestId=")).append(requestId).append(", status=").append(status).append(", timeStamp=").append(timeStamp).append("]").toString();
    }

    private String requestId;
    private String status;
    private String timeStamp;
}
