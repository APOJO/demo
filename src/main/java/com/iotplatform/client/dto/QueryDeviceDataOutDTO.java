// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDeviceDataOutDTO.java

package com.iotplatform.client.dto;

import java.util.List;

// Referenced classes of package com.iotplatform.client.dto:
//            DeviceInfo

/**
 * @deprecated Class QueryDeviceDataOutDTO is deprecated
 */

public class QueryDeviceDataOutDTO
{

    public QueryDeviceDataOutDTO()
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

    public String getGatewayId()
    {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId)
    {
        this.gatewayId = gatewayId;
    }

    public String getNodeType()
    {
        return nodeType;
    }

    public void setNodeType(String nodeType)
    {
        this.nodeType = nodeType;
    }

    public String getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(String createTime)
    {
        this.createTime = createTime;
    }

    public String getLastModifiedTime()
    {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
    }

    public DeviceInfo getDeviceInfo()
    {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo)
    {
        this.deviceInfo = deviceInfo;
    }

    public List getServices()
    {
        return services;
    }

    public void setServices(List services)
    {
        this.services = services;
    }

    public String toString()
    {
        return (new StringBuilder("QueryDeviceDataOutDTO [deviceId=")).append(deviceId).append(", gatewayId=").append(gatewayId).append(", nodeType=").append(nodeType).append(", createTime=").append(createTime).append(", lastModifiedTime=").append(lastModifiedTime).append(", deviceInfo=").append(deviceInfo).append(", services=").append(services).append("]").toString();
    }

    private String deviceId;
    private String gatewayId;
    private String nodeType;
    private String createTime;
    private String lastModifiedTime;
    private DeviceInfo deviceInfo;
    private List services;
}
