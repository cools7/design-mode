package com.iflytek.designmode.structure.decorate;

/**
 * @author cool
 * @version V1.0
 * @className Client
 * @description Code Is Poetry.
 * @createDate 2018年10月09日
 */
public class Client {

    public static void main(String[] args) {

        People people = new Man();

        People decorator = new Decorator(people);

        System.out.println("======第一种打扮=======");

        ClothesDecorator cd = new ClothesDecorator(decorator);
        TrousersDecorator td = new TrousersDecorator(cd);
        td.decorate();

        System.out.println("======第二种打扮=======");

        ShoesDecorator sd = new ShoesDecorator(people);
        sd.decorate();
    }
}
