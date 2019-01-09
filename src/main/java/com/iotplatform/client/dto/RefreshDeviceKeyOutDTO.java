// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RefreshDeviceKeyOutDTO.java

package com.iotplatform.client.dto;


public class RefreshDeviceKeyOutDTO
{

    public RefreshDeviceKeyOutDTO()
    {
    }

    public String getVerifyCode()
    {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode)
    {
        this.verifyCode = verifyCode;
    }

    public Integer getTimeout()
    {
        return timeout;
    }

    public void setTimeout(Integer timeout)
    {
        this.timeout = timeout;
    }

    public String toString()
    {
        return (new StringBuilder("RefreshDeviceKeyOutDTO [verifyCode=")).append(verifyCode).append(", timeout=").append(timeout).append("]").toString();
    }

    private String verifyCode;
    private Integer timeout;
}
