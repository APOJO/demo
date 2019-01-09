//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client.invokeapi;

import com.iotplatform.client.ClientService;
import com.iotplatform.client.DefaultNorthApiClient;
import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.CreateDeviceCmdCancelTaskInDTO;
import com.iotplatform.client.dto.CreateDeviceCmdCancelTaskOutDTO;
import com.iotplatform.client.dto.DeviceCmdCancelTaskInDTO;
import com.iotplatform.client.dto.DeviceCmdCancelTaskOutDTO;
import com.iotplatform.client.dto.PostDeviceCommandInDTO;
import com.iotplatform.client.dto.PostDeviceCommandInDTO2;
import com.iotplatform.client.dto.PostDeviceCommandOutDTO;
import com.iotplatform.client.dto.PostDeviceCommandOutDTO2;
import com.iotplatform.client.dto.QueryDeviceCmdCancelTaskInDTO;
import com.iotplatform.client.dto.QueryDeviceCmdCancelTaskInDTO2;
import com.iotplatform.client.dto.QueryDeviceCmdCancelTaskOutDTO;
import com.iotplatform.client.dto.QueryDeviceCmdCancelTaskOutDTO2;
import com.iotplatform.client.dto.QueryDeviceCommandInDTO;
import com.iotplatform.client.dto.QueryDeviceCommandInDTO2;
import com.iotplatform.client.dto.QueryDeviceCommandOutDTO;
import com.iotplatform.client.dto.QueryDeviceCommandOutDTO2;
import com.iotplatform.client.dto.UpdateDeviceCmdInDTO;
import com.iotplatform.client.dto.UpdateDeviceCmdOutDTO;
import com.iotplatform.client.dto.UpdateDeviceCommandInDTO;
import com.iotplatform.client.dto.UpdateDeviceCommandOutDTO;
import com.iotplatform.utils.MapUtil;
import java.util.Map;

public class SignalDelivery {
    private NorthApiClient northApiClient;
    private ClientService clientService;

    public SignalDelivery() {
        this.northApiClient = DefaultNorthApiClient.getDefaultApiClient();
        this.clientService = new ClientService();
    }

    public SignalDelivery(NorthApiClient northApiClient) {
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

    public PostDeviceCommandOutDTO2 postDeviceCommand(PostDeviceCommandInDTO2 pdcInDTO, String appId, String accessToken) throws NorthApiException {
        Class<PostDeviceCommandOutDTO2> returnType = PostDeviceCommandOutDTO2.class;
        return (PostDeviceCommandOutDTO2)this.northApiClient.invokeAPI(appId, accessToken, "POST", "/iocm/app/cmd/v1.4.0/deviceCommands", (Map)null, pdcInDTO, returnType);
    }

    public QueryDeviceCommandOutDTO2 queryDeviceCommand(QueryDeviceCommandInDTO2 qdcInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qdcInDTO);
        Class<QueryDeviceCommandOutDTO2> returnType = QueryDeviceCommandOutDTO2.class;
        return (QueryDeviceCommandOutDTO2)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/cmd/v1.4.0/deviceCommands", queryParams, (Object)null, returnType);
    }

    public UpdateDeviceCommandOutDTO updateDeviceCommand(UpdateDeviceCommandInDTO udcInDTO, String deviceCommandId, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(deviceCommandId);
        Class<UpdateDeviceCommandOutDTO> returnType = UpdateDeviceCommandOutDTO.class;
        return (UpdateDeviceCommandOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "PUT", "/iocm/app/cmd/v1.4.0/deviceCommands/" + deviceCommandId, (Map)null, udcInDTO, returnType);
    }

    public CreateDeviceCmdCancelTaskOutDTO createDeviceCmdCancelTask(CreateDeviceCmdCancelTaskInDTO cdcctInDTO, String appId, String accessToken) throws NorthApiException {
        Class<CreateDeviceCmdCancelTaskOutDTO> returnType = CreateDeviceCmdCancelTaskOutDTO.class;
        return (CreateDeviceCmdCancelTaskOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "POST", "/iocm/app/cmd/v1.4.0/deviceCommandCancelTasks", (Map)null, cdcctInDTO, returnType);
    }

    public QueryDeviceCmdCancelTaskOutDTO2 queryDeviceCmdCancelTask(QueryDeviceCmdCancelTaskInDTO2 qdcctInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qdcctInDTO);
        Class<QueryDeviceCmdCancelTaskOutDTO2> returnType = QueryDeviceCmdCancelTaskOutDTO2.class;
        return (QueryDeviceCmdCancelTaskOutDTO2)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/cmd/v1.4.0/deviceCommandCancelTasks", queryParams, (Object)null, returnType);
    }

    /** @deprecated */
    @Deprecated
    public PostDeviceCommandOutDTO postDeviceCommand(PostDeviceCommandInDTO pdcInDTO, String appId, String accessToken) throws NorthApiException {
        Class<PostDeviceCommandOutDTO> returnType = PostDeviceCommandOutDTO.class;
        return (PostDeviceCommandOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "POST", "/iocm/app/cmd/v1.4.0/deviceCommands", (Map)null, pdcInDTO, returnType);
    }

    /** @deprecated */
    @Deprecated
    public QueryDeviceCommandOutDTO queryDeviceCommand(QueryDeviceCommandInDTO qdcInDTO, String appId, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qdcInDTO);
        Class<QueryDeviceCommandOutDTO> returnType = QueryDeviceCommandOutDTO.class;
        return (QueryDeviceCommandOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/cmd/v1.4.0/deviceCommands", queryParams, (Object)null, returnType);
    }

    /** @deprecated */
    @Deprecated
    public DeviceCmdCancelTaskOutDTO createDeviceCmdCancelTaskV4(DeviceCmdCancelTaskInDTO dcctInDTO, String appId, String accessToken) throws NorthApiException {
        Class<DeviceCmdCancelTaskOutDTO> returnType = DeviceCmdCancelTaskOutDTO.class;
        return (DeviceCmdCancelTaskOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "POST", "/iocm/app/cmd/v1.4.0/deviceCommandCancelTasks", (Map)null, dcctInDTO, returnType);
    }

    /** @deprecated */
    @Deprecated
    public QueryDeviceCmdCancelTaskOutDTO queryDeviceCmdCancelTask(QueryDeviceCmdCancelTaskInDTO qdcctInDTO, String appId, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qdcctInDTO);
        Class<QueryDeviceCmdCancelTaskOutDTO> returnType = QueryDeviceCmdCancelTaskOutDTO.class;
        return (QueryDeviceCmdCancelTaskOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/cmd/v1.4.0/deviceCommandCancelTasks", queryParams, (Object)null, returnType);
    }

    /** @deprecated */
    @Deprecated
    public UpdateDeviceCmdOutDTO updateDeviceCommand(UpdateDeviceCmdInDTO udcid, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(udcid);
        this.clientService.checkInput(udcid.getDeviceCommandId());
        Class<UpdateDeviceCmdOutDTO> returnType = UpdateDeviceCmdOutDTO.class;
        return (UpdateDeviceCmdOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/cmd/v1.4.0/deviceCommands/" + udcid.getDeviceCommandId(), (Map)null, udcid.getUpdateDeviceCommandReq(), returnType);
    }
}
