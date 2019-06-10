package com.iflytek.designmode.structure.adapter;

/**
 * @author cool
 * @version V1.0
 * @className PlugAdapter
 * @description Code Is Poetry.
 * @createDate 2018年10月09日
 */
public class PlugAdapter implements ReceptacleTarget {

    private PlugAdaptee plugAdaptee;

    public PlugAdapter(PlugAdaptee plugAdaptee) {
        this.plugAdaptee = plugAdaptee;
    }

    @Override
    public void func() {
        System.out.println("3脚插座适配" + this.plugAdaptee.intro());
    }
}
