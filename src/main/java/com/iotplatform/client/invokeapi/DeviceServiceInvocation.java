//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client.invokeapi;

import com.iotplatform.client.ClientService;
import com.iotplatform.client.DefaultNorthApiClient;
import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.CommandDTO2;
import com.iotplatform.client.dto.DeviceServiceInvocationInDTO;
import com.iotplatform.client.dto.DeviceServiceInvocationOutDTO;
import com.iotplatform.client.dto.InvokeDeviceServiceOutDTO;
import java.util.Map;

public class DeviceServiceInvocation {
    private NorthApiClient northApiClient;
    private ClientService clientService;

    public DeviceServiceInvocation() {
        this.northApiClient = DefaultNorthApiClient.getDefaultApiClient();
        this.clientService = new ClientService();
    }

    public DeviceServiceInvocation(NorthApiClient northApiClient) {
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

    public InvokeDeviceServiceOutDTO invokeDeviceService(String deviceId, String serviceId, CommandDTO2 commandDTO, String appId, String accessToken) throws NorthApiException {
        String url = String.format("/iocm/app/signaltrans/v1.1.0/devices/%s/services/%s/sendCommand", deviceId, serviceId);
        Class<InvokeDeviceServiceOutDTO> returnType = InvokeDeviceServiceOutDTO.class;
        return (InvokeDeviceServiceOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "POST", url, (Map)null, commandDTO, returnType);
    }

    /** @deprecated */
    @Deprecated
    public DeviceServiceInvocationOutDTO invocateDeviceService(DeviceServiceInvocationInDTO dsiid, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(dsiid);
        this.clientService.checkInput(dsiid.getMessage());
        this.clientService.checkInput(dsiid.getDeviceId());
        this.clientService.checkInput(dsiid.getServiceId());
        String url = String.format("/iocm/app/signaltrans/v1.1.0/devices/%s/services/%s/sendCommand", dsiid.getDeviceId(), dsiid.getServiceId());
        Class<DeviceServiceInvocationOutDTO> returnType = DeviceServiceInvocationOutDTO.class;
        return (DeviceServiceInvocationOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "POST", url, (Map)null, dsiid.getMessage(), returnType);
    }
}
