package com.iotplatform.mapper;

import com.iotplatform.client.dto.Notify;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Notify record);

    int insertSelective(Notify record);

    Notify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Notify record);

    int updateByPrimaryKey(Notify record);
}