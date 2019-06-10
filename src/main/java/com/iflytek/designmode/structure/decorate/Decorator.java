package com.iflytek.designmode.structure.decorate;

/**
 * @author cool
 * @version V1.0
 * @className Decorator
 * @description Code Is Poetry.
 * @createDate 2018年10月09日
 */
public class Decorator implements People {

    private People people;

    public Decorator(People people) {
        this.people = people;
    }

    @Override
    public void decorate() {
        this.people.decorate();
    }
}
