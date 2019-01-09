// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AuthInDTO.java

package com.iotplatform.client.dto;


public class AuthInDTO
{

    public AuthInDTO()
    {
    }

    public String getSecret()
    {
        return secret;
    }

    public void setSecret(String secret)
    {
        this.secret = secret;
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String toString()
    {
        return (new StringBuilder("AuthDTO [secret=")).append(secret).append(", appId=").append(appId).append("]").toString();
    }

    private String secret;
    private String appId;
}
