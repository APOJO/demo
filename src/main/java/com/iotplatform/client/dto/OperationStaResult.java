// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OperationStaResult.java

package com.iotplatform.client.dto;


public class OperationStaResult
{

    public OperationStaResult()
    {
    }

    public Integer getTotal()
    {
        return total;
    }

    public void setTotal(Integer total)
    {
        this.total = total;
    }

    public Integer getWait()
    {
        return wait;
    }

    public void setWait(Integer wait)
    {
        this.wait = wait;
    }

    public Integer getProcessing()
    {
        return processing;
    }

    public void setProcessing(Integer processing)
    {
        this.processing = processing;
    }

    public Integer getSuccess()
    {
        return success;
    }

    public void setSuccess(Integer success)
    {
        this.success = success;
    }

    public Integer getFail()
    {
        return fail;
    }

    public void setFail(Integer fail)
    {
        this.fail = fail;
    }

    public Integer getStop()
    {
        return stop;
    }

    public void setStop(Integer stop)
    {
        this.stop = stop;
    }

    public Integer getTimeout()
    {
        return timeout;
    }

    public void setTimeout(Integer timeout)
    {
        this.timeout = timeout;
    }

    public String toString()
    {
        return (new StringBuilder("OperationStaResult [total=")).append(total).append(", wait=").append(wait).append(", processing=").append(processing).append(", success=").append(success).append(", fail=").append(fail).append(", stop=").append(stop).append(", timeout=").append(timeout).append("]").toString();
    }

    private Integer total;
    private Integer wait;
    private Integer processing;
    private Integer success;
    private Integer fail;
    private Integer stop;
    private Integer timeout;
}
