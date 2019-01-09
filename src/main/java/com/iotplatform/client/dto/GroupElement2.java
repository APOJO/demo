// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GroupElement2.java

package com.iotplatform.client.dto;

import java.util.List;

public class GroupElement2
{

    public GroupElement2()
    {
        operator = "and";
    }

    public List getElements()
    {
        return elements;
    }

    public void setElements(List elements)
    {
        this.elements = elements;
    }

    public String getOperator()
    {
        return operator;
    }

    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    public String toString()
    {
        return (new StringBuilder("GroupElement2 [elements=")).append(elements).append(", operator=").append(operator).append("]").toString();
    }

    private List elements;
    private String operator;
}
