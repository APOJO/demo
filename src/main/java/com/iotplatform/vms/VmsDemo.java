package com.iotplatform.vms;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dyvmsapi.model.v20170525.SingleCallByTtsRequest;
import com.aliyuncs.dyvmsapi.model.v20170525.SingleCallByTtsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ Idea 2018.1
 * Company:SBKJ
 *
 * @author Arlen
 * @email wanglei940117@gmail.com
 * @date 2019-01-20
 * @time 23:46
 */
public class VmsDemo  {

    //产品名称:云通信语音API产品,开发者无需替换
    static final String product = "Dyvmsapi";
    //产品域名,开发者无需替换
    static final String domain = "dyvmsapi.aliyuncs.com";

    //TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
    static final String accessKeyId = "LTAIdRjrJWUVn1mm";
    static final String accessKeySecret = "e63u6lO3Bnlk9aDeLjSnKulzZ0qRiT";

    /**
     * 文本转语音外呼
     * @return
     * @throws ClientException
     */
    private static SingleCallByTtsResponse singleCallByTts(SingleCallByTtsRequest request ) throws ClientException {

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);


        //可选-外部扩展字段,此ID将在回执消息中带回给调用方
        //request.setOutId("yourOutId");

        //hint 此处可能会抛出异常，注意catch
        SingleCallByTtsResponse singleCallByTtsResponse = acsClient.getAcsResponse(request);

        return singleCallByTtsResponse;

    }

    /**
     * 测试方法
     * @author  Arlen
     * @date    2019/1/21 0:04
     * @params
     * @return
     */
    public static void main(String[] args) throws ClientException, InterruptedException {
//        //组装请求对象-具体描述见控制台-文档部分内容
//        SingleCallByTtsRequest request = new SingleCallByTtsRequest();
//        //必填-被叫显号,可在语音控制台中找到所购买的显号
//        request.setCalledShowNumber("031166857110");
//        //必填-被叫号码
//        request.setCalledNumber("15032865101");
//        //必填-Tts模板ID
//        request.setTtsCode("TTS_112470691");
//
//        SingleCallByTtsResponse singleCallByTtsResponse = singleCallByTts(request);
//
//        System.out.println("文本转语音外呼---------------");
//        System.out.println("RequestId=" + singleCallByTtsResponse.getRequestId());
//        System.out.println("Code=" + singleCallByTtsResponse.getCode());
//        System.out.println("Message=" + singleCallByTtsResponse.getMessage());
//        System.out.println("CallId=" + singleCallByTtsResponse.getCallId());
//
//        Thread.sleep(20000L);
        String showNumber = "031166857110";
        String number = "15032865101";
        String ttsID = "TTS_112470691";
        String policeType = "一氧化碳";
        String policeAddress = "石家庄";
        HashMap<String, Object> templateParam = new HashMap<>();
        templateParam.put("police_type", policeType);
        templateParam.put("address", policeAddress);
        new VmsDemo().call(showNumber, number, ttsID, templateParam);

    }

   /**
    * 外呼方法
    * @author  Arlen
    * @date    2019/1/21 0:15
    * @params
    * @return
    */
    public Map<String, Object> call(String showNumber, String number, String ttsID, HashMap<String, Object> templateParam) throws ClientException {
        //组装请求对象-具体描述见控制台-文档部分内容
        SingleCallByTtsRequest request = new SingleCallByTtsRequest();
        //必填-被叫显号,可在语音控制台中找到所购买的显号
        request.setCalledShowNumber(showNumber);
        //必填-被叫号码
        request.setCalledNumber(number);
        //必填-Tts模板ID
        request.setTtsCode(ttsID);

        request.setTtsParam(new Gson().toJson(templateParam));

        SingleCallByTtsResponse singleCallByTtsResponse = singleCallByTts(request);

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("code", true);
        responseMap.put("response", singleCallByTtsResponse);
        return responseMap;
    }

}
