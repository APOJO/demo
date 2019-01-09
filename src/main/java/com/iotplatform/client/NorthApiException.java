//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client;

import com.iotplatform.constant.ExceptionEnum;

public class NorthApiException extends Exception {
    private static final long serialVersionUID = 8399970226323234964L;
    private String error_code = null;
    private String error_desc = null;
    private int httpStatusCode = -1;
    private String httpReasonPhase = "";
    private String httpMessage = "";

    public NorthApiException() {
    }

    public NorthApiException(Throwable throwable) {
        super(throwable);
    }

    public NorthApiException(ExceptionEnum ee) {
        this.error_code = ee.getErrorCode();
        this.error_desc = ee.getErrorDesc();
    }

    public NorthApiException(ExceptionEnum ee, String httpMessage) {
        this.error_code = ee.getErrorCode();
        this.error_desc = ee.getErrorDesc();
        this.httpMessage = httpMessage;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getError_code() {
        return this.error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_desc() {
        return this.error_desc;
    }

    public void setError_desc(String error_desc) {
        this.error_desc = error_desc;
    }

    public String getHttpMessage() {
        return this.httpMessage;
    }

    public void setHttpMessage(String httpMessage) {
        this.httpMessage = httpMessage;
    }

    public String getHttpReasonPhase() {
        return this.httpReasonPhase;
    }

    public void setHttpReasonPhase(String httpReasonPhase) {
        this.httpReasonPhase = httpReasonPhase;
    }

    public String toString() {
        return "NorthApiException [error_code=" + this.error_code + ", error_desc=" + this.error_desc + ", httpStatusCode=" + this.httpStatusCode + ", httpReasonPhase=" + this.httpReasonPhase + ", httpMessage=" + this.httpMessage + "]";
    }
}
