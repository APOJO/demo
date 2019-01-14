// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceService.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;


// Referenced classes of package com.iotplatform.client.dto:
//            ServiceInfo

public class DeviceService
{

    public DeviceService()
    {
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

    public ObjectNode getData()
    {
        return data;
    }

    public void setData(ObjectNode data)
    {
        this.data = data;
    }

    public String getEventTime()
    {
        return eventTime;
    }

    public void setEventTime(String eventTime)
    {
        this.eventTime = eventTime;
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
        return (new StringBuilder("DeviceService [serviceId=")).append(serviceId).append(", serviceType=").append(serviceType).append(", data=").append(data).append(", eventTime=").append(eventTime).append(", serviceInfo=").append(serviceInfo).append("]").toString();
    }
    private String serviceId;
    private String serviceType;
    private ObjectNode data;
    private String eventTime;
    private ServiceInfo serviceInfo;

}
