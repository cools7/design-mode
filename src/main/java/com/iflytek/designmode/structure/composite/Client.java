package com.iflytek.designmode.structure.composite;

/**
 * @author cool
 * @version V1.0
 * @className Client
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public class Client {
    public static void main(String[] args) {

        Employee p1 = new Programmer("小白");
        Employee p2 = new Programmer("小黑");

        Employee projectManager = new ProjectManager("老阎");
        projectManager.add(p1);
        projectManager.add(p2);

        projectManager.report();
    }
}
