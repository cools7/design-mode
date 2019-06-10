package com.iflytek.designmode.structure.singleton;

/**
 * @author cool
 * @version V1.0
 * @className SingletonA
 * @description 懒汉式单例
 *
 * 优点：实现懒加载，合理利用系统资源。
 * 缺点：需要添加同步锁，高并发时调用效率不高。
 *
 * @createDate 2019年06月10日
 */
public class SingletonA {
    private static volatile SingletonA singletonA;
    private SingletonA() {
    }
    public static SingletonA getInstance() {
        if (singletonA == null) {
            synchronized (SingletonA.class) {
                if (singletonA == null) {
                    singletonA = new SingletonA();
                }
            }
        }
        return singletonA;
    }
    /**
     * 公共方法
     */
    public  void  doSomething(){
        System.out.println("懒汉式单例的方法");
    }
}
