//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client.invokeapi;

import com.iotplatform.client.ClientService;
import com.iotplatform.client.DefaultNorthApiClient;
import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.CreateDeviceGroupInDTO;
import com.iotplatform.client.dto.CreateDeviceGroupOutDTO;
import com.iotplatform.client.dto.DeviceGroupWithDeviceListDTO;
import com.iotplatform.client.dto.ModifyDeviceGroupInDTO;
import com.iotplatform.client.dto.ModifyDeviceGroupOutDTO;
import com.iotplatform.client.dto.QueryDeviceGroupMembersInDTO;
import com.iotplatform.client.dto.QueryDeviceGroupMembersOutDTO;
import com.iotplatform.client.dto.QueryDeviceGroupsInDTO;
import com.iotplatform.client.dto.QueryDeviceGroupsOutDTO;
import com.iotplatform.client.dto.QuerySingleDeviceGroupOutDTO;
import com.iotplatform.utils.MapUtil;
import java.util.HashMap;
import java.util.Map;

public class DeviceGroupManagement {
    private NorthApiClient northApiClient;
    private ClientService clientService;

    public DeviceGroupManagement() {
        this.northApiClient = DefaultNorthApiClient.getDefaultApiClient();
        this.clientService = new ClientService();
    }

    public DeviceGroupManagement(NorthApiClient northApiClient) {
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

    private Map<String, String> getQueryParas(String accessAppId) {
        if (accessAppId == null) {
            return null;
        } else {
            Map<String, String> queryParams = new HashMap();
            this.clientService.putInIfValueNotEmpty(queryParams, "accessAppId", accessAppId);
            return queryParams;
        }
    }

    public CreateDeviceGroupOutDTO createDeviceGroup(CreateDeviceGroupInDTO cdgInDTO, String accessToken) throws NorthApiException {
        Class<CreateDeviceGroupOutDTO> returnType = CreateDeviceGroupOutDTO.class;
        return (CreateDeviceGroupOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "POST", "/iocm/app/devgroup/v1.3.0/devGroups", (Map)null, cdgInDTO, returnType);
    }

    public void deleteDeviceGroup(String devGroupId, String accessAppId, String accessToken) throws NorthApiException {
        this.northApiClient.invokeAPI((String)null, accessToken, "DELETE", "/iocm/app/devgroup/v1.3.0/devGroups/" + devGroupId, this.getQueryParas(accessAppId), (Object)null, (Class)null);
    }

    public ModifyDeviceGroupOutDTO modifyDeviceGroup(ModifyDeviceGroupInDTO mdgInDTO, String devGroupId, String accessAppId, String accessToken) throws NorthApiException {
        Class<ModifyDeviceGroupOutDTO> returnType = ModifyDeviceGroupOutDTO.class;
        return (ModifyDeviceGroupOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "PUT", "/iocm/app/devgroup/v1.3.0/devGroups/" + devGroupId, this.getQueryParas(accessAppId), mdgInDTO, returnType);
    }

    public QueryDeviceGroupsOutDTO queryDeviceGroups(QueryDeviceGroupsInDTO qdgInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qdgInDTO);
        Class<QueryDeviceGroupsOutDTO> returnType = QueryDeviceGroupsOutDTO.class;
        return (QueryDeviceGroupsOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/devgroup/v1.3.0/devGroups", queryParams, qdgInDTO, returnType);
    }

    public QuerySingleDeviceGroupOutDTO querySingleDeviceGroup(String devGroupId, String accessAppId, String accessToken) throws NorthApiException {
        Class<QuerySingleDeviceGroupOutDTO> returnType = QuerySingleDeviceGroupOutDTO.class;
        return (QuerySingleDeviceGroupOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/devgroup/v1.3.0/devGroups/" + devGroupId, this.getQueryParas(accessAppId), (Object)null, returnType);
    }

    public QueryDeviceGroupMembersOutDTO queryDeviceGroupMembers(QueryDeviceGroupMembersInDTO qdgmInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qdgmInDTO);
        Class<QueryDeviceGroupMembersOutDTO> returnType = QueryDeviceGroupMembersOutDTO.class;
        return (QueryDeviceGroupMembersOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/dm/v1.2.0/devices/ids", queryParams, (Object)null, returnType);
    }

    public DeviceGroupWithDeviceListDTO addDevicesToGroup(DeviceGroupWithDeviceListDTO dgwdlDTO, String accessAppId, String accessToken) throws NorthApiException {
        Class<DeviceGroupWithDeviceListDTO> returnType = DeviceGroupWithDeviceListDTO.class;
        return (DeviceGroupWithDeviceListDTO)this.northApiClient.invokeAPI((String)null, accessToken, "POST", "/iocm/app/dm/v1.1.0/devices/addDevGroupTagToDevices", this.getQueryParas(accessAppId), dgwdlDTO, returnType);
    }

    public void deleteDevicesFromGroup(DeviceGroupWithDeviceListDTO dgwdlDTO, String accessAppId, String accessToken) throws NorthApiException {
        this.northApiClient.invokeAPI((String)null, accessToken, "POST", "/iocm/app/dm/v1.1.0/devices/deleteDevGroupTagFromDevices", this.getQueryParas(accessAppId), dgwdlDTO, (Class)null);
    }
}
