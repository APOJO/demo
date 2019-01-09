// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ModifyDeviceGroupInDTO.java

package com.iotplatform.client.dto;


public class ModifyDeviceGroupInDTO
{

    public ModifyDeviceGroupInDTO()
    {
        maxDevNum = Integer.valueOf(0);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Integer getMaxDevNum()
    {
        return maxDevNum;
    }

    public void setMaxDevNum(Integer maxDevNum)
    {
        this.maxDevNum = maxDevNum;
    }

    public String toString()
    {
        return (new StringBuilder("ModifyDeviceGroupInDTO [name=")).append(name).append(", description=").append(description).append(", maxDevNum=").append(maxDevNum).append("]").toString();
    }

    private String name;
    private String description;
    private Integer maxDevNum;
}
