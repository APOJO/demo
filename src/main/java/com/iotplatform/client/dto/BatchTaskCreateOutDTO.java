// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BatchTaskCreateOutDTO.java

package com.iotplatform.client.dto;


public class BatchTaskCreateOutDTO
{

    public BatchTaskCreateOutDTO()
    {
    }

    public String getTaskID()
    {
        return taskID;
    }

    public void setTaskID(String taskID)
    {
        this.taskID = taskID;
    }

    public String toString()
    {
        return (new StringBuilder("BatchTaskCreateOutDTO [taskID=")).append(taskID).append("]").toString();
    }

    private String taskID;
}
