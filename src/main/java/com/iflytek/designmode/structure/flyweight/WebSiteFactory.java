package com.iflytek.designmode.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cool
 * @version V1.0
 * @className WebSiteFactory
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public class WebSiteFactory {

    private static Map<String,WebSite> map = new HashMap<String,WebSite>();

    public static WebSite getWebSite(String type) {
        if (!map.containsKey(type)) {
            map.put(type, new WebSiteA(type));
        }
        return map.get(type);
    }
}
