package com.ecbusiness.utils;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import com.weejinfu.common.util.PropertyReader;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.util.UUID;

/**
 * Description:发送短信工具类
 * <p/>
 * Created by js.lee on 3/30/15.
 */
public class SmsUtils {

    static Logger logger = Logger.getLogger(com.weejinfu.common.util.SmsUtils.class);

    private static String SMS_SEND_URL;
    private static String SMS_ACCOUNT_URL;
    // 这个是随便写的
    private static final String SMS_MSG_EXT;
    // 账户ID，第三方给的
    private static final String CORP_ID;
    // 账户密码，第三方给的
    private static final String CORP_PWD;
    // 服务编号，第三方给的
    private static final String CORP_SERVICE;
    // 发送成功后返回 0#数字
    private static final String FLAG_SUCC;

    static {
        com.weejinfu.common.util.PropertyReader reader = new PropertyReader("sms.properties");
        SMS_SEND_URL = reader.getValueAsString("sms.sendUrl");
        SMS_ACCOUNT_URL = reader.getValueAsString("sms.accountUrl");
        SMS_MSG_EXT = reader.getValueAsString("sms.smsExt");
        CORP_ID = reader.getValueAsString("sms.corpId");
        CORP_PWD = reader.getValueAsString("sms.corpPwd");
        CORP_SERVICE = reader.getValueAsString("sms.corpService");
        FLAG_SUCC = reader.getValueAsString("sms.succFlag");
    }

    /**
     * 发送短信
     * 内容未做验证，请调用方自行预处理
     *
     * @param phone
     * @param content
     * @return
     */
    public static boolean send(String phone, String content) {
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("corp_id", CORP_ID);
//        params.put("corp_pwd", CORP_PWD);
//        params.put("corp_service", CORP_SERVICE);
//        params.put("mobile", phone);
//        params.put("msg_content", content);
//        params.put("corp_msg_id", genMsgID());
//        params.put("ext", SMS_MSG_EXT);
//        String httpResult = HttpClientUtils.post(SMS_SEND_URL, params);
//        logger.info(params.toString() + " --> " + httpResult);
//        return StringUtils.contains(httpResult, FLAG_SUCC);

        try {

            String msgId = genMsgID();

            HttpClient client = new HttpClient();
            PostMethod post = new PostMethod(SMS_SEND_URL);
            post.addRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=gbk");//在头文件中设置转码
            NameValuePair[] data = {
                    new NameValuePair("corp_id", CORP_ID),
                    new NameValuePair("corp_pwd", CORP_PWD),
                    new NameValuePair("corp_service", CORP_SERVICE),
                    new NameValuePair("mobile", phone),
                    new NameValuePair("msg_content", content),
                    new NameValuePair("corp_msg_id ", msgId),
                    new NameValuePair("ext ", SMS_MSG_EXT)
            };
            post.setRequestBody(data);
            client.executeMethod(post);

            String result =post.getResponseBodyAsString();
            post.releaseConnection();

            logger.info(String.format("【SMS INFO】发送短信. corp_id=%s, corp_service=%s, mobile=%s, msg_content=%s, corp_msg_id=%s, " +
                    "ext=%s, result=%s", CORP_ID, CORP_SERVICE, phone, content, msgId, SMS_MSG_EXT, result));
            return StringUtils.contains(result, FLAG_SUCC);
        } catch (Exception e) {
            logger.error("【SMS ERROR】短信发送失败.手机号:" + phone + ",短信内容:" + content, e);
            return false;
        }

    }

    /**
     * 查询账户余额
     *
     * @return
     */
    public static String account() {
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("corp_id", CORP_ID);
//        params.put("corp_pwd", CORP_PWD);
//        String httpRequest = HttpClientUtils.post(SMS_ACCOUNT_URL, params);
//        logger.info(params.toString() + " --> " + httpRequest);
//        return httpRequest;

        try {

            HttpClient client = new HttpClient();
            PostMethod post = new PostMethod(SMS_ACCOUNT_URL);
            post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");//在头文件中设置转码
            NameValuePair[] data ={
                    new NameValuePair("corp_id", CORP_ID),
                    new NameValuePair("corp_pwd",CORP_PWD),
            };
            post.setRequestBody(data);
            client.executeMethod(post);
            String result = post.getResponseBodyAsString();
            post.releaseConnection();

            logger.info(String.format("【SMS INFO】查询余额. corp_id=%s, result=%s", CORP_ID, result));
            return result;
        } catch (Exception e) {
            logger.error("【SMS ERROR】查询余额失败", e);
            return "余额查询失败";
        }
    }

    /**
     * 生成一个msgid，这里用了随机串+时间戳
     *
     * @return
     */
    private static String genMsgID() {
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString().substring(0, 5));
        sb.append(System.currentTimeMillis() % 100000);
        return sb.toString();
    }

    public static String sendSms(String mobile, String content, String time) {
        String url = "http://gw.api.taobao.com/router/rest";
        // 成为开发者，创建应用后系统自动生成
        String appkey = "23338015";
        String secret = "062c19f6f2df559bfa72a3a5e9486acf";
        // 短信模板的内容
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
        req.setExtend("123456");
        req.setSmsType("normal");
        req.setSmsFreeSignName("大鱼测试");
        req.setSmsParamString("{\"code\":\""+content+"\",\"product\":\"买线网\"}");
        req.setRecNum(mobile);
        req.setSmsTemplateCode("SMS_7165088");

        try {
            AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
            System.out.println(rsp.getBody());
            return  "1&发送成功";
        } catch (Exception e) {
            // TODO: handle exception
            return "发送失败";
        }
    }

//    public static void main(String[] args) {
//        sendSms("18515075294","晚上好","");
//    }

}
