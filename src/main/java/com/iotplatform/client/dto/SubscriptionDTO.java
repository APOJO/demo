// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SubscriptionDTO.java

package com.iotplatform.client.dto;


public class SubscriptionDTO
{

    public SubscriptionDTO()
    {
    }

    public String getSubscriptionId()
    {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId)
    {
        this.subscriptionId = subscriptionId;
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
        return (new StringBuilder("SubDeviceDataOutDTO [subscriptionId=")).append(subscriptionId).append(", notifyType=").append(notifyType).append(", callbackUrl=").append(callbackUrl).append("]").toString();
    }

    private String subscriptionId;
    private String notifyType;
    private String callbackUrl;
}
