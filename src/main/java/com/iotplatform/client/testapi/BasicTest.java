//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client.testapi;

import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.AuthOutDTO;
import com.iotplatform.client.dto.AuthRefreshInDTO;
import com.iotplatform.client.dto.AuthRefreshOutDTO;
import com.iotplatform.client.dto.ClientInfo;
import com.iotplatform.client.dto.ModifyDeviceInforInDTO;
import com.iotplatform.client.dto.RegDirectDeviceInDTO2;
import com.iotplatform.client.dto.RegDirectDeviceOutDTO;
import com.iotplatform.client.dto.SSLConfig;
import com.iotplatform.client.invokeapi.Authentication;
import com.iotplatform.client.invokeapi.DeviceManagement;
import com.iotplatform.utils.PropertyUtil;
import java.util.Random;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class BasicTest {
    private static String accessToken_;
    private static String refreshToken_;
    private static NorthApiClient northApiClient_ = new NorthApiClient();
    private static HostnameVerifier hostnameVerifier_ = null;

    public BasicTest() {
    }

    private static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println("Begin test...");
        System.out.println("==> " + path);
        PropertyUtil.init("./config.properties");
        SSLConfig sslConfig = new SSLConfig();
        if (isEmpty(PropertyUtil.getProperty("newCaFile"))) {
            sslConfig = null;
        } else {
            sslConfig.setTrustCAPath(PropertyUtil.getProperty("newCaFile"));
            sslConfig.setTrustCAPwd(PropertyUtil.getProperty("newCaPassword"));
            sslConfig.setSelfCertPath(PropertyUtil.getProperty("newClientCertFile"));
            sslConfig.setSelfCertPwd(PropertyUtil.getProperty("newClientCertPassword"));
        }

        if ("false".equals(PropertyUtil.getProperty("hostNameVerify"))) {
            hostnameVerifier_ = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };
        }

        beginBasicTest(PropertyUtil.getProperty("platformIp"), PropertyUtil.getProperty("platformPort"), PropertyUtil.getProperty("appId"), PropertyUtil.getProperty("secret"), sslConfig);
    }

    public static void beginBasicTest(String platformIp, String platformPort, String appId, String secret, SSLConfig sslConfig) {
        if (isEmpty(platformIp) || isEmpty(platformPort) || isEmpty(appId) || isEmpty(secret)) {
            System.out.println("the input parameters (ip/port/appId/secret) cannot be null or empty string");
        }

        int loginResult = login(platformIp, platformPort, appId, secret, sslConfig);
        if (loginResult > 0) {
            refreshToken(appId, secret, refreshToken_);
            DeviceManagement deviceManagement = new DeviceManagement(northApiClient_);
            Random random = new Random();
            String nodeId = "test123" + (random.nextInt(9000000) + 1000000);
            RegDirectDeviceOutDTO regDirectDeviceOutDTO = registerDevice(deviceManagement, nodeId, 300);
            modifyDeviceInfo(deviceManagement, regDirectDeviceOutDTO.getDeviceId(), nodeId, appId);
            deleteDevice(deviceManagement, regDirectDeviceOutDTO.getDeviceId());
        }

    }

    private static int login(String platformIp, String platformPort, String appId, String secret, SSLConfig sslConfig) {
        int flag = 0;
        ClientInfo clientInfo = new ClientInfo();
        clientInfo.setPlatformIp(platformIp);
        clientInfo.setPlatformPort(platformPort);
        clientInfo.setAppId(appId);
        clientInfo.setSecret(secret);
        NorthApiClient northApiClient_1 = new NorthApiClient();

        try {
            northApiClient_1.setClientInfo(clientInfo);
            northApiClient_1.initSSLConfig();
            Authentication authentication = new Authentication(northApiClient_1);
            AuthOutDTO authOutDTO = authentication.getAuthToken();
            if (authOutDTO != null && authOutDTO.getAccessToken().length() > 0) {
                System.out.println("[Y] getAuthToken() 1, get accesstoken successfully with inner certificates");
                System.out.println(authOutDTO.toString());
                northApiClient_.setClientInfo(clientInfo);
                northApiClient_.initSSLConfig();
                accessToken_ = authOutDTO.getAccessToken();
                refreshToken_ = authOutDTO.getRefreshToken();
                ++flag;
            }
        } catch (NorthApiException var12) {
            if (!var12.getHttpMessage().contains("Connection refused") && !var12.getHttpMessage().contains("Connection timed out")) {
                if (var12.getHttpMessage().contains("handshake_failure")) {
                    System.out.println("[X]" + var12.getHttpMessage());
                    System.out.println("[X] getAuthToken() 1, connection error, please make sure the inner test certificates are supported by the platform");
                } else if (var12.getHttpMessage().contains("No trusted certificate found")) {
                    System.out.println("[X] " + var12.getHttpMessage());
                    System.out.println("[X] getAuthToken() 1, connection error, please make sure the inner test certificates are right, and make sure they are under the right path");
                } else if (var12.getHttpMessage().contains("Invalid keystore format")) {
                    System.out.println("[X] " + var12.getHttpMessage());
                    System.out.println("[X] getAuthToken() 1, the format of the inner test certificates are not right, please check");
                } else if (var12.getHttpMessage().contains("password was incorrect")) {
                    System.out.println("[X] " + var12.getHttpMessage());
                    System.out.println("[X] getAuthToken() 1, the input password of the inner test certificates are not right, please check");
                } else {
                    System.out.println("[X] getAuthToken() 1, " + var12.getError_desc() + "  " + var12.getHttpMessage());
                }
            } else {
                System.out.println("[X] " + var12.getHttpMessage());
                System.out.println("[X] getAuthToken() 1 , connection error, please make sure the input platform ip and port are right, and check your network with the platform");
            }
        }

        if (sslConfig != null) {
            NorthApiClient northApiClient_2 = new NorthApiClient();

            try {
                northApiClient_2.setClientInfo(clientInfo);
                if (hostnameVerifier_ != null) {
                    northApiClient_.setHostnameVerifier(hostnameVerifier_);
                }

                northApiClient_2.initSSLConfig(sslConfig);
                Authentication authentication = new Authentication(northApiClient_2);
                AuthOutDTO authOutDTO = authentication.getAuthToken();
                if (authOutDTO != null && authOutDTO.getAccessToken() != null) {
                    System.out.println("[Y] getAuthToken() 2, get accesstoken successfully with your own certificates");
                    System.out.println(authOutDTO.toString());
                    northApiClient_.setClientInfo(clientInfo);
                    if (hostnameVerifier_ != null) {
                        northApiClient_.setHostnameVerifier(hostnameVerifier_);
                    }

                    northApiClient_.initSSLConfig(sslConfig);
                    accessToken_ = authOutDTO.getAccessToken();
                    refreshToken_ = authOutDTO.getRefreshToken();
                    ++flag;
                    return flag;
                }
            } catch (NorthApiException var11) {
                if (var11.getHttpMessage().contains("handshake_failure")) {
                    System.out.println("[X]" + var11.getHttpMessage());
                    System.out.println("[X] getAuthToken() 2, connection error, please make sure your certificates are supported by the platform");
                } else if (var11.getHttpMessage().contains("No trusted certificate found")) {
                    System.out.println("[X] " + var11.getHttpMessage());
                    System.out.println("[X] getAuthToken() 2, connection error, please make sure your certificates are right, and make sure they are under the right path");
                } else if (var11.getHttpMessage().contains("Invalid keystore format")) {
                    System.out.println("[X] " + var11.getHttpMessage());
                    System.out.println("[X] getAuthToken() 2, the format of your certificates are not right, please check");
                } else if (var11.getHttpMessage().contains("password was incorrect")) {
                    System.out.println("[X] " + var11.getHttpMessage());
                    System.out.println("[X] getAuthToken() 2, the input password of your certificates are not right, please check");
                } else {
                    System.out.println("[X] getAuthToken() 2, " + var11.getError_desc() + "  " + var11.getHttpMessage());
                }

                if (flag > 0) {
                    System.out.println("[X] getAuthToken() 2, somehting is wrong with your certificates, please check. There's no problem with inner certificates");
                }

                return flag;
            }
        }

        return flag;
    }

    private static void refreshToken(String appId, String secret, String refreshToken) {
        AuthRefreshInDTO authRefreshInDTO = new AuthRefreshInDTO();
        authRefreshInDTO.setAppId(appId);
        authRefreshInDTO.setSecret(secret);
        authRefreshInDTO.setRefreshToken(refreshToken);
        Authentication authentication = new Authentication(northApiClient_);

        try {
            new AuthRefreshOutDTO();
            AuthRefreshOutDTO out = authentication.refreshAuthToken(authRefreshInDTO);
            accessToken_ = out.getAccessToken();
            System.out.println("[Y] refreshAuthToken() succeeded, " + out.toString());
        } catch (NorthApiException var6) {
            System.out.println("[X] refreshAuthToken() failed, " + var6.toString());
        }

    }

    private static RegDirectDeviceOutDTO registerDevice(DeviceManagement deviceManagement, String nodeId, int timeout) {
        RegDirectDeviceInDTO2 regDirectDeviceInDTO = new RegDirectDeviceInDTO2();
        regDirectDeviceInDTO.setNodeId(nodeId);
        regDirectDeviceInDTO.setVerifyCode(nodeId);
        regDirectDeviceInDTO.setTimeout(timeout);

        try {
            new RegDirectDeviceOutDTO();
            RegDirectDeviceOutDTO regDirectDeviceOutDTO = deviceManagement.regDirectDevice(regDirectDeviceInDTO, (String)null, accessToken_);
            System.out.println("[Y] regDirectDevice() succeeded, " + regDirectDeviceOutDTO.toString());
            return regDirectDeviceOutDTO;
        } catch (NorthApiException var5) {
            System.out.println("[X] regDirectDevice() failed, " + var5.toString());
            return null;
        }
    }

    private static void modifyDeviceInfo(DeviceManagement deviceManagement, String deviceId, String deviceName, String appId) {
        ModifyDeviceInforInDTO mdiInDto = new ModifyDeviceInforInDTO();
        mdiInDto.setName(deviceName);
        mdiInDto.setDeviceType("WaterMeter");
        mdiInDto.setManufacturerId("Huawei");
        mdiInDto.setManufacturerName("Huawei");
        mdiInDto.setModel("NBIoTDevice");
        mdiInDto.setProtocolType("CoAP");

        try {
            deviceManagement.modifyDeviceInfo(mdiInDto, deviceId, appId, accessToken_);
            System.out.println("[Y] modifyDeviceInfo() succeeded");
        } catch (NorthApiException var6) {
            System.out.println("[X] modifyDeviceInfo() failed, " + var6.toString());
        }

    }

    private static void deleteDevice(DeviceManagement deviceManagement, String deviceId) {
        try {
            deviceManagement.deleteDirectDevice(deviceId, (Boolean)null, (String)null, accessToken_);
            System.out.println("[Y] deleteDevice() succeeded");
        } catch (NorthApiException var3) {
            System.out.println("[X] deleteDevice() failed, " + var3.toString());
        }

    }
}
