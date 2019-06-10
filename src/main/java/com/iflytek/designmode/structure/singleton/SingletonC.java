package com.iflytek.designmode.structure.singleton;

/**
 * @author cool
 * @version V1.0
 * @className SingletonC
 * @description 将饿汉式和懒汉式的优点集中起来。
 *
 * 外部类没有静态属性，因此不会像饿汉式立即加载对象。
 * 只有当调用公共方法（getInstance）时，才会加载静态内部类。加载内部类的过程是线程安全的。
 * 内部类中通过 static final 确保内存中只有一个外部类的实例，因为实例变量（tm）只能被赋值一次。
 *
 * @createDate 2019年06月10日
 */
public class SingletonC {

    private SingletonC() {

    }
    private static class initSingleton {
        private static final SingletonC singletonC = new SingletonC();
    }

    public static SingletonC getInstance() {
        return initSingleton.singletonC;
    }
    /**
     * 公共方法
     */
    public  void  doSomething(){
        System.out.println("优化后的单例的方法");
    }
}
