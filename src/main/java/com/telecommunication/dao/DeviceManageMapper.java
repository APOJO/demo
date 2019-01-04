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

    /**
     * @Description 查询注册过的设备
     * @author xiebifeng
     * @date 2019/1/3 19:18
     * @param:
     * @return:
     */

    Device selectByDeviceId(String deviceId);

    /**
     * @Description 修改注册信息
     * @author xiebifeng
     * @date 2019/1/3 19:30
     * @param:
     * @return:
     */

    int updateDevice(Device device);

    /**
     * @Description 删除设备
     * @author xiebifeng
     * @date 2019/1/4 11:41
     * @param:
     * @return:
     */

    int deleteDeviceById(String deviceId);
}
