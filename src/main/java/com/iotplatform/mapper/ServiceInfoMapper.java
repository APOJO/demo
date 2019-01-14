package com.iotplatform.mapper;

import com.iotplatform.client.dto.ServiceInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceInfoMapper {
    int insert(ServiceInfo record);

    int insertSelective(ServiceInfo record);
}