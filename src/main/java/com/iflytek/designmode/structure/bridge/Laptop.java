package com.iflytek.designmode.structure.bridge;

/**
 * @author cool
 * @version V1.0
 * @className Laptop
 * @description Code Is Poetry.
 * @createDate 2018年10月09日
 */
public class Laptop extends Computer{
    public Laptop(Brand brand) {
        super(brand);
    }
    @Override
    public void info() {
        super.info();
        System.out.println("笔记本电脑");
    }
}
