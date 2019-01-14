package com.iotplatform.mapper;

import com.iotplatform.client.dto.DeviceInfo;
import org.springframework.stereotype.Repository;

/**
 * @ClassName DeviceInfoMapper
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/14 12:18
 */
@Repository
public interface DeviceInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceInfo record);

    int insertSelective(DeviceInfo record);

    DeviceInfo selectByPrimaryKey(Integer id);

    DeviceInfo selectByDeviceId(String nodeId);

    int updateByPrimaryKeySelective(DeviceInfo record);

    int updateByPrimaryKey(DeviceInfo record);

    int insertChange(DeviceInfo record);

    int insertChangeSelective(DeviceInfo record);

}
