package com.iflytek.designmode.structure.decorate;

/**
 * @author cool
 * @version V1.0
 * @className TrousersDecorator
 * @description Code Is Poetry.
 * @createDate 2018年10月09日
 */
public class TrousersDecorator extends Decorator {
    public TrousersDecorator(People people) {
        super(people);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("穿裤子");
    }
}
