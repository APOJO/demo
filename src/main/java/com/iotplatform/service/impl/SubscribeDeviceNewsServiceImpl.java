package com.iotplatform.service.impl;

import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.*;
import com.iotplatform.client.invokeapi.Authentication;
import com.iotplatform.client.invokeapi.SubscriptionManagement;
import com.iotplatform.mapper.SubscribeDeviceNewsMapper;
import com.iotplatform.service.SubscribeDeviceNewsService;
import com.iotplatform.utils.AuthUtil;
import com.iotplatform.utils.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SubscribeDeviceNewsServiceImpl
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/4 14:01
 */
@Service
public class SubscribeDeviceNewsServiceImpl implements SubscribeDeviceNewsService {
    @Autowired
    private SubscribeDeviceNewsMapper subscribeDeviceNewsMapper;
    private NorthApiClient northApiClient = AuthUtil.initApiClient();
    private Authentication authentication = new Authentication(northApiClient);;
    private SubscriptionManagement subscriptionManagement = new SubscriptionManagement(northApiClient);

    @Override
    public Map<String, Object> notification(String callbackUrl, String notifyType)throws Exception {
        Map<String, Object> map=new HashMap<>();
        AuthOutDTO authOutDTO = authentication.getAuthToken();
        String accessToken = authOutDTO.getAccessToken();
        SubscriptionDTO subDTO = subDeviceData(subscriptionManagement, notifyType, callbackUrl, accessToken,map);
        if (subDTO==null){
            return map;
        }
        int result=subscribeDeviceNewsMapper.insertSubDTO(subDTO);
        if (result>0){
            map.put("code",200);
            map.put("msg","订阅成功");
        }else{
            map.put("code",500);
            map.put("msg","订阅失败");
        }
        map.put("subDTO",subDTO);
        return map;
    }



    @Override
    public Map<String, Object> querySingle(String subscriptionId, String appId) throws Exception{
        Map<String, Object> map=new HashMap<>();
        AuthOutDTO authOutDTO = authentication.getAuthToken();
        String accessToken = authOutDTO.getAccessToken();
        SubscriptionDTO subDTO2 = subscriptionManagement.querySingleSubscription(subscriptionId, appId, accessToken);
        map.put("subDTO",subDTO2);
        return map;
    }

    @Override
    public Map<String, Object> deleteSingle(String subscriptionId) throws Exception {
        Map<String, Object> map=new HashMap<>();
        AuthOutDTO authOutDTO = authentication.getAuthToken();
        String accessToken = authOutDTO.getAccessToken();
        subscriptionManagement.deleteSingleSubscription(subscriptionId, null, accessToken);
        int result=subscribeDeviceNewsMapper.deleteSingleSubscription(subscriptionId);
        if (result>0){
            map.put("code",200);
            map.put("msg","删除订阅成功");
        }else{
            map.put("code",500);
            map.put("msg","删除订阅失败,请查询此订阅是否存在");
        }
        return map;
    }

    @Override
    public Map<String, Object> queryBatch() throws Exception {
        Map<String, Object> map=new HashMap<>();
        QueryBatchSubInDTO qbsInDTO = new QueryBatchSubInDTO();
        qbsInDTO.setAppId(PropertyUtil.getProperty("appId"));
        AuthOutDTO authOutDTO = authentication.getAuthToken();
        String accessToken = authOutDTO.getAccessToken();
        QueryBatchSubOutDTO qbsOutDTO = subscriptionManagement.queryBatchSubscriptions(qbsInDTO, accessToken);
        map.put("qbsOutDTO",qbsOutDTO);
        return map;
    }

    private static SubscriptionDTO subDeviceData(SubscriptionManagement subscriptionManagement,
                                                 String notifyType, String callbackUrl, String accessToken,Map<String, Object> map) {
        SubDeviceDataInDTO sddInDTO = new SubDeviceDataInDTO();
        sddInDTO.setNotifyType(notifyType);
        sddInDTO.setCallbackUrl(callbackUrl);
        try {
            SubscriptionDTO subDTO = subscriptionManagement.subDeviceData(sddInDTO, null, accessToken);
            System.out.println(subDTO.toString());
            return subDTO;
        } catch (NorthApiException e) {
            map.put("error_massage",e);
            System.out.println(e.toString());
        }
        return null;
    }
}
