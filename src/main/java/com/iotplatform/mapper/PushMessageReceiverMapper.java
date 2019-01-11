package com.iotplatform.mapper;

import com.iotplatform.client.dto.DeviceService;
import com.iotplatform.client.dto.NotifyDeviceAddedDTO;
import com.iotplatform.client.dto.NotifyDeviceDataChangedDTO;
import org.springframework.stereotype.Repository;

/**
 * @ClassName PushMessageReceiverMapper
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/8 21:09
 */
@Repository
public interface PushMessageReceiverMapper {
    int insertService(DeviceService service);

    int insertDataChang(NotifyDeviceDataChangedDTO body);

    int insertDevice(NotifyDeviceAddedDTO body);
}
