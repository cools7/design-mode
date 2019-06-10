package com.iflytek.designmode.structure.singleton;

/**
 * @author cool
 * @version V1.0
 * @className SingletonB
 * @description  饿汉式单例
 *
 * 优点：线程安全，不用加同步锁，因此在高并发时调用效率高。
 * 缺点：不能懒加载，如果不使用该类的实例，浪费内存资源。
 *
 * @createDate 2019年06月10日
 */
public class SingletonB {
    private static SingletonB instance = new SingletonB();

    private SingletonB() {
    }

    public static SingletonB getInstance() {
        return instance;
    }
    /**
     * 公共方法
     */
    public  void  doSomething(){
        System.out.println("饿汉式单例的方法");
    }
}
