package com.iflytek.designmode.structure.flyweight;

/**
 * @author cool
 * @version V1.0
 * @className WebSite
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public abstract class WebSite {
    // 内部状态
    protected String name;

    public abstract void show(User user);
}
