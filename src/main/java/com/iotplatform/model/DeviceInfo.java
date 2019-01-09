package com.iotplatform.model;

import java.io.Serializable;

/**
 * @ClassName DeviceInfo
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/4 14:05
 */
public class DeviceInfo implements Serializable {
    //设备的唯一标识，通常使用MAC，
    private String nodeId;
    //设备名称。
    private String name;
    //设备的描述信息。
    private String description;
    //厂商ID，唯一标识一个厂商。
    private String manufacturerId;
    //厂商名称。
    private String manufacturerName;
    //设备的MAC地址。
    private String mac;
    //设备的位置信息。
    private String location;
    //设备类型，大驼峰命名方式，如MultiSensor、ContactSensor、CameraGateway。
    private String deviceType;
    //设备的型号。
    //Z-Wave：ProductType + ProductId，16 进制格式 XXXX-XXXX 补0对齐，如：001A-0A12，其他协议的格式待定。
    private String model;
    //设备的软件版本。
    //Z-Wave：主版本号.次版本号，如：1.1
    private String swVersion;
    //设备的固件版本。
    private String fwVersion;
    //设备的硬件版本。
    private String hwVersion;
    //设备使用的协议类型，当前支持的协议类型：CoAP，huaweiM2M，Z-Wave，ONVIF，WPS，Hue，WiFi，J808，Gateway，ZigBee，LWM2M
    private String protocolType;
    //Bridge标识，表示设备通过哪个Bridge接入物联网平台。
    private String bridgeId;
    //设备的状态，表示设备是否在线，取值范围：ONLINE、OFFLINE、INBOX、ABNORMAL。
    private String status;
    //设备的状态详情，status条件取值，
    private String statusDetail;
    //表示设备是否处于冻结状态，即设备上报数据时，平台是否会管理和保存。
    //TRUE：冻结状态
    //FALSE：非冻结状态
    private String mute;
    //表示设备是否支持安全模式。
    //TRUE：支持安全模式
    //FALSE：不支持安全模式
    private String supportedSecurity;
    //表示设备当前是否启用安全模式。
    //TRUE：启用
    //FALSE：未启用
    private String isSecurity;
    //设备的信号强度。
    private String signalStrength;
    //设备的sig版本。
    private String sigVersion;
    //设备的序列号。
    private String serialNumber;
    //设备的电池电量。
    private String batteryLevel;

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
}
