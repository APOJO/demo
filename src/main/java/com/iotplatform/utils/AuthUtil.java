package com.iotplatform.utils;

import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.ClientInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AuthUtil {

    private static NorthApiClient northApiClient = null;

    private static String platformIp;
    private static String platformPort;
    private static String appId;
    private static String secret;
    @Value("${platformIp}")
    public  void setPlatformIp(String platformIp) {
        AuthUtil.platformIp = platformIp;
    }
    @Value("${platformPort}")
    public  void setPlatformPort(String platformPort) {
        AuthUtil.platformPort = platformPort;
    }
    @Value("${appId}")
    public  void setAppId(String appId) {
        AuthUtil.appId = appId;
    }
    @Value("${secret}")
    public  void setSecret(String secret) {
        AuthUtil.secret = secret;
    }


    public static NorthApiClient initApiClient() {
        if (northApiClient != null) {
            return northApiClient;
        }
        northApiClient = new NorthApiClient();

       // PropertyUtil.init(authPath);

        ClientInfo clientInfo = new ClientInfo();
        clientInfo.setPlatformIp(platformIp);
        clientInfo.setPlatformPort(platformPort);
        clientInfo.setAppId(appId);
        clientInfo.setSecret(secret);
       // clientInfo.setSecret(getAesPropertyValue("secret"));

        try {
            northApiClient.setClientInfo(clientInfo);
            northApiClient.initSSLConfig();
        } catch (NorthApiException e) {
            System.out.println(e.toString());
        }

        return northApiClient;
    }

    public static String getAesPropertyValue(String propertyName) {
        String aesPwd = "123987"; //this is a test AES password

//      String originalProperty = "gPnTWO52yrobtjyobykkf12P8f4a";
//      byte[] temp = AesUtil.encrypt(originalProperty, aesPwd);
//      String hexStrResult = HexParser.parseByte2HexStr(temp);
//      System.out.println("encrypted secret hex sting is ："  + hexStrResult);

        //PropertyUtil.init(authPath);
        byte[] secret = HexParser.parseHexStr2Byte(PropertyUtil.getProperty(propertyName));
        return new String(AesUtil.decrypt(secret, aesPwd));
    }
}
