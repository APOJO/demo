package com.iotplatform.mapper;

import com.iotplatform.client.dto.SubscriptionDTO;
import org.springframework.stereotype.Repository;

/**
 * @ClassName SubscribeDeviceNewsMapper
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/4 14:02
 */
@Repository
public interface SubscribeDeviceNewsMapper {

    int insertSubDTO(SubscriptionDTO subDTO);

    int deleteSingleSubscription(String subscriptionId);
}
