// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifyDeviceDataChangedDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            DeviceService

public class NotifyDeviceDataChangedDTO
{

    public NotifyDeviceDataChangedDTO()
    {
    }

    public String getNotifyType()
    {
        return notifyType;
    }

    public void setNotifyType(String notifyType)
    {
        this.notifyType = notifyType;
    }

    public String getRequestId()
    {
        return requestId;
    }

    public void setRequestId(String requestId)
    {
        this.requestId = requestId;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getGatewayId()
    {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId)
    {
        this.gatewayId = gatewayId;
    }

    public DeviceService getService()
    {
        return service;
    }

    public void setService(DeviceService service)
    {
        this.service = service;
    }

    public String toString()
    {
        return (new StringBuilder("NotifyDeviceDataChangedDTO [notifyType=")).append(notifyType).append(", requestId=").append(requestId).append(", deviceId=").append(deviceId).append(", gatewayId=").append(gatewayId).append(", service=").append(service).append("]").toString();
    }

    private String notifyType;
    private String requestId;
    private String deviceId;
    private String gatewayId;
    private DeviceService service;
}
