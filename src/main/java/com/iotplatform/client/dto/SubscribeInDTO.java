// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SubscribeInDTO.java

package com.iotplatform.client.dto;


public class SubscribeInDTO
{

    public SubscribeInDTO()
    {
    }

    public String getNotifyType()
    {
        return notifyType;
    }

    public void setNotifyType(String notifyType)
    {
        this.notifyType = notifyType;
    }

    public String getCallbackurl()
    {
        return callbackurl;
    }

    public void setCallbackurl(String callbackurl)
    {
        this.callbackurl = callbackurl;
    }

    public String toString()
    {
        return (new StringBuilder("SubscribeInDTO [notifyType=")).append(notifyType).append(", callbackurl=").append(callbackurl).append("]").toString();
    }

    private String notifyType;
    private String callbackurl;
}
