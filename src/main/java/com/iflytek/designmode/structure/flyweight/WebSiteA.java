package com.iflytek.designmode.structure.flyweight;

/**
 * @author cool
 * @version V1.0
 * @className WebSiteA
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public class WebSiteA extends WebSite {
    public WebSiteA(String name) {
        this.name = name;
    }

    @Override
    public void show(User user) {
        System.out.println(user.getName() + "的" + this.name);
    }
}
