//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client;

import com.iotplatform.client.dto.ClientInfo;
import com.iotplatform.constant.ExceptionEnum;
import java.util.Map;

public class ClientService {
    public ClientService() {
    }

    public void checkClientInfo(ClientInfo ci) throws NorthApiException {
        if (ci == null) {
            throw new NorthApiException(ExceptionEnum.CLIENT_INFO_ERROR);
        } else if (ci.getPlatformIp() != null && !"".equals(ci.getPlatformIp())) {
            if (ci.getPlatformPort() != null && !"".equals(ci.getPlatformPort())) {
                if (ci.getAppId() != null && !"".equals(ci.getAppId())) {
                    if (!ci.getAppId().contains(" ") && !ci.getSecret().contains(" ")) {
                        if (ci.getSecret() == null || "".equals(ci.getSecret())) {
                            throw new NorthApiException(ExceptionEnum.CLIENT_INFO_ERROR);
                        }
                    } else {
                        throw new NorthApiException(ExceptionEnum.APPID_SECRET_INCLUDE_SPACE);
                    }
                } else {
                    throw new NorthApiException(ExceptionEnum.CLIENT_INFO_ERROR);
                }
            } else {
                throw new NorthApiException(ExceptionEnum.CLIENT_INFO_ERROR);
            }
        } else {
            throw new NorthApiException(ExceptionEnum.CLIENT_INFO_ERROR);
        }
    }

    public void checkAccessToken(String accessToken) throws NorthApiException {
        if (accessToken == null || "".equals(accessToken)) {
            throw new NorthApiException(ExceptionEnum.CLIENT_INPUT_ACCESSTOKEN_INVALID);
        }
    }

    public void checkInput(Object input) throws NorthApiException {
        if (input == null) {
            throw new NorthApiException(ExceptionEnum.CLIENT_INPUT_PARAMETER_INVALID);
        } else if (input instanceof String && "".equals(input)) {
            throw new NorthApiException(ExceptionEnum.CLIENT_INPUT_PARAMETER_INVALID);
        }
    }

    public void putInIfValueNotEmpty(Map<String, String> queryParams, String key, Object value) {
        if (value != null) {
            queryParams.put(key, value.toString());
        }

    }

    public void putInIfObjectNotEmpty(Map<String, Object> queryParams, String key, Object value) {
        if (value != null) {
            queryParams.put(key, value);
        }

    }
}
