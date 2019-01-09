// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UpdateDeviceCmdInDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            UpdateDeviceCmdReq

/**
 * @deprecated Class UpdateDeviceCmdInDTO is deprecated
 */

public class UpdateDeviceCmdInDTO
{

    public UpdateDeviceCmdInDTO()
    {
    }

    public String getDeviceCommandId()
    {
        return deviceCommandId;
    }

    public void setDeviceCommandId(String deviceCommandId)
    {
        this.deviceCommandId = deviceCommandId;
    }

    public UpdateDeviceCmdReq getUpdateDeviceCommandReq()
    {
        return updateDeviceCommandReq;
    }

    public void setUpdateDeviceCommandReq(UpdateDeviceCmdReq updateDeviceCommandReq)
    {
        this.updateDeviceCommandReq = updateDeviceCommandReq;
    }

    public String toString()
    {
        return (new StringBuilder("UpdateDeviceCmdInDTO [deviceCommandId=")).append(deviceCommandId).append(", updateDeviceCommandReq=").append(updateDeviceCommandReq).append("]").toString();
    }

    private String deviceCommandId;
    private UpdateDeviceCmdReq updateDeviceCommandReq;
}
