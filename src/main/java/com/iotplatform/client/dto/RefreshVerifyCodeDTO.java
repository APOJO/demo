// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RefreshVerifyCodeDTO.java

package com.iotplatform.client.dto;


/**
 * @deprecated Class RefreshVerifyCodeDTO is deprecated
 */

public class RefreshVerifyCodeDTO
{

    public RefreshVerifyCodeDTO()
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
        return (new StringBuilder("RefreshVerifyCodeDTO [verifyCode=")).append(verifyCode).append(", nodeId=").append(nodeId).append(", timeout=").append(timeout).append("]").toString();
    }

    private String verifyCode;
    private String nodeId;
    private Integer timeout;
}
