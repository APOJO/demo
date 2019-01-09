// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RefreshVerifyCodeOutDTO.java

package com.iotplatform.client.dto;


/**
 * @deprecated Class RefreshVerifyCodeOutDTO is deprecated
 */

public class RefreshVerifyCodeOutDTO
{

    public RefreshVerifyCodeOutDTO()
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
        return (new StringBuilder("RefreshVerifyCodeOutDTO [verifyCode=")).append(verifyCode).append(", timeout=").append(timeout).append("]").toString();
    }

    private String verifyCode;
    private Integer timeout;
}
