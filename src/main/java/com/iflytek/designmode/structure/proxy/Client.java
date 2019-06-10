package com.iflytek.designmode.structure.proxy;

import java.lang.reflect.Proxy;

/**
 * @author cool
 * @version V1.0
 * @className Client
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public class Client {

    public static void main(String[] args) {
//  静态代理
//        Child child = new RealChild();
//
//        // 手动创建代理对象
//        Child proxy = new Parent(child);
//
//        proxy.payTuition();
//
//        proxy.goSchool();

// 动态代理

        Child child = new RealChild();

        ChildHandler handler = new ChildHandler(child);

        // 代理对象
        Child proxy = (Child) Proxy.newProxyInstance(
                child.getClass().getClassLoader(),
                child.getClass().getInterfaces(),
                handler);

        proxy.payTuition();

        proxy.goSchool();


    }
}
