package com.iflytek.designmode.structure.composite;

import java.util.Random;

/**
 * @author cool
 * @version V1.0
 * @className Programmer
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public class Programmer extends Employee{
    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }

    @Override
    public void report() {
        Random r = new Random();
        String temp = String.format("%.2f", r.nextFloat() * 100);
        System.out.println(this.name + "任务进度为" + temp + "%");
    }

}
