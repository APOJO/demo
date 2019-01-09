// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifyServiceInfoChangedDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            ServiceInfo

public class NotifyServiceInfoChangedDTO
{

    public NotifyServiceInfoChangedDTO()
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

    public String getServiceId()
    {
        return serviceId;
    }

    public void setServiceId(String serviceId)
    {
        this.serviceId = serviceId;
    }

    public String getServiceType()
    {
        return serviceType;
    }

    public void setServiceType(String serviceType)
    {
        this.serviceType = serviceType;
    }

    public ServiceInfo getServiceInfo()
    {
        return serviceInfo;
    }

    public void setServiceInfo(ServiceInfo serviceInfo)
    {
        this.serviceInfo = serviceInfo;
    }

    public String toString()
    {
        return (new StringBuilder("NotifyServiceInfoChangedDTO [notifyType=")).append(notifyType).append(", deviceId=").append(deviceId).append(", gatewayId=").append(gatewayId).append(", serviceId=").append(serviceId).append(", serviceType=").append(serviceType).append(", serviceInfo=").append(serviceInfo).append("]").toString();
    }

    private String notifyType;
    private String deviceId;
    private String gatewayId;
    private String serviceId;
    private String serviceType;
    private ServiceInfo serviceInfo;
}
