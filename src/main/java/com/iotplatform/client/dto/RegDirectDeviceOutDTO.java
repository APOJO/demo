// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RegDirectDeviceOutDTO.java

package com.iotplatform.client.dto;


public class RegDirectDeviceOutDTO
{

    public RegDirectDeviceOutDTO()
    {
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
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

    public String getPsk()
    {
        return psk;
    }

    public void setPsk(String psk)
    {
        this.psk = psk;
    }

    public String toString()
    {
        return (new StringBuilder("DirectDeviceRegOutDTO [deviceId=")).append(deviceId).append(", verifyCode=").append(verifyCode).append(", timeout=").append(timeout).append(", psk=").append(psk).append("]").toString();
    }

    private String deviceId;
    private String verifyCode;
    private Integer timeout;
    private String psk;
}
