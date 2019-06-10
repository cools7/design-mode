package com.iflytek.designmode.structure.decorate;

/**
 * @author cool
 * @version V1.0
 * @className Man
 * @description Code Is Poetry.
 * @createDate 2018年10月09日
 */
public class Man implements People {
    @Override
    public void decorate() {
        System.out.println("男人打扮");
    }
}
