// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AuthRefreshOutDTO.java

package com.iotplatform.client.dto;


public class AuthRefreshOutDTO
{

    public AuthRefreshOutDTO()
    {
    }

    public String getAccessToken()
    {
        return accessToken;
    }

    public void setAccessToken(String accessToken)
    {
        this.accessToken = accessToken;
    }

    public String getTokenType()
    {
        return tokenType;
    }

    public void setTokenType(String tokenType)
    {
        this.tokenType = tokenType;
    }

    public Integer getExpiresIn()
    {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn)
    {
        this.expiresIn = expiresIn;
    }

    public String getScope()
    {
        return scope;
    }

    public void setScope(String scope)
    {
        this.scope = scope;
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
        return (new StringBuilder("AuthRefreshOutDTO [accessToken=")).append(accessToken).append(", tokenType=").append(tokenType).append(", expiresIn=").append(expiresIn).append(", scope=").append(scope).append(", refreshToken=").append(refreshToken).append("]").toString();
    }

    private String accessToken;
    private String tokenType;
    private Integer expiresIn;
    private String scope;
    private String refreshToken;
}
