//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client.invokeapi;

import com.iotplatform.client.ClientService;
import com.iotplatform.client.DefaultNorthApiClient;
import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.QueryRulesInDTO;
import com.iotplatform.client.dto.QueryRulesInDTO2;
import com.iotplatform.client.dto.RuleCreateOrUpdateOutDTO;
import com.iotplatform.client.dto.RuleDTO;
import com.iotplatform.client.dto.RuleDTO2;
import com.iotplatform.client.dto.RuleStatusBatchChangeInDTO;
import com.iotplatform.client.dto.RuleStatusBatchChangeOutDTO;
import com.iotplatform.client.dto.RuleStatusChangeInDTO;
import com.iotplatform.client.dto.UpdateBatchRuleStatusInDTO;
import com.iotplatform.client.dto.UpdateBatchRuleStatusOutDTO;
import com.iotplatform.client.dto.UpdateRuleStatusInDTO;
import com.iotplatform.utils.MapUtil;
import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RuleEngine {
    private NorthApiClient northApiClient;
    private ClientService clientService;

    public RuleEngine() {
        this.northApiClient = DefaultNorthApiClient.getDefaultApiClient();
        this.clientService = new ClientService();
    }

    public RuleEngine(NorthApiClient northApiClient) {
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

    public RuleCreateOrUpdateOutDTO createRule(RuleDTO2 ruleDTO, String appId, String accessToken) throws NorthApiException {
        Class<RuleCreateOrUpdateOutDTO> returnType = RuleCreateOrUpdateOutDTO.class;
        return (RuleCreateOrUpdateOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "POST", "/iocm/app/rule/v1.2.0/rules", (Map)null, ruleDTO, returnType);
    }

    public RuleCreateOrUpdateOutDTO updateRule(RuleDTO2 ruleDTO, String appId, String accessToken) throws NorthApiException {
        Class<RuleCreateOrUpdateOutDTO> returnType = RuleCreateOrUpdateOutDTO.class;
        return (RuleCreateOrUpdateOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "PUT", "/iocm/app/rule/v1.2.0/rules", (Map)null, ruleDTO, returnType);
    }

    public void deleteRule(String ruleId, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(ruleId);
        this.northApiClient.invokeAPI(appId, accessToken, "DELETE", "/iocm/app/rule/v1.2.0/rules/" + ruleId, (Map)null, (Object)null, (Class)null);
    }

    public List<RuleDTO2> queryRules(QueryRulesInDTO2 qrInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qrInDTO);
        Class<List> returnType = List.class;
        List<Map> list = (List)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/rule/v1.2.0/rules", queryParams, (Object)null, returnType);
        List<RuleDTO2> returnlist = new ArrayList();
        Iterator var8 = list.iterator();

        while(var8.hasNext()) {
            Map ruleDTO2 = (Map)var8.next();

            try {
                RuleDTO2 ruledto = (RuleDTO2)MapUtil.convertMapToObject(RuleDTO2.class, ruleDTO2);
                returnlist.add(ruledto);
            } catch (IllegalAccessException var10) {
                var10.printStackTrace();
            } catch (InstantiationException var11) {
                var11.printStackTrace();
            } catch (InvocationTargetException var12) {
                var12.printStackTrace();
            } catch (IntrospectionException var13) {
                var13.printStackTrace();
            }
        }

        return returnlist;
    }

    public void updateRuleStatus(UpdateRuleStatusInDTO ursInDTO, String appId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(ursInDTO);
        this.clientService.checkInput(ursInDTO.getRuleId());
        this.clientService.checkInput(ursInDTO.getStatus());
        String url = String.format("/iocm/app/rule/v1.2.0/rules/%s/status/%s", ursInDTO.getRuleId(), ursInDTO.getStatus());
        this.northApiClient.invokeAPI(appId, accessToken, "PUT", url, (Map)null, "{}", (Class)null);
    }

    public UpdateBatchRuleStatusOutDTO updateBatchRuleStatus(UpdateBatchRuleStatusInDTO ubrsInDTO, String appId, String accessToken) throws NorthApiException {
        Class<UpdateBatchRuleStatusOutDTO> returnType = UpdateBatchRuleStatusOutDTO.class;
        return (UpdateBatchRuleStatusOutDTO)this.northApiClient.invokeAPI(appId, accessToken, "PUT", "/iocm/app/rule/v1.2.0/rules/status", (Map)null, ubrsInDTO, returnType);
    }

    /** @deprecated */
    @Deprecated
    public RuleCreateOrUpdateOutDTO createRule(RuleDTO ruleDTO, String accessToken) throws NorthApiException {
        Class<RuleCreateOrUpdateOutDTO> returnType = RuleCreateOrUpdateOutDTO.class;
        return (RuleCreateOrUpdateOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "POST", "/iocm/app/reg/v1.1.0/deviceCredentials", (Map)null, ruleDTO, returnType);
    }

    /** @deprecated */
    @Deprecated
    public RuleCreateOrUpdateOutDTO updateRule(RuleDTO ruleDTO, String accessToken) throws NorthApiException {
        Class<RuleCreateOrUpdateOutDTO> returnType = RuleCreateOrUpdateOutDTO.class;
        return (RuleCreateOrUpdateOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "POST", "/iocm/app/reg/v1.1.0/deviceCredentials", (Map)null, ruleDTO, returnType);
    }

    /** @deprecated */
    @Deprecated
    public List<RuleDTO> queryRules(QueryRulesInDTO qrInDTO, String accessToken) throws NorthApiException {
        Map<String, String> queryParams = MapUtil.makeMapByObject(qrInDTO);
        Class<List> returnType = List.class;
        List<Map> list = (List)this.northApiClient.invokeAPI((String)null, accessToken, "GET", "/iocm/app/rule/v1.2.0/rules", queryParams, (Object)null, returnType);
        List<RuleDTO> returnlist = new ArrayList();
        Iterator var8 = list.iterator();

        while(var8.hasNext()) {
            Map map = (Map)var8.next();

            try {
                RuleDTO dto = (RuleDTO)MapUtil.convertMapToObject(RuleDTO.class, map);
                returnlist.add(dto);
            } catch (IllegalAccessException var10) {
                var10.printStackTrace();
            } catch (InstantiationException var11) {
                var11.printStackTrace();
            } catch (InvocationTargetException var12) {
                var12.printStackTrace();
            } catch (IntrospectionException var13) {
                var13.printStackTrace();
            }
        }

        return returnlist;
    }

    /** @deprecated */
    @Deprecated
    public void deleteRule(String ruleId, String accessToken) throws NorthApiException {
        this.clientService.checkInput(ruleId);
        this.northApiClient.invokeAPI((String)null, accessToken, "DELETE", "/iocm/app/rule/v1.2.0/rules/" + ruleId, (Map)null, (Object)null, (Class)null);
    }

    /** @deprecated */
    @Deprecated
    public void changeRuleStatus(RuleStatusChangeInDTO rscid, String accessToken) throws NorthApiException {
        this.clientService.checkInput(rscid);
        this.clientService.checkInput(rscid.getRuleId());
        this.clientService.checkInput(rscid.getStatus());
        String url = String.format("/iocm/app/rule/v1.2.0/rules/%s/status/%s", rscid.getRuleId(), rscid.getStatus());
        this.northApiClient.invokeAPI((String)null, accessToken, "PUT", url, (Map)null, "{}", (Class)null);
    }

    /** @deprecated */
    @Deprecated
    public RuleStatusBatchChangeOutDTO batchChangeRuleStatus(RuleStatusBatchChangeInDTO rsbcid, String accessToken) throws NorthApiException {
        Class<RuleStatusBatchChangeOutDTO> returnType = RuleStatusBatchChangeOutDTO.class;
        return (RuleStatusBatchChangeOutDTO)this.northApiClient.invokeAPI((String)null, accessToken, "PUT", "/iocm/app/rule/v1.2.0/rules/status", (Map)null, rsbcid, returnType);
    }
}
