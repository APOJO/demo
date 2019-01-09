// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryRulesInDTO2.java

package com.iotplatform.client.dto;


public class QueryRulesInDTO2
{

    public QueryRulesInDTO2()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String getSelect()
    {
        return select;
    }

    public void setSelect(String select)
    {
        this.select = select;
    }

    public String toString()
    {
        return (new StringBuilder("QueryRulesInDTO [name=")).append(name).append(", author=").append(author).append(", appId=").append(appId).append(", select=").append(select).append("]").toString();
    }

    private String name;
    private String author;
    private String appId;
    private String select;
}
