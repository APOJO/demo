package com.iotplatform.model;

import java.io.Serializable;

/**
 * @ClassName DeviceConfigDTO
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/4 10:07
 */
public class DeviceConfigDTO implements Serializable {
    //数据老化时长，取值范围：0-90，单位：天。
    private Integer dataAgingTime;

    public Integer getDataAgingTime() {
        return dataAgingTime;
    }

    public void setDataAgingTime(Integer dataAgingTime) {
        this.dataAgingTime = dataAgingTime;
    }
}
