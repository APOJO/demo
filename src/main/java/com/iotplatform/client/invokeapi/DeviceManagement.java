//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client.invokeapi;

import com.iotplatform.client.ClientService;
import com.iotplatform.client.DefaultNorthApiClient;
import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.EncryptSetInDTO;
import com.iotplatform.client.dto.ModifyDeviceInfoInDTO;
import com.iotplatform.client.dto.ModifyDeviceInforInDTO;
import com.iotplatform.client.dto.ModifyDeviceShadowInDTO;
import com.iotplatform.client.dto.QueryDeviceRealtimeLocationInDTO;
import com.iotplatform.client.dto.QueryDeviceRealtimeLocationOutDTO;
import com.iotplatform.client.dto.QueryDeviceShadowOutDTO;
import com.iotplatform.client.dto.QueryDeviceStatusOutDTO;
import com.iotplatform.client.dto.RefreshDeviceKeyInDTO;
import com.iotplatform.client.dto.RefreshDeviceKeyOutDTO;
import com.iotplatform.client.dto.RefreshVerifyCodeInDTO;
import com.iotplatform.client.dto.RefreshVerifyCodeOutDTO;
import com.iotplatform.client.dto.RegDirectDeviceInDTO;
import com.iotplatform.client.dto.RegDirectDeviceInDTO2;
import com.iotplatform.client.dto.RegDirectDeviceOutDTO;
import java.util.HashMap;
import java.util.Map;

public class DeviceManagement {
    private NorthApiClient northApiClient;
    private ClientService clientService;

    public DeviceManagement() {
        this.northApiClient = DefaultNorthApiClient.getDefaultApiClient();
        this.clientService = new ClientService();
    }

    public DeviceManagement(NorthApiClient northApiClient) {
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

    public RegDirectDeviceOutDTO regDirectDevice(RegDirectDeviceInDTO2 rddInDto, String appId, String accessToken) throws NorthApiException {
        Class<RegDirectDeviceOutDTO> returnType = RegDirectDeviceOutDTO.class;
        return (RegDirectDeviceOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "POST", "/iocm/app/reg/v1.1.0/deviceCredentials", (Map)null, rddInDto, returnType);
    }

    public RefreshDeviceKeyOutDTO refreshDeviceKey(RefreshDeviceKeyInDTO rdkInDTO, String deviceId, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(deviceId);
        Class<RefreshDeviceKeyOutDTO> returnType = RefreshDeviceKeyOutDTO.class;
        return (RefreshDeviceKeyOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "PUT", "/iocm/app/reg/v1.1.0/deviceCredentials/" + deviceId, (Map)null, rdkInDTO, returnType);
    }

    public void modifyDeviceInfo(ModifyDeviceInforInDTO mdiInDto, String deviceId, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(mdiInDto);
        this.clientService.checkInput(deviceId);
        this.northApiClient.invokeAPI(appId, accessToken, "PUT", "/iocm/app/dm/v1.4.0/devices/" + deviceId, (Map)null, mdiInDto, (Class)null);
    }

    public void deleteDirectDevice(String deviceId, Boolean cascade, String appId, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = null;
        if (cascade != null) {
            queryParams = new HashMap();
            this.clientService.putInIfValueNotEmpty(queryParams, "cascade", cascade);
        }

        this.clientService.checkInput(deviceId);
        this.northApiClient.invokeAPI(appId, accessToken, "DELETE", "/iocm/app/dm/v1.4.0/devices/" + deviceId, queryParams, (Object)null, (Class)null);
    }

    public QueryDeviceStatusOutDTO queryDeviceStatus(String deviceId, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(deviceId);
        Class<QueryDeviceStatusOutDTO> returnType = QueryDeviceStatusOutDTO.class;
        return (QueryDeviceStatusOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/reg/v1.1.0/deviceCredentials/" + deviceId, (Map)null, (Object)null, returnType);
    }

    public QueryDeviceRealtimeLocationOutDTO queryDeviceRealtimeLocation(QueryDeviceRealtimeLocationInDTO qdrlInDTO, String appId, String accessToken) throws NorthApiException {
        Class<QueryDeviceRealtimeLocationOutDTO> returnType = QueryDeviceRealtimeLocationOutDTO.class;
        return (QueryDeviceRealtimeLocationOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "POST", "/iocm/app/location/v1.1.0/queryDeviceRealtimeLocation", (Map)null, qdrlInDTO, returnType);
    }

    public QueryDeviceShadowOutDTO queryDeviceShadow(String deviceId, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(deviceId);
        Class<QueryDeviceShadowOutDTO> returnType = QueryDeviceShadowOutDTO.class;
        return (QueryDeviceShadowOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "GET", "/iocm/app/shadow/v1.5.0/devices/" + deviceId, (Map)null, (Object)null, returnType);
    }

    public void modifyDeviceShadow(ModifyDeviceShadowInDTO mdsInDTO, String deviceId, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(deviceId);
        this.northApiClient.invokeAPI(appId, accessToken, "PUT", "/iocm/app/shadow/v1.5.0/devices/" + deviceId, (Map)null, mdsInDTO, (Class)null);
    }

    /** @deprecated */
    @Deprecated
    public RegDirectDeviceOutDTO regDirectDevice(RegDirectDeviceInDTO rddInDto, String appId, String accessToken) throws NorthApiException {
        Class<RegDirectDeviceOutDTO> returnType = RegDirectDeviceOutDTO.class;
        return (RegDirectDeviceOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "POST", "/iocm/app/reg/v1.1.0/devices", (Map)null, rddInDto, returnType);
    }

    /** @deprecated */
    @Deprecated
    public void modifyDeviceInfo(ModifyDeviceInfoInDTO mdiInDto, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(mdiInDto);
        this.clientService.checkInput(mdiInDto.getDeviceId());
        this.northApiClient.invokeAPI(appId, accessToken, "PUT", "/iocm/app/dm/v1.4.0/devices/" + mdiInDto.getDeviceId(), (Map)null, mdiInDto, (Class)null);
    }

    /** @deprecated */
    @Deprecated
    public void deleteDirectDevice(String deviceId, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(deviceId);
        this.northApiClient.invokeAPI(appId, accessToken, "DELETE", "/iocm/app/dm/v1.4.0/devices/" + deviceId, (Map)null, (Object)null, (Class)null);
    }

    /** @deprecated */
    @Deprecated
    public RefreshVerifyCodeOutDTO refreshDeviceSecret(RefreshVerifyCodeInDTO rdsid, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(rdsid);
        this.clientService.checkInput(rdsid.getDeviceId());
        this.clientService.checkInput(rdsid.getRequest());
        Class<RefreshVerifyCodeOutDTO> returnType = RefreshVerifyCodeOutDTO.class;
        return (RefreshVerifyCodeOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "PUT", "/iocm/app/reg/v1.1.0/devices/" + rdsid.getDeviceId(), (Map)null, (Object)null, returnType);
    }

    /** @deprecated */
    @Deprecated
    public void setEncrypt(EncryptSetInDTO esid, String accessToken) throws NorthApiException {
        this.clientService.checkAccessToken(accessToken);
        this.clientService.checkInput(esid);
        this.clientService.checkInput(esid.getDeviceId());
        this.clientService.checkInput(esid.getServiceType());
        this.clientService.checkInput(esid.getRequest());
        String url = String.format("/iocm/app/dm/v1.1.0/devices/%s/services/%s", esid.getDeviceId(), esid.getServiceType());
        this.northApiClient.invokeAPI((String)null, accessToken, "PUT", url, (Map)null, esid.getRequest(), (Class)null);
    }
}
