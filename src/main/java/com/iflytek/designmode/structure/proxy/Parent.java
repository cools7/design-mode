package com.iflytek.designmode.structure.proxy;

/**
 * @author cool
 * @version V1.0
 * @className Parent
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public class Parent implements Child {
    private Child child;

    public Parent(Child child) {
        this.child = child;
    }

    @Override
    public void payTuition() {
        System.out.println("父母交学费");
    }

    @Override
    public void goSchool() {
        this.child.goSchool();
    }
}
