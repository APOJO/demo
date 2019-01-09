// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ClientInfo.java

package com.iotplatform.client.dto;


public class ClientInfo
{

    public ClientInfo()
    {
    }

    public String getPlatformIp()
    {
        return platformIp;
    }

    public void setPlatformIp(String platformIp)
    {
        this.platformIp = platformIp;
    }

    public String getPlatformPort()
    {
        return platformPort;
    }

    public void setPlatformPort(String platformPort)
    {
        this.platformPort = platformPort;
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

    public String toString()
    {
        return (new StringBuilder("ClientInfo [platformIp=")).append(platformIp).append(", platformPort=").append(platformPort).append(", appId=").append(appId).append(", secret=").append(secret).append("]").toString();
    }

    private String platformIp;
    private String platformPort;
    private String appId;
    private String secret;
}
