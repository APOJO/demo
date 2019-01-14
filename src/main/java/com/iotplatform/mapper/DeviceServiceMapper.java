package com.iotplatform.mapper;

import com.iotplatform.client.dto.DeviceService;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceServiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceService record);

    int insertSelective(DeviceService record);

    DeviceService selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceService record);

    int updateByPrimaryKeyWithBLOBs(DeviceService record);

    int updateByPrimaryKey(DeviceService record);
}