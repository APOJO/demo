//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client.invokeapi;

import com.iotplatform.client.ClientService;
import com.iotplatform.client.DefaultNorthApiClient;
import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.QueryBatchDevicesInfoInDTO;
import com.iotplatform.client.dto.QueryBatchDevicesInfoOutDTO;
import com.iotplatform.client.dto.QueryDataHistoryInDTO;
import com.iotplatform.client.dto.QueryDataHistoryOutDTO;
import com.iotplatform.client.dto.QueryDeviceCapabilitiesInDTO;
import com.iotplatform.client.dto.QueryDeviceCapabilitiesOutDTO;
import com.iotplatform.client.dto.QueryDeviceDataHistoryInDTO;
import com.iotplatform.client.dto.QueryDeviceDataHistoryOutDTO;
import com.iotplatform.client.dto.QueryDeviceDataOutDTO;
import com.iotplatform.client.dto.QueryDeviceDesiredHistoryInDTO;
import com.iotplatform.client.dto.QueryDeviceDesiredHistoryOutDTO;
import com.iotplatform.client.dto.QueryDevicesInDTO;
import com.iotplatform.client.dto.QueryDevicesOutDTO;
import com.iotplatform.client.dto.QuerySingleDeviceInfoOutDTO;
import com.iotplatform.client.dto.SubscribeInDTO;
import com.iotplatform.utils.MapUtil;
import java.util.HashMap;
import java.util.Map;

public class DataCollection {
    private NorthApiClient northApiClient;
    private ClientService clientService;

    public DataCollection() {
        this.northApiClient = DefaultNorthApiClient.getDefaultApiClient();
        this.clientService = new ClientService();
    }

    public DataCollection(NorthApiClient northApiClient) {
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

    public QuerySingleDeviceInfoOutDTO querySingleDeviceInfo(String deviceId, String select, String appId, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = null;
        if (select != null) {
            queryParams = new HashMap();
            this.clientService.putInIfValueNotEmpty(queryParams, "select", select);
        }

        Class<QuerySingleDeviceInfoOutDTO> returnType = QuerySingleDeviceInfoOutDTO.class;
        return (QuerySingleDeviceInfoOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/dm/v1.4.0/devices/" + deviceId, queryParams, (Object)null, returnType);
    }

    public QueryBatchDevicesInfoOutDTO queryBatchDevicesInfo(QueryBatchDevicesInfoInDTO qbdiInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qbdiInDTO);
        Class<QueryBatchDevicesInfoOutDTO> returnType = QueryBatchDevicesInfoOutDTO.class;
        return (QueryBatchDevicesInfoOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/dm/v1.4.0/devices", queryParams, (Object)null, returnType);
    }

    public QueryDeviceDataHistoryOutDTO queryDeviceDataHistory(QueryDeviceDataHistoryInDTO qddhInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qddhInDTO);
        Class<QueryDeviceDataHistoryOutDTO> returnType = QueryDeviceDataHistoryOutDTO.class;
        return (QueryDeviceDataHistoryOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/data/v1.2.0/deviceDataHistory", queryParams, (Object)null, returnType);
    }

    public QueryDeviceDesiredHistoryOutDTO queryDeviceDesiredHistory(QueryDeviceDesiredHistoryInDTO qddhInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qddhInDTO);
        Class<QueryDeviceDesiredHistoryOutDTO> returnType = QueryDeviceDesiredHistoryOutDTO.class;
        return (QueryDeviceDesiredHistoryOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/shadow/v1.5.0/deviceDesiredHistory", queryParams, (Object)null, returnType);
    }

    public QueryDeviceCapabilitiesOutDTO queryDeviceCapabilities(QueryDeviceCapabilitiesInDTO qdcInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qdcInDTO);
        Class<QueryDeviceCapabilitiesOutDTO> returnType = QueryDeviceCapabilitiesOutDTO.class;
        return (QueryDeviceCapabilitiesOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/data/v1.1.0/deviceCapabilities", queryParams, (Object)null, returnType);
    }

    /** @deprecated */
    @Deprecated
    public QueryDataHistoryOutDTO queryDataHistory(QueryDataHistoryInDTO qdhid, String appId, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qdhid);
        Class<QueryDataHistoryOutDTO> returnType = QueryDataHistoryOutDTO.class;
        return (QueryDataHistoryOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/data/v1.1.0/deviceDataHistory", queryParams, (Object)null, returnType);
    }

    /** @deprecated */
    @Deprecated
    public void subscribeNotify(SubscribeInDTO sid, String accessToken) throws NorthApiException {
        this.northApiClient.invokeAPI((String)null, accessToken, "POST", "/iocm/app/sub/v1.1.0/subscribe", (Map)null, sid, (Class)null);
    }

    /** @deprecated */
    @Deprecated
    public QueryDeviceDataOutDTO queryDeviceData(String deviceId, String appId, String accessToken) throws NorthApiException {
        Class<QueryDeviceDataOutDTO> returnType = QueryDeviceDataOutDTO.class;
        return (QueryDeviceDataOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/dm/v1.4.0/devices/" + deviceId, (Map)null, (Object)null, returnType);
    }

    /** @deprecated */
    @Deprecated
    public QueryDevicesOutDTO queryDevices(QueryDevicesInDTO qdInDTO, String appId, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qdInDTO);
        Class<QueryDevicesOutDTO> returnType = QueryDevicesOutDTO.class;
        return (QueryDevicesOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/dm/v1.4.0/devices", queryParams, (Object)null, returnType);
    }

    /** @deprecated */
    @Deprecated
    public QueryDeviceCapabilitiesOutDTO queryDeviceCapabilities(QueryDeviceCapabilitiesInDTO qdcInDTO, String appId, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qdcInDTO);
        Class<QueryDeviceCapabilitiesOutDTO> returnType = QueryDeviceCapabilitiesOutDTO.class;
        return (QueryDeviceCapabilitiesOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/data/v1.1.0/deviceCapabilities", queryParams, (Object)null, returnType);
    }
}
