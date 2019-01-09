//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client.invokeapi;

import com.iotplatform.client.ClientService;
import com.iotplatform.client.DefaultNorthApiClient;
import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.AuthOutDTO;
import com.iotplatform.client.dto.AuthRefreshInDTO;
import com.iotplatform.client.dto.AuthRefreshOutDTO;
import com.iotplatform.client.dto.ClientInfo;
import com.iotplatform.utils.JsonUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.http.entity.ContentType;

public class Authentication {
    private NorthApiClient northApiClient;
    private ClientService clientService;
    private static volatile ScheduledExecutorService service = null;

    public Authentication() {
        this.northApiClient = DefaultNorthApiClient.getDefaultApiClient();
        this.clientService = new ClientService();
    }

    public Authentication(NorthApiClient northApiClient) {
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

    public AuthOutDTO getAuthToken() throws NorthApiException {
        ClientInfo clientInfo = this.northApiClient.getClientInfo();
        this.clientService.checkClientInfo(clientInfo);
        String authUrl = "https://" + clientInfo.getPlatformIp() + ":" + clientInfo.getPlatformPort() + "/iocm/app/sec/v1.1.0/login";
        Map<String, String> formParams = new HashMap();
        formParams.put("appId", clientInfo.getAppId());
        formParams.put("secret", clientInfo.getSecret());
        Class<AuthOutDTO> returnType = AuthOutDTO.class;
        AuthOutDTO aOutDTO = (AuthOutDTO)this.northApiClient.invokeAPI(authUrl, "POST", (Map)null, (String)null, (Map)null, formParams, (String)null, (ContentType)null, (String[])null, returnType);
        NorthApiClient.setAccessToken(aOutDTO.getAccessToken());
        return aOutDTO;
    }

    public AuthRefreshOutDTO refreshAuthToken(AuthRefreshInDTO arInDTO) throws NorthApiException {
        this.clientService.checkInput(arInDTO);
        ClientInfo clientInfo = this.northApiClient.getClientInfo();
        this.clientService.checkClientInfo(clientInfo);
        String authUrl = "https://" + clientInfo.getPlatformIp() + ":" + clientInfo.getPlatformPort() + "/iocm/app/sec/v1.1.0/refreshToken";
        Map<String, Object> param = new HashMap();
        this.clientService.putInIfObjectNotEmpty(param, "appId", arInDTO.getAppId());
        this.clientService.putInIfObjectNotEmpty(param, "secret", arInDTO.getSecret());
        this.clientService.putInIfObjectNotEmpty(param, "refreshToken", arInDTO.getRefreshToken());
        String jsonRequest = JsonUtil.jsonObj2Sting(param);
        Class<AuthRefreshOutDTO> returnType = AuthRefreshOutDTO.class;
        AuthRefreshOutDTO afOutDTO = (AuthRefreshOutDTO)this.northApiClient.invokeAPI(authUrl, "POST", (Map)null, jsonRequest, (Map)null, (Map)null, (String)null, ContentType.APPLICATION_JSON, (String[])null, returnType);
        NorthApiClient.setAccessToken(afOutDTO.getAccessToken());
        return afOutDTO;
    }

    public void startRefreshTokenTimer() throws NorthApiException {
        if (!NorthApiClient.isTimerFlag()) {
            Runnable runnable = new Runnable() {
                public void run() {
                    System.out.println("startRefreshTokenTimer() !!");

                    try {
                        AuthOutDTO aOutDTO = Authentication.this.getAuthToken();
                        NorthApiClient.setAccessToken(aOutDTO.getAccessToken());
                    } catch (NorthApiException var2) {
                        var2.printStackTrace();
                    }

                }
            };
            AuthOutDTO aOutDTO = this.getAuthToken();
            NorthApiClient.setAccessToken(aOutDTO.getAccessToken());
            NorthApiClient.setTimerFlag(true);
            int timeLength = 3600;
            if (aOutDTO.getExpiresIn() > 0) {
                timeLength = aOutDTO.getExpiresIn();
            }

            service = Executors.newSingleThreadScheduledExecutor();
            service.scheduleAtFixedRate(runnable, (long)timeLength, (long)timeLength, TimeUnit.SECONDS);
            System.out.println("startRefreshTokenTimer() !! " + timeLength);
        }
    }

    public void stopRefreshTokenTimer() {
        if (NorthApiClient.isTimerFlag()) {
            service.shutdown();
            service = null;
            NorthApiClient.setTimerFlag(false);
        }
    }

    /** @deprecated */
    @Deprecated
    public void logoutAuthToken(String accessToken) throws NorthApiException {
        this.clientService.checkAccessToken(accessToken);
        ClientInfo clientInfo = this.northApiClient.getClientInfo();
        this.clientService.checkClientInfo(clientInfo);
        String url = "https://" + clientInfo.getPlatformIp() + ":" + clientInfo.getPlatformPort() + "/iocm/app/sec/v1.1.0/logout";
        Map<String, Object> param_logout = new HashMap();
        param_logout.put("accessToken", accessToken);
        String jsonRequest = JsonUtil.jsonObj2Sting(param_logout);
        this.northApiClient.invokeAPI(url, "POST", (Map)null, jsonRequest, (Map)null, (Map)null, (String)null, ContentType.APPLICATION_JSON, (String[])null, (Class)null);
    }
}
