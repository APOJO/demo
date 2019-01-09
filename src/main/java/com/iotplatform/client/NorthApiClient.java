//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client;

import com.iotplatform.client.dto.ClientInfo;
import com.iotplatform.client.dto.SSLConfig;
import com.iotplatform.constant.AuthConstant;
import com.iotplatform.constant.ExceptionEnum;
import com.iotplatform.utils.JsonUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class NorthApiClient {
    private static final int HTTP_STATUSCODE_INVOKE_SUCCESS = 300;
    private static String accessToken = null;
    private static boolean timerFlag = false;
    private static CloseableHttpClient httpClient;
    private static HostnameVerifier hostnameVerifier = null;
    private ClientInfo clientInfo;
    private ClientService clientService = new ClientService();

    public NorthApiClient() {
    }

    public void setClientInfo(ClientInfo clientInfo) throws NorthApiException {
        this.clientService.checkClientInfo(clientInfo);
        this.clientInfo = clientInfo;
    }

    public ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public String getVersion() {
        return "V1.5.1";
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        hostnameVerifier = hostnameVerifier;
    }

    public static boolean isTimerFlag() {
        return timerFlag;
    }

    public static void setTimerFlag(boolean timerFlag) {
        timerFlag = timerFlag;
    }

    public static void setAccessToken(String accessToken) {
        accessToken = accessToken;
    }

    public void initSSLConfig() throws NorthApiException {
        try {
            InputStream isTrustCa = this.getClass().getResourceAsStream("/ca.jks");
            InputStream isSelfCert = this.getClass().getResourceAsStream("/outgoing.CertwithKey.pkcs12");
            KeyStore selfCert = KeyStore.getInstance("pkcs12");
            selfCert.load(isSelfCert, AuthConstant.SELFCERTPWD.toCharArray());
            KeyManagerFactory kmf = KeyManagerFactory.getInstance("sunx509");
            kmf.init(selfCert, AuthConstant.SELFCERTPWD.toCharArray());
            KeyStore caCert = KeyStore.getInstance("jks");
            caCert.load(isTrustCa, AuthConstant.TRUSTCAPWD.toCharArray());
            TrustManagerFactory tmf = TrustManagerFactory.getInstance("sunx509");
            tmf.init(caCert);
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(kmf.getKeyManagers(), tmf.getTrustManagers(), (SecureRandom)null);
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sc, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            httpClient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
        } catch (Exception var9) {
            throw new NorthApiException(ExceptionEnum.CLIENT_SSL_CONFIG_ERROR, var9.getMessage().toString());
        }
    }

    public void initSSLConfig(SSLConfig sslc) throws NorthApiException {
        this.clientService.checkInput(sslc);
        this.clientService.checkInput(sslc.getSelfCertPath());
        this.clientService.checkInput(sslc.getSelfCertPwd());
        this.clientService.checkInput(sslc.getTrustCAPath());
        this.clientService.checkInput(sslc.getTrustCAPwd());

        try {
            KeyStore selfCert = KeyStore.getInstance("pkcs12");
            selfCert.load(new FileInputStream(sslc.getSelfCertPath()), sslc.getSelfCertPwd().toCharArray());
            KeyManagerFactory kmf = KeyManagerFactory.getInstance("sunx509");
            kmf.init(selfCert, sslc.getSelfCertPwd().toCharArray());
            KeyStore caCert = KeyStore.getInstance("jks");
            caCert.load(new FileInputStream(sslc.getTrustCAPath()), sslc.getTrustCAPwd().toCharArray());
            TrustManagerFactory tmf = TrustManagerFactory.getInstance("sunx509");
            tmf.init(caCert);
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(kmf.getKeyManagers(), tmf.getTrustManagers(), (SecureRandom)null);
            SSLConnectionSocketFactory sslsf;
            if (hostnameVerifier == null) {
                sslsf = new SSLConnectionSocketFactory(sc, SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
            } else {
                sslsf = new SSLConnectionSocketFactory(sc, hostnameVerifier);
            }

            httpClient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
        } catch (Exception var8) {
            throw new NorthApiException(ExceptionEnum.CLIENT_SSL_CONFIG_ERROR, var8.getMessage().toString());
        }
    }

    public <T> T invokeAPI(String url, String method, Map<String, String> queryParams, String body, Map<String, String> headerParams, Map<String, String> formParams, String accept, ContentType contentType, String[] authNames, Class<T> returnCls) throws NorthApiException {
        CloseableHttpResponse response = null;

        try {
            response = this.getAPIResponse(url, method, queryParams, body, headerParams, formParams, accept, contentType, authNames);
        } catch (IOException | URISyntaxException var19) {
            throw new NorthApiException(ExceptionEnum.CLIENT_BEFORE_INVOK_ERROR, var19.getMessage().toString());
        }

        int statusCode = response.getStatusLine().getStatusCode();
        String reasonPhrase = response.getStatusLine().getReasonPhrase();
        NorthApiException nae = new NorthApiException();
        nae.setHttpStatusCode(statusCode);
        nae.setHttpReasonPhase(reasonPhrase);
        switch(statusCode) {
            case 204:
                return null;
            default:
                String responseContentType = response.getEntity().getContentType().toString();
                String respContent = null;

                try {
                    respContent = EntityUtils.toString(response.getEntity());
                } catch (IOException | ParseException var18) {
                    throw new NorthApiException(ExceptionEnum.CLIENT_AFTER_INVOK_ERROR, var18.getMessage().toString());
                }

                if (respContent.contains("error_code")) {
                    Map<String, String> error = new HashMap();
                    error = (Map)JsonUtil.jsonString2SimpleObj(respContent, error.getClass());
                    if (error.get("error_code") == null) {
                        return JsonUtil.jsonString2SimpleObj(respContent, returnCls);
                    } else {
                        nae.setError_code((String)error.get("error_code"));
                        nae.setError_desc((String)error.get("error_desc"));
                        throw nae;
                    }
                } else if (statusCode < 300) {
                    return "".equals(respContent) ? null : JsonUtil.jsonString2SimpleObj(respContent, returnCls);
                } else if (!responseContentType.contains("json")) {
                    nae.setHttpMessage(respContent);
                    nae.setError_code(ExceptionEnum.PORT_ERROR.getErrorCode());
                    nae.setError_desc(ExceptionEnum.PORT_ERROR.getErrorDesc());
                    throw nae;
                } else {
                    nae.setHttpMessage(respContent);
                    nae.setError_code(ExceptionEnum.CLIENT_ERROR_BUT_NO_ERRORCODE.getErrorCode());
                    nae.setError_desc(ExceptionEnum.CLIENT_ERROR_BUT_NO_ERRORCODE.getErrorDesc());
                    throw nae;
                }
        }
    }

    private void fillQueryParas(Map<String, String> queryParams, String appId) {
        if (appId != null) {
            if (queryParams == null) {
                queryParams = new HashMap();
            }

            this.clientService.putInIfValueNotEmpty((Map)queryParams, "appId", appId);
        }
    }

    private Map<String, String> getHeaders(String appId, String accessToken) {
        Map<String, String> header = new HashMap();
        header.put("app_key", appId);
        header.put("Authorization", "Bearer " + accessToken);
        return header;
    }

    public <T> T invokeAPI(String appId, String accessToken, String httpMethod, String url_postfix, Map<String, String> queryParams, Object inputBodyDto, Class<T> returnType) throws NorthApiException {
        if (accessToken == null && timerFlag) {
            accessToken = accessToken;
        }

        this.clientService.checkAccessToken(accessToken);
        ClientInfo clientInfo = this.getClientInfo();
        this.clientService.checkClientInfo(clientInfo);
        String requestBody;
        if (!"POST".equals(httpMethod) && !"PUT".equals(httpMethod)) {
            requestBody = null;
        } else {
            this.clientService.checkInput(inputBodyDto);
            JsonConfig jsonConfig = JsonUtil.getJsonConfigWithFilter();
            requestBody = JSONObject.fromObject(inputBodyDto, jsonConfig).toString();
            if (requestBody.contains("bigDecimal") && requestBody.contains("bigInteger") && requestBody.contains("floatingPointNumber")) {
                requestBody = JsonUtil.jsonObj2Sting(inputBodyDto);
            }
        }

        String url = "https://" + clientInfo.getPlatformIp() + ":" + clientInfo.getPlatformPort() + url_postfix;
        this.fillQueryParas(queryParams, appId);
        Map<String, String> headers = this.getHeaders(clientInfo.getAppId(), accessToken);
        return (T) this.invokeAPI(url, httpMethod, queryParams, requestBody, headers, (Map)null, (String)null, ContentType.APPLICATION_JSON, (String[])null, returnType);
    }

    private CloseableHttpResponse getAPIResponse(String url, String method, Map<String, String> queryParams, String body, Map<String, String> headerParams, Map<String, String> formParams, String accept, ContentType contentType, String[] authNames) throws URISyntaxException, NorthApiException, IOException {
        CloseableHttpResponse response = null;
        if ("GET".equals(method)) {
            HttpGet request = new HttpGet();
            addRequestHeader(request, headerParams);
            URIBuilder builder = new URIBuilder(url);
            if (queryParams != null && !queryParams.isEmpty()) {
                builder.setParameters(this.paramsConverter(queryParams));
            }

            request.setURI(builder.build());
            response = httpClient.execute(request);
        } else if ("POST".equals(method)) {
            HttpPost request = new HttpPost();
            addRequestHeader(request, headerParams);
            this.addURI(request, queryParams, url);
            HttpEntity he = contentType == null ? new UrlEncodedFormEntity(this.paramsConverter(formParams)) : new StringEntity(body, ContentType.APPLICATION_JSON);
            request.setEntity((HttpEntity)he);
            response = httpClient.execute(request);
        } else if ("PUT".equals(method)) {
            HttpPut request = new HttpPut();
            addRequestHeader(request, headerParams);
            this.addURI(request, queryParams, url);
            if (body != null) {
                HttpEntity he = new StringEntity(body, ContentType.APPLICATION_JSON);
                request.setEntity(he);
            }

            response = httpClient.execute(request);
        } else {
            if (!"DELETE".equals(method)) {
                throw new NorthApiException(ExceptionEnum.CLIENT_INVALID_METHOD);
            }

            HttpDelete request = new HttpDelete();
            addRequestHeader(request, headerParams);
            this.addURI(request, queryParams, url);
            response = httpClient.execute(request);
        }

        return response;
    }

    private void addURI(HttpRequestBase request, Map<String, String> queryParams, String url) throws URISyntaxException {
        URIBuilder builder;
        try {
            builder = new URIBuilder(url);
        } catch (URISyntaxException var6) {
            System.out.printf("URISyntaxException: {}", var6);
            throw var6;
        }

        if (queryParams != null && !queryParams.isEmpty()) {
            builder.setParameters(this.paramsConverter(queryParams));
        }

        request.setURI(builder.build());
    }

    private List<NameValuePair> paramsConverter(Map<String, String> params) {
        List<NameValuePair> nvps = new LinkedList();
        Set<Entry<String, String>> paramsSet = params.entrySet();
        Iterator var5 = paramsSet.iterator();

        while(var5.hasNext()) {
            Entry<String, String> paramEntry = (Entry)var5.next();
            nvps.add(new BasicNameValuePair((String)paramEntry.getKey(), (String)paramEntry.getValue()));
        }

        return nvps;
    }

    private static void addRequestHeader(HttpUriRequest request, Map<String, String> headerMap) {
        if (headerMap != null) {
            Iterator var3 = headerMap.keySet().iterator();

            while(var3.hasNext()) {
                String headerName = (String)var3.next();
                if (!"Content-Length".equalsIgnoreCase(headerName)) {
                    String headerValue = (String)headerMap.get(headerName);
                    request.addHeader(headerName, headerValue);
                }
            }

        }
    }
}
