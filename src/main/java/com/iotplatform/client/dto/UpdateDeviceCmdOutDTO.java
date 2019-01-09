// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UpdateDeviceCmdOutDTO.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.iotplatform.client.dto:
//            AsynCommandDTO

/**
 * @deprecated Class UpdateDeviceCmdOutDTO is deprecated
 */

public class UpdateDeviceCmdOutDTO
{

    public UpdateDeviceCmdOutDTO()
    {
    }

    public String getCommandId()
    {
        return commandId;
    }

    public void setCommandId(String commandId)
    {
        this.commandId = commandId;
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
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

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public ObjectNode getResult()
    {
        return result;
    }

    public void setResult(ObjectNode result)
    {
        this.result = result;
    }

    public String getCreationTime()
    {
        return creationTime;
    }

    public void setCreationTime(String creationTime)
    {
        this.creationTime = creationTime;
    }

    public String getExecuteTime()
    {
        return executeTime;
    }

    public void setExecuteTime(String executeTime)
    {
        this.executeTime = executeTime;
    }

    public String getPlatformIssuedTime()
    {
        return platformIssuedTime;
    }

    public void setPlatformIssuedTime(String platformIssuedTime)
    {
        this.platformIssuedTime = platformIssuedTime;
    }

    public String getDeliveredTime()
    {
        return deliveredTime;
    }

    public void setDeliveredTime(String deliveredTime)
    {
        this.deliveredTime = deliveredTime;
    }

    public Integer getIssuedTimes()
    {
        return issuedTimes;
    }

    public void setIssuedTimes(Integer issuedTimes)
    {
        this.issuedTimes = issuedTimes;
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
        return (new StringBuilder("UpdateDeviceCommandOutDTO [commandId=")).append(commandId).append(", appId=").append(appId).append(", deviceId=").append(deviceId).append(", command=").append(command).append(", callbackUrl=").append(callbackUrl).append(", expireTime=").append(expireTime).append(", status=").append(status).append(", result=").append(result).append(", creationTime=").append(creationTime).append(", executeTime=").append(executeTime).append(", platformIssuedTime=").append(platformIssuedTime).append(", deliveredTime=").append(deliveredTime).append(", issuedTimes=").append(issuedTimes).append(", maxRetransmit=").append(maxRetransmit).append("]").toString();
    }

    private String commandId;
    private String appId;
    private String deviceId;
    private AsynCommandDTO command;
    private String callbackUrl;
    private Integer expireTime;
    private String status;
    private ObjectNode result;
    private String creationTime;
    private String executeTime;
    private String platformIssuedTime;
    private String deliveredTime;
    private Integer issuedTimes;
    private Integer maxRetransmit;
}
