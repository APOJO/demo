// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PostDeviceCommandInDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            AsynCommandDTO

/**
 * @deprecated Class PostDeviceCommandInDTO is deprecated
 */

public class PostDeviceCommandInDTO
{

    public PostDeviceCommandInDTO()
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

    public AsynCommandDTO getCommand()
    {
        return command;
    }

    public void setCommand(AsynCommandDTO command)
    {
        this.command = command;
    }

    public String getCallbackUrl()
    {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl)
    {
        this.callbackUrl = callbackUrl;
    }

    public Integer getExpireTime()
    {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime)
    {
        this.expireTime = expireTime;
    }

    public String toString()
    {
        return (new StringBuilder("PostDeviceCommandInDTO [deviceId=")).append(deviceId).append(", command=").append(command).append(", callbackUrl=").append(callbackUrl).append(", expireTime=").append(expireTime).append("]").toString();
    }

    private String deviceId;
    private AsynCommandDTO command;
    private String callbackUrl;
    private Integer expireTime;
}
