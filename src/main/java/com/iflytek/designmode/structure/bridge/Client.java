package com.iflytek.designmode.structure.bridge;

/**
 * @author cool
 * @version V1.0
 * @className Client
 * @description Code Is Poetry.
 * @createDate 2018年10月09日
 */
public class Client {
    public static void main(String[] args) {

        /**
         * 桥接模式
         *
         */
        Computer computer = new Laptop(new LenovoBrand());

        computer.info();

    }
}
