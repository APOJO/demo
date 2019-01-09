// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RegDirectDeviceInDTO.java

package com.iotplatform.client.dto;


/**
 * @deprecated Class RegDirectDeviceInDTO is deprecated
 */

public class RegDirectDeviceInDTO
{

    public RegDirectDeviceInDTO()
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

    public String getDeviceName()
    {
        return deviceName;
    }

    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
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

    public String toString()
    {
        return (new StringBuilder("DeviceManageInDTO [verifyCode=")).append(verifyCode).append(", nodeId=").append(nodeId).append(", deviceName=").append(deviceName).append(", psk=").append(psk).append(", endUserId=").append(endUserId).append(", timeout=").append(timeout).append("]").toString();
    }

    private String verifyCode;
    private String nodeId;
    private String deviceName;
    private String psk;
    private String endUserId;
    private Integer timeout;
}
