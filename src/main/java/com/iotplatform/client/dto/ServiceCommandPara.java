// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ServiceCommandPara.java

package com.iotplatform.client.dto;

import java.util.List;

public class ServiceCommandPara
{

    public ServiceCommandPara()
    {
    }

    public String getParaName()
    {
        return paraName;
    }

    public void setParaName(String paraName)
    {
        this.paraName = paraName;
    }

    public String getDataType()
    {
        return dataType;
    }

    public void setDataType(String dataType)
    {
        this.dataType = dataType;
    }

    public boolean isRequired()
    {
        return required;
    }

    public void setRequired(boolean required)
    {
        this.required = required;
    }

    public String getMin()
    {
        return min;
    }

    public void setMin(String min)
    {
        this.min = min;
    }

    public String getMax()
    {
        return max;
    }

    public void setMax(String max)
    {
        this.max = max;
    }

    public double getStep()
    {
        return step;
    }

    public void setStep(double step)
    {
        this.step = step;
    }

    public int getMaxLength()
    {
        return maxLength;
    }

    public void setMaxLength(int maxLength)
    {
        this.maxLength = maxLength;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public List getEnumList()
    {
        return enumList;
    }

    public void setEnumList(List enumList)
    {
        this.enumList = enumList;
    }

    public String toString()
    {
        return (new StringBuilder("ServiceCommandPara [paraName=")).append(paraName).append(", dataType=").append(dataType).append(", required=").append(required).append(", min=").append(min).append(", max=").append(max).append(", step=").append(step).append(", maxLength=").append(maxLength).append(", unit=").append(unit).append(", enumList=").append(enumList).append("]").toString();
    }

    private String paraName;
    private String dataType;
    private boolean required;
    private String min;
    private String max;
    private double step;
    private int maxLength;
    private String unit;
    private List enumList;
}
