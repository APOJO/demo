//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client.invokeapi;

import com.iotplatform.client.ClientService;
import com.iotplatform.client.DefaultNorthApiClient;
import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.DeleteBatchSubInDTO;
import com.iotplatform.client.dto.QueryBatchSubInDTO;
import com.iotplatform.client.dto.QueryBatchSubOutDTO;
import com.iotplatform.client.dto.SubDeviceDataInDTO;
import com.iotplatform.client.dto.SubDeviceManagementDataInDTO;
import com.iotplatform.client.dto.SubscriptionDTO;
import com.iotplatform.utils.MapUtil;
import java.util.HashMap;
import java.util.Map;

public class SubscriptionManagement {
    private NorthApiClient northApiClient;
    private ClientService clientService;

    public SubscriptionManagement() {
        this.northApiClient = DefaultNorthApiClient.getDefaultApiClient();
        this.clientService = new ClientService();
    }

    public SubscriptionManagement(NorthApiClient northApiClient) {
        this.northApiClient = northApiClient;
        this.clientService = new ClientService();
    }

    public void setNorthApiClient(NorthApiClient northApiClient) {
        this.northApiClient = northApiClient;
        this.clientService = new ClientService();
    }

    public NorthApiClient getNorthApiClient() {
        return this.northApiClient;
    }

    public SubscriptionDTO subDeviceData(SubDeviceDataInDTO sddInDTO, String ownerFlag, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = null;
        if (ownerFlag != null) {
            queryParams = new HashMap();
            this.clientService.putInIfValueNotEmpty(queryParams, "ownerFlag", ownerFlag);
        }

        Class<SubscriptionDTO> returnType = SubscriptionDTO.class;
        return (SubscriptionDTO)this.northApiClient.invokeAPI((String)null, accessToken, "POST", "/iocm/app/sub/v1.2.0/subscriptions", queryParams, sddInDTO, returnType);
    }

    public void subDeviceData(SubDeviceManagementDataInDTO smdInDTO, String accessToken) throws NorthApiException {
        this.northApiClient.invokeAPI((String)null, accessToken, "POST", "/iodm/app/sub/v1.1.0/subscribe", (Map)null, smdInDTO, (Class)null);
    }

    public SubscriptionDTO querySingleSubscription(String subscriptionId, String appId, String accessToken) throws NorthApiException {
        Class<SubscriptionDTO> returnType = SubscriptionDTO.class;
        return (SubscriptionDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/sub/v1.2.0/subscriptions/" + subscriptionId, (Map)null, (Object)null, returnType);
    }

    public QueryBatchSubOutDTO queryBatchSubscriptions(QueryBatchSubInDTO qbsInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qbsInDTO);
        Class<QueryBatchSubOutDTO> returnType = QueryBatchSubOutDTO.class;
        return (QueryBatchSubOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/sub/v1.2.0/subscriptions", queryParams, (Object)null, returnType);
    }

    public void deleteSingleSubscription(String subscriptionId, String appId, String accessToken) throws NorthApiException {
        this.northApiClient.invokeAPI(appId, accessToken, "DELETE", "/iocm/app/sub/v1.2.0/subscriptions/" + subscriptionId, (Map)null, (Object)null, (Class)null);
    }

    public void deleteBatchSubscriptions(DeleteBatchSubInDTO dbsInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(dbsInDTO);
        this.northApiClient.invokeAPI((String)null, accessToken, "DELETE", "/iocm/app/sub/v1.2.0/subscriptions", queryParams, (Object)null, (Class)null);
    }
}
