package com.iflytek.designmode.structure.singleton;

/**
 * @author cool
 * @version V1.0
 * @className Client
 * @description Code Is Poetry.
 * @createDate 2019年06月10日
 */
public class Client {

    /**
     * 单例模式
     * <p>
     * 推荐使用 SingletonC  和 SingletonD  写法
     *
     * @param args
     */
    public static void main(String[] args) {
        SingletonA.getInstance().doSomething();
        SingletonB.getInstance().doSomething();
        SingletonC.getInstance().doSomething();
        SingletonD.doSomting();
    }
}
