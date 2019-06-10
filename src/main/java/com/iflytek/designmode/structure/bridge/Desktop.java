package com.iflytek.designmode.structure.bridge;

/**
 * @author cool
 * @version V1.0
 * @className Desktop
 * @description Code Is Poetry.
 * @createDate 2018年10月09日
 */
public class Desktop extends Computer {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式电脑");
    }
}
