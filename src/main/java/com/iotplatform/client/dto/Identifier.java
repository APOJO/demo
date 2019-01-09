// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Identifier.java

package com.iotplatform.client.dto;


public class Identifier
{

    public Identifier()
    {
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCodeSpace()
    {
        return codeSpace;
    }

    public void setCodeSpace(String codeSpace)
    {
        this.codeSpace = codeSpace;
    }

    public String getEdition()
    {
        return edition;
    }

    public void setEdition(String edition)
    {
        this.edition = edition;
    }

    public String toString()
    {
        return (new StringBuilder("Identifier [code=")).append(code).append(", codeSpace=").append(codeSpace).append(", edition=").append(edition).append("]").toString();
    }

    private String code;
    private String codeSpace;
    private String edition;
}
