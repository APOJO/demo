// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PdIoMDTO.java

package com.iotplatform.client.dto;


public class PdIoMDTO
{

    public PdIoMDTO()
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

    public String getUtcOff()
    {
        return utcOff;
    }

    public void setUtcOff(String utcOff)
    {
        this.utcOff = utcOff;
    }

    public String getSrsName()
    {
        return srsName;
    }

    public void setSrsName(String srsName)
    {
        this.srsName = srsName;
    }

    public String getX()
    {
        return X;
    }

    public void setX(String x)
    {
        X = x;
    }

    public String getY()
    {
        return Y;
    }

    public void setY(String y)
    {
        Y = y;
    }

    public String getRadius()
    {
        return radius;
    }

    public void setRadius(String radius)
    {
        this.radius = radius;
    }

    public String toString()
    {
        return (new StringBuilder("PdIoMDTO [time=")).append(time).append(", utcOff=").append(utcOff).append(", srsName=").append(srsName).append(", X=").append(X).append(", Y=").append(Y).append(", radius=").append(radius).append("]").toString();
    }

    private String time;
    private String utcOff;
    private String srsName;
    private String X;
    private String Y;
    private String radius;
}
