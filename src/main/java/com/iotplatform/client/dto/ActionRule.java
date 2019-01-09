// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ActionRule.java

package com.iotplatform.client.dto;


public class ActionRule
{

    public ActionRule()
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

    public String getRuleId()
    {
        return ruleId;
    }

    public void setRuleId(String ruleId)
    {
        this.ruleId = ruleId;
    }

    public String getCmd()
    {
        return cmd;
    }

    public void setCmd(String cmd)
    {
        this.cmd = cmd;
    }

    public String toString()
    {
        return (new StringBuilder("ActionRule [type=")).append(type).append(", id=").append(id).append(", ruleId=").append(ruleId).append(", cmd=").append(cmd).append("]").toString();
    }

    String type;
    String id;
    String ruleId;
    String cmd;
}
