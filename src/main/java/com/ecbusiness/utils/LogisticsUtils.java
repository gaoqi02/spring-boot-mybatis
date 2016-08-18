package com.ecbusiness.utils;

import com.ecbusiness.constant.CommonConstant;
import com.ecbusiness.domain.LogisticsReturnParm;
import com.weejinfu.common.rpc.RemoteCommonService;
import com.weejinfu.common.util.JsonParser;

/**
 * Created by gaoqi on 2016/1/21.
 */
public class LogisticsUtils {

    /**
     * 查询物流信息
     * @param uid 查询者的uuid
     * @param key 查询者的key
     * @param orderId 订单的id
     * @param expressName 快递的名字
     * @return
     */
    public static LogisticsReturnParm getReturnInfo(String uid, String key, String orderId, String expressName) {
        String expressId = CommonConstant.logisticsHashMap.get(expressName);

        RemoteCommonService remoteCommonService = new RemoteCommonService("http://www.kuaidiapi.cn/rest/?");
        String result = remoteCommonService.get("uid="+uid+"&key="+key+"&order="+orderId+"&id="+expressId);
        LogisticsReturnParm logisticsReturnParm = JsonParser.read(result, LogisticsReturnParm.class);

        return logisticsReturnParm;
    }

//    public static void main(String[] args) {
//        getReturnInfo("55900","d3bf0c45b6fc4882a2a80c86be2c4b51","374852720778","中通快递");
//    }
}
