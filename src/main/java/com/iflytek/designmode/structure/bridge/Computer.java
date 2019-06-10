package com.iflytek.designmode.structure.bridge;

/**
 * @author cool
 * @version V1.0
 * @className Computer
 * @description Code Is Poetry.
 * @createDate 2018年10月09日
 */
public abstract class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        this.brand.info();
    }
}
