// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceConfigDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            DataConfigDTO

public class DeviceConfigDTO
{

    public DeviceConfigDTO()
    {
    }

    public DataConfigDTO getDataConfig()
    {
        return dataConfig;
    }

    public void setDataConfig(DataConfigDTO dataConfig)
    {
        this.dataConfig = dataConfig;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceConfigDTO [dataConfig=")).append(dataConfig).append("]").toString();
    }

    private DataConfigDTO dataConfig;
}
