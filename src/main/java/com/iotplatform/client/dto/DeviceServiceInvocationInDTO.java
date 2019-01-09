// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceServiceInvocationInDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            CommandDTO

/**
 * @deprecated Class DeviceServiceInvocationInDTO is deprecated
 */

public class DeviceServiceInvocationInDTO
{

    public DeviceServiceInvocationInDTO()
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

    public String getServiceId()
    {
        return serviceId;
    }

    public void setServiceId(String serviceId)
    {
        this.serviceId = serviceId;
    }

    public CommandDTO getMessage()
    {
        return message;
    }

    public void setMessage(CommandDTO message)
    {
        this.message = message;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceServiceInvocationInDTO [deviceId=")).append(deviceId).append(", serviceId=").append(serviceId).append(", message=").append(message).append("]").toString();
    }

    private String deviceId;
    private String serviceId;
    private CommandDTO message;
}
