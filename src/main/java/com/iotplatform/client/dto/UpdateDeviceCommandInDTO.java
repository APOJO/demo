// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UpdateDeviceCommandInDTO.java

package com.iotplatform.client.dto;


public class UpdateDeviceCommandInDTO
{

    public UpdateDeviceCommandInDTO()
    {
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String toString()
    {
        return (new StringBuilder("UpdateDeviceCommandInDTO [status=")).append(status).append("]").toString();
    }

    private String status;
}
