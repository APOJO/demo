// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CoordinateReferenceSystem.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            Identifier

public class CoordinateReferenceSystem
{

    public CoordinateReferenceSystem()
    {
    }

    public Identifier getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier(Identifier identifier)
    {
        this.identifier = identifier;
    }

    public String toString()
    {
        return (new StringBuilder("CoordinateReferenceSystem [identifier=")).append(identifier).append("]").toString();
    }

    private Identifier identifier;
}
