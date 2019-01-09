//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client.invokeapi;

import com.iotplatform.client.ClientService;
import com.iotplatform.client.DefaultNorthApiClient;
import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.BatchTaskCreateInDTO;
import com.iotplatform.client.dto.BatchTaskCreateInDTO2;
import com.iotplatform.client.dto.BatchTaskCreateOutDTO;
import com.iotplatform.client.dto.QueryOneTaskOutDTO;
import com.iotplatform.client.dto.QueryTaskDetailsInDTO;
import com.iotplatform.client.dto.QueryTaskDetailsOutDTO;
import com.iotplatform.utils.MapUtil;
import java.util.HashMap;
import java.util.Map;

public class BatchProcess {
    private NorthApiClient northApiClient;
    private ClientService clientService;

    public BatchProcess() {
        this.northApiClient = DefaultNorthApiClient.getDefaultApiClient();
        this.clientService = new ClientService();
    }

    public BatchProcess(NorthApiClient northApiClient) {
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

    public BatchTaskCreateOutDTO createBatchTask(BatchTaskCreateInDTO2 btcInDTO, String accessToken) throws NorthApiException {
        Class<BatchTaskCreateOutDTO> returnType = BatchTaskCreateOutDTO.class;
        return (BatchTaskCreateOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "POST", "/iocm/app/batchtask/v1.1.0/tasks", (Map)null, btcInDTO, returnType);
    }

    public QueryOneTaskOutDTO queryOneTask(String taskId, String select, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(taskId);
        Map<String, String> queryParams = null;
        if (select != null) {
            queryParams = new HashMap();
            this.clientService.putInIfValueNotEmpty(queryParams, "select", select);
        }

        Class<QueryOneTaskOutDTO> returnType = QueryOneTaskOutDTO.class;
        return (QueryOneTaskOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/batchtask/v1.1.0/tasks/" + taskId, queryParams, (Object)null, returnType);
    }

    public QueryTaskDetailsOutDTO queryTaskDetails(QueryTaskDetailsInDTO qtdInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qtdInDTO);
        Class<QueryTaskDetailsOutDTO> returnType = QueryTaskDetailsOutDTO.class;
        return (QueryTaskDetailsOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/batchtask/v1.1.0/taskDetails", queryParams, (Object)null, returnType);
    }

    /** @deprecated */
    @Deprecated
    public BatchTaskCreateOutDTO createBatchTask(BatchTaskCreateInDTO btcInDTO, String accessToken) throws NorthApiException {
        Class<BatchTaskCreateOutDTO> returnType = BatchTaskCreateOutDTO.class;
        return (BatchTaskCreateOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "POST", "/iocm/app/batchtask/v1.1.0/tasks", (Map)null, btcInDTO, returnType);
    }

    /** @deprecated */
    @Deprecated
    public QueryOneTaskOutDTO queryOneTask(String taskId, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(taskId);
        Class<QueryOneTaskOutDTO> returnType = QueryOneTaskOutDTO.class;
        return (QueryOneTaskOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/batchtask/v1.1.0/tasks/" + taskId, (Map)null, (Object)null, returnType);
    }

    /** @deprecated */
    @Deprecated
    public QueryTaskDetailsOutDTO queryTaskDetails(QueryTaskDetailsInDTO qtdInDTO, String appId, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qtdInDTO);
        Class<QueryTaskDetailsOutDTO> returnType = QueryTaskDetailsOutDTO.class;
        return (QueryTaskDetailsOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/batchtask/v1.1.0/taskDetails", queryParams, (Object)null, returnType);
    }
}
