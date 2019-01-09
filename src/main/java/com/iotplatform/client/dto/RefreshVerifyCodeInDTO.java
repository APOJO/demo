// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RefreshVerifyCodeInDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            RefreshVerifyCodeDTO

/**
 * @deprecated Class RefreshVerifyCodeInDTO is deprecated
 */

public class RefreshVerifyCodeInDTO
{

    public RefreshVerifyCodeInDTO()
    {
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public RefreshVerifyCodeDTO getRequest()
    {
        return request;
    }

    public void setRequest(RefreshVerifyCodeDTO request)
    {
        this.request = request;
    }

    public String toString()
    {
        return (new StringBuilder("RefreshVerifyCodeInDTO {request=")).append(request).append(", deviceId=").append(deviceId).append("}").toString();
    }

    private RefreshVerifyCodeDTO request;
    private String deviceId;
}
