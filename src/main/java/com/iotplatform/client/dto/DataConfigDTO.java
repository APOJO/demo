// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataConfigDTO.java

package com.iotplatform.client.dto;


public class DataConfigDTO
{

    public DataConfigDTO()
    {
    }

    public Integer getDataAgingTime()
    {
        return dataAgingTime;
    }

    public void setDataAgingTime(Integer dataAgingTime)
    {
        this.dataAgingTime = dataAgingTime;
    }

    public String toString()
    {
        return (new StringBuilder("DataConfigDTO [dataAgingTime=")).append(dataAgingTime).append("]").toString();
    }

    private Integer dataAgingTime;
}
