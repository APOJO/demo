// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryRulesInDTO.java

package com.iotplatform.client.dto;


/**
 * @deprecated Class QueryRulesInDTO is deprecated
 */

public class QueryRulesInDTO
{

    public QueryRulesInDTO()
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

    public String toString()
    {
        return (new StringBuilder("QueryRulesInDTO [name=")).append(name).append(", author=").append(author).append("]").toString();
    }

    private String name;
    private String author;
}
