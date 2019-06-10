package com.iflytek.designmode.structure.facade;

/**
 * @author cool
 * @version V1.0
 * @className StockManager
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public class StockManager {
    private StockA stockA;

    private StockB stockB;

    public StockManager() {
        stockA = new StockA();
        stockB = new StockB();
    }

    public void buyStock() {
        this.stockA.buy();
        this.stockB.buy();
    }

    public void sellStock() {
        this.stockA.sell();
        this.stockB.sell();
    }
}
