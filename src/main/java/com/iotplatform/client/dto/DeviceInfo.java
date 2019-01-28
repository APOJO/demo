// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceInfo.java

package com.iotplatform.client.dto;


public class DeviceInfo {

    public DeviceInfo() {
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSwVersion() {
        return swVersion;
    }

    public void setSwVersion(String swVersion) {
        this.swVersion = swVersion;
    }

    public String getFwVersion() {
        return fwVersion;
    }

    public void setFwVersion(String fwVersion) {
        this.fwVersion = fwVersion;
    }

    public String getHwVersion() {
        return hwVersion;
    }

    public void setHwVersion(String hwVersion) {
        this.hwVersion = hwVersion;
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public String getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public String getMute() {
        return mute;
    }

    public void setMute(String mute) {
        this.mute = mute;
    }

    public String getSupportedSecurity() {
        return supportedSecurity;
    }

    public void setSupportedSecurity(String supportedSecurity) {
        this.supportedSecurity = supportedSecurity;
    }

    public String getIsSecurity() {
        return isSecurity;
    }

    public void setIsSecurity(String isSecurity) {
        this.isSecurity = isSecurity;
    }

    public String getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(String signalStrength) {
        this.signalStrength = signalStrength;
    }

    public String getSigVersion() {
        return sigVersion;
    }

    public void setSigVersion(String sigVersion) {
        this.sigVersion = sigVersion;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(String batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String toString() {
        return (new StringBuilder("DeviceInfo [nodeId=")).append(nodeId).append(", name=").append(name).append(", description=").append(description).append(", manufacturerId=").append(manufacturerId).append(", manufacturerName=").append(manufacturerName).append(", mac=").append(mac).append(", location=").append(location).append(", deviceType=").append(deviceType).append(", model=").append(model).append(", swVersion=").append(swVersion).append(", fwVersion=").append(fwVersion).append(", hwVersion=").append(hwVersion).append(", protocolType=").append(protocolType).append(", bridgeId=").append(bridgeId).append(", status=").append(status).append(", statusDetail=").append(statusDetail).append(", mute=").append(mute).append(", supportedSecurity=").append(supportedSecurity).append(", isSecurity=").append(isSecurity).append(", signalStrength=").append(signalStrength).append(", sigVersion=").append(sigVersion).append(", serialNumber=").append(serialNumber).append(", batteryLevel=").append(batteryLevel).append(", deviceId=").append(deviceId).append("]").toString();
    }

    private String nodeId;
    private String name;
    private String description;
    private String manufacturerId;
    private String manufacturerName;
    private String mac;
    private String location;
    private String deviceType;
    private String model;
    private String swVersion;
    private String fwVersion;
    private String hwVersion;
    private String protocolType;
    private String bridgeId;
    private String status;
    private String statusDetail;
    private String mute;
    private String supportedSecurity;
    private String isSecurity;
    private String signalStrength;
    private String sigVersion;
    private String serialNumber;
    private String batteryLevel;
    private String deviceId;

}
