package com.iotplatform.service;


import java.util.Map;

/**
 * @ClassName SubscribeDeviceNewsService
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/4 14:00
 */

public interface SubscribeDeviceNewsService {
    /**
     * @Description 订阅通知
     * @author xiebifeng
     * @date 2019/1/9 18:23
     * @param:
     * @return:
     */

    Map<String, Object> notification(String callbackUrl, String notifyType) throws Exception;

    /**
     * @Description 查询单个
     * @author xiebifeng
     * @date 2019/1/9 18:44
     * @param:
     * @return:
     */
    Map<String, Object> querySingle(String subscriptionId, String appId) throws Exception;

    /**
     * @Description 删除单个订阅
     * @author xiebifeng
     * @date 2019/1/9 18:50
     * @param:
     * @return:
     */

    Map<String, Object> deleteSingle(String subscriptionId) throws Exception;

    /**
     * @Description 批量查询
     * @author xiebifeng
     * @date 2019/1/9 19:08
     * @param:
     * @return:
     */

    Map<String, Object> queryBatch() throws Exception;
}
