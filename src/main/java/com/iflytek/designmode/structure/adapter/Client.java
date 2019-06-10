package com.iflytek.designmode.structure.adapter;

/**
 * @author cool
 * @version V1.0
 * @className Client
 * @description Code Is Poetry.
 * @createDate 2018年10月09日
 */
public class Client {
    public static void main(String[] args) {
/**
 *  适配器模式  定义
 *
 *  适配器模式可以改变已有类的接口形式，即使得原本由于接口不兼容而不能工作的类可以一起工作。
 *
 *  # 2.2 参与角色
 *  目标接口（Target）：客户所期望的接口。
 *  适配类（Adaptee）：需要适配的类。
 *  适配器（Adapter）：通过包装一个需要适配的对象，把原接口转成目标接口。
 *
 *  # 2.3 应用场景
 *  想使用一个已经存在的类，而它的接口不符合当前的需求。
 *  想创建一个可以复用的类，该类可以与其他不相关的类或不可预见的类（即那些接口可能不一定兼容的类）协同工作。
 *
 *
 *
 *   还有一种方式实现适配器模式：让 PlugAdapter 类继承 PlugAdaptee 从而获取其方法进行调用
 *   但是，Java 中的类只支持单继承，使用继承限制代码的灵活性，不利于代码后期的扩展，因此不推荐使用该方式。
 *
 */

        ReceptacleTarget rp = new PlugAdapter(new PlugAdaptee());
        rp.func();

    }
}
