// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UpdateDeviceCmdReq.java

package com.iotplatform.client.dto;


public class UpdateDeviceCmdReq
{

    public UpdateDeviceCmdReq()
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
        return (new StringBuilder("UpdateDeviceCommandReq [status=")).append(status).append("]").toString();
    }

    private String status;
}
