// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceGroupInfo.java

package com.iotplatform.client.dto;


public class DeviceGroupInfo
{

    public DeviceGroupInfo()
    {
    }

    public String getGroupId()
    {
        return groupId;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceGroupInfo [groupId=")).append(groupId).append(", path=").append(path).append("]").toString();
    }

    String groupId;
    String path;
}
