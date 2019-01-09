// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PoserrIoMDTO.java

package com.iotplatform.client.dto;


public class PoserrIoMDTO
{

    public PoserrIoMDTO()
    {
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String getResid()
    {
        return resid;
    }

    public void setResid(String resid)
    {
        this.resid = resid;
    }

    public String getAdd_info()
    {
        return add_info;
    }

    public void setAdd_info(String add_info)
    {
        this.add_info = add_info;
    }

    public String toString()
    {
        return (new StringBuilder("PoserrIoMDTO [time=")).append(time).append(", resid=").append(resid).append(", add_info=").append(add_info).append("]").toString();
    }

    private String time;
    private String resid;
    private String add_info;
}
