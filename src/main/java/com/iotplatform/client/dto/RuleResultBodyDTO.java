// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RuleResultBodyDTO.java

package com.iotplatform.client.dto;


public class RuleResultBodyDTO
{

    public RuleResultBodyDTO()
    {
    }

    public String getResult_code()
    {
        return result_code;
    }

    public void setResult_code(String result_code)
    {
        this.result_code = result_code;
    }

    public String getResult_desc()
    {
        return result_desc;
    }

    public void setResult_desc(String result_desc)
    {
        this.result_desc = result_desc;
    }

    public String toString()
    {
        return (new StringBuilder("RuleResultBodyDTO [result_code=")).append(result_code).append(", result_desc=").append(result_desc).append("]").toString();
    }

    private String result_code;
    private String result_desc;
}
