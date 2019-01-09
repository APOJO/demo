// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDeviceRealtimeLocationOutDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            PdIoMDTO, PoserrIoMDTO

public class QueryDeviceRealtimeLocationOutDTO
{

    public QueryDeviceRealtimeLocationOutDTO()
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

    public PdIoMDTO getPd()
    {
        return pd;
    }

    public void setPd(PdIoMDTO pd)
    {
        this.pd = pd;
    }

    public PoserrIoMDTO getPoserr()
    {
        return poserr;
    }

    public void setPoserr(PoserrIoMDTO poserr)
    {
        this.poserr = poserr;
    }

    public String toString()
    {
        return (new StringBuilder("QueryDeviceRealtimeLocationOutDTO [deviceId=")).append(deviceId).append(", pd=").append(pd).append(", poserr=").append(poserr).append("]").toString();
    }

    private String deviceId;
    private PdIoMDTO pd;
    private PoserrIoMDTO poserr;
}
