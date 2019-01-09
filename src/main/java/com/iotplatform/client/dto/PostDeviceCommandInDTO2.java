// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PostDeviceCommandInDTO2.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            CommandDTOV4

public class PostDeviceCommandInDTO2
{

    public PostDeviceCommandInDTO2()
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

    public CommandDTOV4 getCommand()
    {
        return command;
    }

    public void setCommand(CommandDTOV4 command)
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

    public Integer getMaxRetransmit()
    {
        return maxRetransmit;
    }

    public void setMaxRetransmit(Integer maxRetransmit)
    {
        this.maxRetransmit = maxRetransmit;
    }

    public String toString()
    {
        return (new StringBuilder("PostDeviceCommandInDTO2 [deviceId=")).append(deviceId).append(", command=").append(command).append(", callbackUrl=").append(callbackUrl).append(", expireTime=").append(expireTime).append(", maxRetransmit=").append(maxRetransmit).append("]").toString();
    }

    private String deviceId;
    private CommandDTOV4 command;
    private String callbackUrl;
    private Integer expireTime;
    private Integer maxRetransmit;
}
