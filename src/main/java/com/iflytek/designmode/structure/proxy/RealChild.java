package com.iflytek.designmode.structure.proxy;

/**
 * @author cool
 * @version V1.0
 * @className RealChild
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public class RealChild implements Child{
    @Override
    public void payTuition() {
        System.out.println("小孩交学费");
    }

    @Override
    public void goSchool() {
        System.out.println("小孩上学");
    }
}
