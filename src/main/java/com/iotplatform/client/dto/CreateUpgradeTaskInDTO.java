// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CreateUpgradeTaskInDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            OperateDevices, OperatePolicy

public class CreateUpgradeTaskInDTO
{

    public CreateUpgradeTaskInDTO()
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

    public OperateDevices getTargets()
    {
        return targets;
    }

    public void setTargets(OperateDevices targets)
    {
        this.targets = targets;
    }

    public OperatePolicy getPolicy()
    {
        return policy;
    }

    public void setPolicy(OperatePolicy policy)
    {
        this.policy = policy;
    }

    public String toString()
    {
        return (new StringBuilder("CreateUpgradeTaskInDTO [fileId=")).append(fileId).append(", targets=").append(targets).append(", policy=").append(policy).append("]").toString();
    }

    private String fileId;
    private OperateDevices targets;
    private OperatePolicy policy;
}
