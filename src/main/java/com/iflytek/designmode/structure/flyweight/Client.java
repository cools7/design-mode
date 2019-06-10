package com.iflytek.designmode.structure.flyweight;

/**
 * @author cool
 * @version V1.0
 * @className Client
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public class Client {

    public static void main(String[] args) {

        WebSite ws1 = WebSiteFactory.getWebSite("后台管理系统");

        WebSite ws2 = WebSiteFactory.getWebSite("后台管理系统");

        System.out.println(ws1 == ws2);


        ws1.show(new User("A 公司"));
        ws2.show(new User("B 公司"));
    }
}
