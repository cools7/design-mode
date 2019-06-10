package com.iflytek.designmode.structure.facade;

/**
 * @author cool
 * @version V1.0
 * @className Client
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public class Client {
    public static void main(String[] args) {

        StockManager sm = new StockManager();

        // 买入
        sm.buyStock();

        // 卖出
        sm.sellStock();
    }
}
