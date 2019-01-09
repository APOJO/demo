// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifyNBCommandStatusChangedDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            NBCommandResult

public class NotifyNBCommandStatusChangedDTO
{

    public NotifyNBCommandStatusChangedDTO()
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

    public String getCommandId()
    {
        return commandId;
    }

    public void setCommandId(String commandId)
    {
        this.commandId = commandId;
    }

    public NBCommandResult getResult()
    {
        return result;
    }

    public void setResult(NBCommandResult result)
    {
        this.result = result;
    }

    public String toString()
    {
        return (new StringBuilder("NotifyNBCommandResultDTO [deviceId=")).append(deviceId).append(", commandId=").append(commandId).append(", result=").append(result).append("]").toString();
    }

    private String deviceId;
    private String commandId;
    private NBCommandResult result;
}
