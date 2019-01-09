// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AuthRefreshInDTO.java

package com.iotplatform.client.dto;


public class AuthRefreshInDTO
{

    public AuthRefreshInDTO()
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

    public String getSecret()
    {
        return secret;
    }

    public void setSecret(String secret)
    {
        this.secret = secret;
    }

    public String getRefreshToken()
    {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken)
    {
        this.refreshToken = refreshToken;
    }

    public String toString()
    {
        return (new StringBuilder("AuthRefreshInDTO [appId=")).append(appId).append(", secret=").append(secret).append(", refreshToken=").append(refreshToken).append("]").toString();
    }

    private String appId;
    private String secret;
    private String refreshToken;
}
