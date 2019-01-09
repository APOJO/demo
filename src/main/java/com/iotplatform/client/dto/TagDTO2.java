// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TagDTO2.java

package com.iotplatform.client.dto;


public class TagDTO2
{

    public TagDTO2()
    {
    }

    public String getTagName()
    {
        return tagName;
    }

    public void setTagName(String tagName)
    {
        this.tagName = tagName;
    }

    public String getTagValue()
    {
        return tagValue;
    }

    public void setTagValue(String tagValue)
    {
        this.tagValue = tagValue;
    }

    public String toString()
    {
        return (new StringBuilder("TagDTO2 [tagName=")).append(tagName).append(", tagValue=").append(tagValue).append("]").toString();
    }

    private String tagName;
    private String tagValue;
}
