package com.telecommunication.dao;

import com.telecommunication.model.Device;
import org.springframework.stereotype.Repository;

/**
 * @ClassName DeviceManageMapper
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/3 13:56
 */
@Repository
public interface DeviceManageMapper {

    /**
     * @Description 设备注册，添加到数据库
     * @author xiebifeng
     * @date 2019/1/3 13:59
     * @param: Device
     * @return: int
     */
    int insertDevice(Device Device);

}
