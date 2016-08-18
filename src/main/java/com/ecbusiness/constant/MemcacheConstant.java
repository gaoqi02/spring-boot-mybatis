package com.ecbusiness.constant;

/**
 * Created by zhengxu on 14-10-19.
 */
public class MemcacheConstant {
    public static String getSessionMemKeyBySessionId(String sessionid){
        return "sess:"+sessionid ;
    }

    public static String getCaptchaMemKeyBySessionId(String sessionid){
        return "capt:"+sessionid ;
    }

    public static String getSmsKey(String smsId){
        return "sms:"+smsId ;
    }
    public static String getSmsFreqKey(String smsId){
        return "sms:freq:"+smsId ;
    }

    public static String getQuestionCheckKey(String uuid){
        return "ques:"+uuid ;
    }

    public static String getMobileCheckKey(String uuid){
        return "mobi:"+uuid ;
    }

    public static String getCustomerCheckKey(String uuid){
        return "cus:"+uuid ;
    }
}
