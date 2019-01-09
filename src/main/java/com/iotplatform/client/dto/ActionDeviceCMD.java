// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ActionDeviceCMD.java

package com.iotplatform.client.dto;

import java.util.List;

// Referenced classes of package com.iotplatform.client.dto:
//            CMD

public class ActionDeviceCMD
{

    public ActionDeviceCMD()
    {
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getAppKey()
    {
        return appKey;
    }

    public void setAppKey(String appKey)
    {
        this.appKey = appKey;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public CMD getCmd()
    {
        return cmd;
    }

    public void setCmd(CMD cmd)
    {
        this.cmd = cmd;
    }

    public String getCmdVersion()
    {
        return cmdVersion;
    }

    public void setCmdVersion(String cmdVersion)
    {
        this.cmdVersion = cmdVersion;
    }

    public Object getCmdMetaData()
    {
        return cmdMetaData;
    }

    public void setCmdMetaData(Object cmdMetaData)
    {
        this.cmdMetaData = cmdMetaData;
    }

    public Object getTransInfo()
    {
        return transInfo;
    }

    public void setTransInfo(Object transInfo)
    {
        this.transInfo = transInfo;
    }

    public List getDeviceCommandActionPreProcessors()
    {
        return deviceCommandActionPreProcessors;
    }

    public void setDeviceCommandActionPreProcessors(List deviceCommandActionPreProcessors)
    {
        this.deviceCommandActionPreProcessors = deviceCommandActionPreProcessors;
    }

    public String toString()
    {
        return (new StringBuilder("ActionDeviceCMD [type=")).append(type).append(", id=").append(id).append(", appKey=").append(appKey).append(", deviceId=").append(deviceId).append(", cmd=").append(cmd).append(", cmdVersion=").append(cmdVersion).append(", cmdMetaData=").append(cmdMetaData).append(", transInfo=").append(transInfo).append(", deviceCommandActionPreProcessors=").append(deviceCommandActionPreProcessors).append("]").toString();
    }

    String type;
    String id;
    String appKey;
    String deviceId;
    CMD cmd;
    String cmdVersion;
    Object cmdMetaData;
    Object transInfo;
    List deviceCommandActionPreProcessors;
}
