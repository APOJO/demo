//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.constant;

public enum ExceptionEnum {
    CLIENT_INTERNAL_ERROR("1001", "Client internal error"),
    CLIENT_INVALID_METHOD("1002", "The http method is invalid"),
    CLIENT_BEFORE_INVOK_ERROR("1003", "Process data error before invoke API"),
    CLIENT_AFTER_INVOK_ERROR("1004", "Precess data error after invoke API"),
    CLIENT_ERROR_BUT_NO_ERRORCODE("1005", "Invoke API error but no error_code and error_desc, please refer to httpMessage"),
    CLIENT_SSL_CONFIG_ERROR("1006", "Ssl config error, please check the certificate path"),
    CLIENT_INPUT_PARAMETER_INVALID("1007", "The input parameter of the method is invalid"),
    CLIENT_INFO_ERROR("1008", "Error in clientInfo, Please check whether clientInfo is configured on the BasicTest"),
    CLIENT_INPUT_ACCESSTOKEN_INVALID("1009", "The input accessToken of the method cannot be null or empty"),
    APPID_SECRET_INCLUDE_SPACE("1010", "AppId or secret include some spaces, please remove them"),
    PORT_ERROR("1011", "The input port is not right, please check it"),
    CLIENT_EXC_END("1000", "");

    private String errorCode;
    private String errorDesc;

    private ExceptionEnum(String errorCode, String errorDesc) {
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorDesc() {
        return this.errorDesc;
    }

    public String toString() {
        return this.errorCode + "-" + this.errorDesc;
    }
}
