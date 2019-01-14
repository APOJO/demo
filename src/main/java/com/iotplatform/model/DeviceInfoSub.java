package com.iotplatform.model;

import com.iotplatform.client.dto.DeviceInfo;

/**
 * @ClassName DeviceInfoSub
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/14 19:41
 */
public class DeviceInfoSub extends DeviceInfo {
    private Integer id;
    private String DeviceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String deviceId) {
        DeviceId = deviceId;
    }

    public DeviceInfoSub() {
        super();
    }

    @Override
    public String getNodeId() {
        return super.getNodeId();
    }

    @Override
    public void setNodeId(String nodeId) {
        super.setNodeId(nodeId);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public String getManufacturerId() {
        return super.getManufacturerId();
    }

    @Override
    public void setManufacturerId(String manufacturerId) {
        super.setManufacturerId(manufacturerId);
    }

    @Override
    public String getManufacturerName() {
        return super.getManufacturerName();
    }

    @Override
    public void setManufacturerName(String manufacturerName) {
        super.setManufacturerName(manufacturerName);
    }

    @Override
    public String getMac() {
        return super.getMac();
    }

    @Override
    public void setMac(String mac) {
        super.setMac(mac);
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    @Override
    public String getDeviceType() {
        return super.getDeviceType();
    }

    @Override
    public void setDeviceType(String deviceType) {
        super.setDeviceType(deviceType);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String getSwVersion() {
        return super.getSwVersion();
    }

    @Override
    public void setSwVersion(String swVersion) {
        super.setSwVersion(swVersion);
    }

    @Override
    public String getFwVersion() {
        return super.getFwVersion();
    }

    @Override
    public void setFwVersion(String fwVersion) {
        super.setFwVersion(fwVersion);
    }

    @Override
    public String getHwVersion() {
        return super.getHwVersion();
    }

    @Override
    public void setHwVersion(String hwVersion) {
        super.setHwVersion(hwVersion);
    }

    @Override
    public String getProtocolType() {
        return super.getProtocolType();
    }

    @Override
    public void setProtocolType(String protocolType) {
        super.setProtocolType(protocolType);
    }

    @Override
    public String getBridgeId() {
        return super.getBridgeId();
    }

    @Override
    public void setBridgeId(String bridgeId) {
        super.setBridgeId(bridgeId);
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(status);
    }

    @Override
    public String getStatusDetail() {
        return super.getStatusDetail();
    }

    @Override
    public void setStatusDetail(String statusDetail) {
        super.setStatusDetail(statusDetail);
    }

    @Override
    public String getMute() {
        return super.getMute();
    }

    @Override
    public void setMute(String mute) {
        super.setMute(mute);
    }

    @Override
    public String getSupportedSecurity() {
        return super.getSupportedSecurity();
    }

    @Override
    public void setSupportedSecurity(String supportedSecurity) {
        super.setSupportedSecurity(supportedSecurity);
    }

    @Override
    public String getIsSecurity() {
        return super.getIsSecurity();
    }

    @Override
    public void setIsSecurity(String isSecurity) {
        super.setIsSecurity(isSecurity);
    }

    @Override
    public String getSignalStrength() {
        return super.getSignalStrength();
    }

    @Override
    public void setSignalStrength(String signalStrength) {
        super.setSignalStrength(signalStrength);
    }

    @Override
    public String getSigVersion() {
        return super.getSigVersion();
    }

    @Override
    public void setSigVersion(String sigVersion) {
        super.setSigVersion(sigVersion);
    }

    @Override
    public String getSerialNumber() {
        return super.getSerialNumber();
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        super.setSerialNumber(serialNumber);
    }

    @Override
    public String getBatteryLevel() {
        return super.getBatteryLevel();
    }

    @Override
    public void setBatteryLevel(String batteryLevel) {
        super.setBatteryLevel(batteryLevel);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
