package com.iflytek.designmode.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author cool
 * @version V1.0
 * @className ChildHandler
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public class ChildHandler implements InvocationHandler {
    public Child child;

    public ChildHandler(Child child) {
        this.child = child;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;

        // 访问控制
        if ("goSchool".equals(method.getName())) {
            System.out.println("父母交学费");

            obj = method.invoke(child, args);
        }

        return obj;
    }
}
