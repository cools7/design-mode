package com.iflytek.designmode.structure.decorate;

/**
 * @author cool
 * @version V1.0
 * @className ClothesDecorator
 * @description Code Is Poetry.
 * @createDate 2018年10月09日
 */
public class ClothesDecorator extends Decorator {

    public ClothesDecorator(People people) {
        super(people);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("穿衣服");
    }
}
