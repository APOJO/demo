// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SubDeviceDataInDTO.java

package com.iotplatform.client.dto;


public class SubDeviceDataInDTO
{

    public SubDeviceDataInDTO()
    {
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String getNotifyType()
    {
        return notifyType;
    }

    public void setNotifyType(String notifyType)
    {
        this.notifyType = notifyType;
    }

    public String getCallbackUrl()
    {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl)
    {
        this.callbackUrl = callbackUrl;
    }

    public String toString()
    {
        return (new StringBuilder("SubDeviceDataInDTO [appId=")).append(appId).append(", notifyType=").append(notifyType).append(", callbackUrl=").append(callbackUrl).append("]").toString();
    }

    private String appId;
    private String notifyType;
    private String callbackUrl;
}
