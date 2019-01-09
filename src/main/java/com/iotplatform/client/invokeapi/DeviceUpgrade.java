//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client.invokeapi;

import com.iotplatform.client.DefaultNorthApiClient;
import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.CreateUpgradeTaskInDTO;
import com.iotplatform.client.dto.CreateUpgradeTaskOutDTO;
import com.iotplatform.client.dto.QueryUpgradePackageListInDTO;
import com.iotplatform.client.dto.QueryUpgradePackageListOutDTO;
import com.iotplatform.client.dto.QueryUpgradePackageOutDTO;
import com.iotplatform.client.dto.QueryUpgradeSubTaskInDTO;
import com.iotplatform.client.dto.QueryUpgradeSubTaskOutDTO;
import com.iotplatform.client.dto.QueryUpgradeTaskListInDTO;
import com.iotplatform.client.dto.QueryUpgradeTaskListOutDTO;
import com.iotplatform.client.dto.QueryUpgradeTaskOutDTO;
import com.iotplatform.utils.MapUtil;
import java.util.Map;

public class DeviceUpgrade {
    private NorthApiClient northApiClient;

    public DeviceUpgrade() {
        this.northApiClient = DefaultNorthApiClient.getDefaultApiClient();
    }

    public DeviceUpgrade(NorthApiClient northApiClient) {
        this.northApiClient = northApiClient;
    }

    public void setNorthApiClient(NorthApiClient northApiClient) {
        this.northApiClient = northApiClient;
    }

    public NorthApiClient getNorthApiClient() {
        return this.northApiClient;
    }

    public QueryUpgradePackageListOutDTO queryUpgradePackageList(QueryUpgradePackageListInDTO quplInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(quplInDTO);
        Class<QueryUpgradePackageListOutDTO> returnType = QueryUpgradePackageListOutDTO.class;
        return (QueryUpgradePackageListOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iodm/northbound/v1.5.0/category", queryParams, (Object)null, returnType);
    }

    public QueryUpgradePackageOutDTO queryUpgradePackage(String fileId, String accessToken) throws NorthApiException {
        Class<QueryUpgradePackageOutDTO> returnType = QueryUpgradePackageOutDTO.class;
        return (QueryUpgradePackageOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iodm/northbound/v1.5.0/category/" + fileId, (Map)null, (Object)null, returnType);
    }

    public void deleteUpgradePackage(String fileId, String accessToken) throws NorthApiException {
        this.northApiClient.invokeAPI((String)null, accessToken, "DELETE", "/iodm/northbound/v1.5.0/category/" + fileId, (Map)null, (Object)null, (Class)null);
    }

    public CreateUpgradeTaskOutDTO createSoftwareUpgradeTask(CreateUpgradeTaskInDTO cutInDTO, String accessToken) throws NorthApiException {
        Class<CreateUpgradeTaskOutDTO> returnType = CreateUpgradeTaskOutDTO.class;
        return (CreateUpgradeTaskOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "POST", "/iodm/northbound/v1.5.0/operations/softwareUpgrade", (Map)null, cutInDTO, returnType);
    }

    public CreateUpgradeTaskOutDTO createFirmwareUpgradeTask(CreateUpgradeTaskInDTO cutInDTO, String accessToken) throws NorthApiException {
        Class<CreateUpgradeTaskOutDTO> returnType = CreateUpgradeTaskOutDTO.class;
        return (CreateUpgradeTaskOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "POST", "/iodm/northbound/v1.5.0/operations/firmwareUpgrade", (Map)null, cutInDTO, returnType);
    }

    public QueryUpgradeTaskOutDTO queryUpgradeTask(String operationId, String accessToken) throws NorthApiException {
        Class<QueryUpgradeTaskOutDTO> returnType = QueryUpgradeTaskOutDTO.class;
        return (QueryUpgradeTaskOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iodm/northbound/v1.5.0/operations/" + operationId, (Map)null, (Object)null, returnType);
    }

    public QueryUpgradeSubTaskOutDTO queryUpgradeSubTask(QueryUpgradeSubTaskInDTO qustInDTO, String operationId, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qustInDTO);
        String url = String.format("/iodm/northbound/v1.5.0/operations/%s/subOperations", operationId);
        Class<QueryUpgradeSubTaskOutDTO> returnType = QueryUpgradeSubTaskOutDTO.class;
        return (QueryUpgradeSubTaskOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", url, queryParams, (Object)null, returnType);
    }

    public QueryUpgradeTaskListOutDTO queryUpgradeTaskList(QueryUpgradeTaskListInDTO qutlInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qutlInDTO);
        Class<QueryUpgradeTaskListOutDTO> returnType = QueryUpgradeTaskListOutDTO.class;
        return (QueryUpgradeTaskListOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iodm/northbound/v1.5.0/operations", queryParams, (Object)null, returnType);
    }
}
