// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EncryptSetInDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            DmServicesRequestDTO

/**
 * @deprecated Class EncryptSetInDTO is deprecated
 */

public class EncryptSetInDTO
{

    public EncryptSetInDTO()
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

    public String getServiceType()
    {
        return serviceType;
    }

    public void setServiceType(String serviceType)
    {
        this.serviceType = serviceType;
    }

    public DmServicesRequestDTO getRequest()
    {
        return request;
    }

    public void setRequest(DmServicesRequestDTO request)
    {
        this.request = request;
    }

    public String toString()
    {
        return (new StringBuilder("EncryptSetInDTO [deviceId=")).append(deviceId).append(", serviceType=").append(serviceType).append(", request=").append(request).append("]").toString();
    }

    private String deviceId;
    private String serviceType;
    private DmServicesRequestDTO request;
}
