// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SubDeviceManagementDataInDTO.java

package com.iotplatform.client.dto;


public class SubDeviceManagementDataInDTO
{

    public SubDeviceManagementDataInDTO()
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
        return (new StringBuilder("SubDeviceManagementDataInDTO [notifyType=")).append(notifyType).append(", callbackUrl=").append(callbackurl).append("]").toString();
    }

    private String notifyType;
    private String callbackurl;
}
