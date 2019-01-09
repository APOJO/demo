// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RegDirectDeviceInDTO2.java

package com.iotplatform.client.dto;


public class RegDirectDeviceInDTO2
{

    public RegDirectDeviceInDTO2()
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

    public String getNodeId()
    {
        return nodeId;
    }

    public void setNodeId(String nodeId)
    {
        this.nodeId = nodeId;
    }

    public String getPsk()
    {
        return psk;
    }

    public void setPsk(String psk)
    {
        this.psk = psk;
    }

    public String getEndUserId()
    {
        return endUserId;
    }

    public void setEndUserId(String endUserId)
    {
        this.endUserId = endUserId;
    }

    public Integer getTimeout()
    {
        return timeout;
    }

    public void setTimeout(Integer timeout)
    {
        this.timeout = timeout;
    }

    public Boolean getIsSecure()
    {
        return isSecure;
    }

    public void setIsSecure(Boolean isSecure)
    {
        this.isSecure = isSecure;
    }

    public String toString()
    {
        return (new StringBuilder("RegDirectDeviceVerModeInDTO [verifyCode=")).append(verifyCode).append(", nodeId=").append(nodeId).append(", psk=").append(psk).append(", endUserId=").append(endUserId).append(", timeout=").append(timeout).append(", isSecure").append(isSecure).append("]").toString();
    }

    private String verifyCode;
    private String nodeId;
    private String psk;
    private String endUserId;
    private Integer timeout;
    private Boolean isSecure;
}
