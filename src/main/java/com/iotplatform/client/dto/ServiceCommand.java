// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ServiceCommand.java

package com.iotplatform.client.dto;

import java.util.List;

public class ServiceCommand
{

    public ServiceCommand()
    {
    }

    public String getCommandName()
    {
        return commandName;
    }

    public void setCommandName(String commandName)
    {
        this.commandName = commandName;
    }

    public List getParas()
    {
        return paras;
    }

    public void setParas(List paras)
    {
        this.paras = paras;
    }

    public List getResponses()
    {
        return responses;
    }

    public void setResponses(List responses)
    {
        this.responses = responses;
    }

    public String toString()
    {
        return (new StringBuilder("ServiceCommand [commandName=")).append(commandName).append(", paras=").append(paras).append(", responses=").append(responses).append("]").toString();
    }

    private String commandName;
    private List paras;
    private List responses;
}
