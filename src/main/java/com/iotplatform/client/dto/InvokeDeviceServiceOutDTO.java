// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   InvokeDeviceServiceOutDTO.java

package com.iotplatform.client.dto;


public class InvokeDeviceServiceOutDTO
{

    public InvokeDeviceServiceOutDTO()
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
        return (new StringBuilder("InvokeDeviceServiceOutDTO [requestId=")).append(requestId).append(", status=").append(status).append(", timeStamp=").append(timeStamp).append("]").toString();
    }

    private String requestId;
    private String status;
    private String timeStamp;
}
