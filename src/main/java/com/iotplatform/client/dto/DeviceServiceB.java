// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceServiceB.java

package com.iotplatform.client.dto;

import java.util.Map;

public class DeviceServiceB
{

    public DeviceServiceB()
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

    public Map getReportedProps()
    {
        return reportedProps;
    }

    public void setReportedProps(Map reportedProps)
    {
        this.reportedProps = reportedProps;
    }

    public Map getDesiredProps()
    {
        return desiredProps;
    }

    public void setDesiredProps(Map desiredProps)
    {
        this.desiredProps = desiredProps;
    }

    public String getEventTime()
    {
        return eventTime;
    }

    public void setEventTime(String eventTime)
    {
        this.eventTime = eventTime;
    }

    public String getServiceType()
    {
        return serviceType;
    }

    public void setServiceType(String serviceType)
    {
        this.serviceType = serviceType;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceServiceB [serviceId=")).append(serviceId).append(", reportedProps=").append(reportedProps).append(", desiredProps=").append(desiredProps).append(", eventTime=").append(eventTime).append(", serviceType=").append(serviceType).append("]").toString();
    }

    private String serviceId;
    private Map reportedProps;
    private Map desiredProps;
    private String eventTime;
    private String serviceType;
}
