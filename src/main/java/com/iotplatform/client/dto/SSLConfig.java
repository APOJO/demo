// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SSLConfig.java

package com.iotplatform.client.dto;


public class SSLConfig
{

    public SSLConfig()
    {
    }

    public String getSelfCertPath()
    {
        return selfCertPath;
    }

    public void setSelfCertPath(String selfCertPath)
    {
        this.selfCertPath = selfCertPath;
    }

    public String getSelfCertPwd()
    {
        return selfCertPwd;
    }

    public void setSelfCertPwd(String selfCertPwd)
    {
        this.selfCertPwd = selfCertPwd;
    }

    public String getTrustCAPath()
    {
        return trustCAPath;
    }

    public void setTrustCAPath(String trustCAPath)
    {
        this.trustCAPath = trustCAPath;
    }

    public String getTrustCAPwd()
    {
        return trustCAPwd;
    }

    public void setTrustCAPwd(String trustCAPwd)
    {
        this.trustCAPwd = trustCAPwd;
    }

    public String toString()
    {
        return (new StringBuilder("SSLConfig [selfCertPath=")).append(selfCertPath).append(", selfCertPwd=").append(selfCertPwd).append(", trustCAPath=").append(trustCAPath).append(", trustCAPwd=").append(trustCAPwd).append("]").toString();
    }

    private String selfCertPath;
    private String selfCertPwd;
    private String trustCAPath;
    private String trustCAPwd;
}
