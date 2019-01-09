// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryUpgradeTaskOutDTO.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.iotplatform.client.dto:
//            OperateDevices, OperatePolicy, OperationStaResult

public class QueryUpgradeTaskOutDTO
{

    public QueryUpgradeTaskOutDTO()
    {
    }

    public String getOperationId()
    {
        return operationId;
    }

    public void setOperationId(String operationId)
    {
        this.operationId = operationId;
    }

    public String getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(String createTime)
    {
        this.createTime = createTime;
    }

    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public String getStopTime()
    {
        return stopTime;
    }

    public void setStopTime(String stopTime)
    {
        this.stopTime = stopTime;
    }

    public String getOperateType()
    {
        return operateType;
    }

    public void setOperateType(String operateType)
    {
        this.operateType = operateType;
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

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public OperationStaResult getStaResult()
    {
        return staResult;
    }

    public void setStaResult(OperationStaResult staResult)
    {
        this.staResult = staResult;
    }

    public ObjectNode getExtendPara()
    {
        return extendPara;
    }

    public void setExtendPara(ObjectNode extendPara)
    {
        this.extendPara = extendPara;
    }

    public String toString()
    {
        return (new StringBuilder("QueryUpgradeTaskOutDTO [operationId=")).append(operationId).append(", createTime=").append(createTime).append(", startTime=").append(startTime).append(", stopTime=").append(stopTime).append(", operateType=").append(operateType).append(", targets=").append(targets).append(", policy=").append(policy).append(", status=").append(status).append(", staResult=").append(staResult).append(", extendPara=").append(extendPara).append("]").toString();
    }

    private String operationId;
    private String createTime;
    private String startTime;
    private String stopTime;
    private String operateType;
    private OperateDevices targets;
    private OperatePolicy policy;
    private String status;
    private OperationStaResult staResult;
    private ObjectNode extendPara;
}
