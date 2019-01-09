// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CommandNA2CloudHeader.java

package com.iotplatform.client.dto;


public class CommandNA2CloudHeader
{

    public CommandNA2CloudHeader()
    {
    }

    public String getMode()
    {
        return mode;
    }

    public void setMode(String mode)
    {
        this.mode = mode;
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

    public String getToType()
    {
        return toType;
    }

    public void setToType(String toType)
    {
        this.toType = toType;
    }

    public String getMethod()
    {
        return method;
    }

    public void setMethod(String method)
    {
        this.method = method;
    }

    public String getRequestId()
    {
        return requestId;
    }

    public void setRequestId(String requestId)
    {
        this.requestId = requestId;
    }

    public String getCallbackURL()
    {
        return callbackURL;
    }

    public void setCallbackURL(String callbackURL)
    {
        this.callbackURL = callbackURL;
    }

    public String toString()
    {
        return (new StringBuilder("CommandNA2CloudHeader [mode=")).append(mode).append(", from=").append(from).append(", to=").append(to).append(", toType=").append(toType).append(", method=").append(method).append(", requestId=").append(requestId).append(", callbackURL=").append(callbackURL).append("]").toString();
    }

    private String mode;
    private String from;
    private String to;
    private String toType;
    private String method;
    private String requestId;
    private String callbackURL;
}
