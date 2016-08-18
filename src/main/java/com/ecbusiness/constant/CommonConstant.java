package com.ecbusiness.constant;

import com.ecbusiness.domain.LogisticsInputParm;
import com.ecbusiness.utils.PropertyReader;
import com.weejinfu.common.util.JsonParser;

import java.util.HashMap;
import java.util.List;

/**
 * Created by gaoqi on 2016/1/19.
 */
public class CommonConstant {

    //管理员
    public static final int manager_role = 1;
    //财务
    public static final int financial_role = 2;
    //系统管理员
    public static final int sys_role = 99;

    public static HashMap<String, String> logisticsHashMap = new HashMap<>();


    public final static int SUCCESS = 200;
    public static int SMS_EXPIRED = 60 * 10;     //短信过期
    public static int SMS_FREQ_EXPIRED = 60; //短信频率限制时间

    public static int RSA_ERROR_CODE = 500999;

    //RSA的加密目录
    public static String RSA_KEY_PRIVATE = "/crm_RSAKey_private.txt";

    public static String GLOBAL_PARAM = "brandMember";
    public static String REMEMBER_USERNAME_KEY = "remember_username"; //登陆记住我选项

    public static String SESSION_ID_KEY = "sid";
    public static String SESSION_BDID_KEY = "bdsid";
    public static String CAPTCHA_ID_KEY = "captcha_id";

    // 用户登录有效期(无操作状态)
    public static int SESSION_EXPIRED = 30 * 60;

    // 图片验证码有效期
    public static int CAPTCHA_EXPIRED = 60 * 30;
    public static int QUESTION_CHECK_EXPIRED = 60 * 5;
    public static int MOBILE_CHECK_EXPIRED = 60 * 5;


    static {


        PropertyReader reader = new PropertyReader("logistics.properties");
        String value = reader.getValueAsString("kuaidi");
        List<LogisticsInputParm> logisticses = JsonParser.readList(value, LogisticsInputParm.class);

        for (LogisticsInputParm logisticsInputParm : logisticses) {

            logisticsHashMap.put(logisticsInputParm.getExpressname(), logisticsInputParm.getExpresskey());
        }

    }

}
