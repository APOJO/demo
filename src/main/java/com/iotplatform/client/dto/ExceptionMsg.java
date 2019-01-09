// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ExceptionMsg.java

package com.iotplatform.client.dto;


public class ExceptionMsg
{

    public ExceptionMsg()
    {
    }

    public String getError_code()
    {
        return error_code;
    }

    public void setError_code(String error_code)
    {
        this.error_code = error_code;
    }

    public String getError_desc()
    {
        return error_desc;
    }

    public void setError_desc(String error_desc)
    {
        this.error_desc = error_desc;
    }

    public String toString()
    {
        return (new StringBuilder("ExceptionMsg [error_code=")).append(error_code).append(", error_desc=").append(error_desc).append("]").toString();
    }

    private String error_code;
    private String error_desc;
}
