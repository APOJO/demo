// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RulePreProcessorDTO.java

package com.iotplatform.client.dto;


public class RulePreProcessorDTO
{

    public RulePreProcessorDTO()
    {
    }

    public String getProcessor()
    {
        return processor;
    }

    public void setProcessor(String processor)
    {
        this.processor = processor;
    }

    public Object getParam()
    {
        return param;
    }

    public void setParam(Object param)
    {
        this.param = param;
    }

    public String toString()
    {
        return (new StringBuilder("RulePreProcessorDTO [processor=")).append(processor).append(", param=").append(param).append("]").toString();
    }

    private String processor;
    private Object param;
}
