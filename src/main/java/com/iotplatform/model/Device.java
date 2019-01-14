package com.iotplatform.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Device
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/3 13:58
 */
public class Device implements Serializable {
    //主键自增id
    private Integer id;
    //设备ID，用于唯一标识一个设备。
    private String deviceId;
    //验证码，设备可以通过验证码获取设备ID和密码。
    private String verifyCode;
    //设备的唯一标识，必须与设备上报的设备标识一致。通常使用IMEI作为nodeId。
    private String nodeId;
    //验证码有效时间，单位秒，设备需要在有效时间内接入物联网平台。
    private Integer timeout;
    //随机psk参数，若请求中携带了psk，则使用请求中的psk，否则由平台生成随机psk参数。
    private String psk;
    //添加时间
    private Date createTime;
    //修改时间
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getPsk() {
        return psk;
    }

    public void setPsk(String psk) {
        this.psk = psk;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }
}
