// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GroupExpress2.java

package com.iotplatform.client.dto;

import java.util.List;

public class GroupExpress2
{

    public GroupExpress2()
    {
        operator = "and";
    }

    public String getOperator()
    {
        return operator;
    }

    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    public List getGroupElements()
    {
        return groupElements;
    }

    public void setGroupElements(List groupElements)
    {
        this.groupElements = groupElements;
    }

    public String toString()
    {
        return (new StringBuilder("GroupExpress [operator=")).append(operator).append(", groupElements=").append(groupElements).append("]").toString();
    }

    private String operator;
    private List groupElements;
}
