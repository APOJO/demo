// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifyDeviceAddedDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            DeviceInfo

public class NotifyDeviceAddedDTO
{

    public NotifyDeviceAddedDTO()
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

    public String getNodeType()
    {
        return nodeType;
    }

    public void setNodeType(String nodeType)
    {
        this.nodeType = nodeType;
    }

    public DeviceInfo getDeviceInfo()
    {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo)
    {
        this.deviceInfo = deviceInfo;
    }

    public String toString()
    {
        return (new StringBuilder("NotifyDeviceAddedDTO [notifyType=")).append(notifyType).append(", deviceId=").append(deviceId).append(", gatewayId=").append(gatewayId).append(", nodeType=").append(nodeType).append(", deviceInfo=").append(deviceInfo).append("]").toString();
    }

    private String notifyType;
    private String deviceId;
    private String gatewayId;
    private String nodeType;
    private DeviceInfo deviceInfo;
}
