// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GroupElement.java

package com.iotplatform.client.dto;

import java.util.List;

/**
 * @deprecated Class GroupElement is deprecated
 */

public class GroupElement
{

    public GroupElement()
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
        return (new StringBuilder("GroupElement [elements=")).append(elements).append(", operator=").append(operator).append("]").toString();
    }

    private List elements;
    private String operator;
}
