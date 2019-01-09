// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceReg.java

package com.iotplatform.client.dto;


public class DeviceReg
{

    public DeviceReg()
    {
    }

    public String getFileId()
    {
        return fileId;
    }

    public void setFileId(String fileId)
    {
        this.fileId = fileId;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceReg [fileId=")).append(fileId).append("]").toString();
    }

    String fileId;
}
