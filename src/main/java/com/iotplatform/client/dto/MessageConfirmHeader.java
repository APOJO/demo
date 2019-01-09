// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MessageConfirmHeader.java

package com.iotplatform.client.dto;


public class MessageConfirmHeader
{

    public MessageConfirmHeader()
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

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String toString()
    {
        return (new StringBuilder("MessageConfirmHeader [requestId=")).append(requestId).append(", from=").append(from).append(", to=").append(to).append(", status=").append(status).append(", timestamp=").append(timestamp).append("]").toString();
    }

    private String requestId;
    private String from;
    private String to;
    private String status;
    private String timestamp;
}
