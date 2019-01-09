// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDeviceRealtimeLocationInDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            CoordinateReferenceSystem

public class QueryDeviceRealtimeLocationInDTO
{

    public QueryDeviceRealtimeLocationInDTO()
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

    public int getHorAcc()
    {
        return horAcc;
    }

    public void setHorAcc(int horAcc)
    {
        this.horAcc = horAcc;
    }

    public CoordinateReferenceSystem getGeoInfo()
    {
        return geoInfo;
    }

    public void setGeoInfo(CoordinateReferenceSystem geoInfo)
    {
        this.geoInfo = geoInfo;
    }

    public String toString()
    {
        return (new StringBuilder("QueryDeviceRealtimeLocationInDTO [deviceId=")).append(deviceId).append(", horAcc=").append(horAcc).append(", geoInfo=").append(geoInfo).append("]").toString();
    }

    private String deviceId;
    private int horAcc;
    private CoordinateReferenceSystem geoInfo;
}
