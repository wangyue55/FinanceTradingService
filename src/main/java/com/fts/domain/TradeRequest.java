package com.fts.domain;

/**
 * Created by WangYue on 2017/6/18.
 */
public class TradeRequest {
    public int notional;
    public String productName;
    public String userName;

    public int getNotional() {
        return notional;
    }

    public void setNotional(int notional) {
        this.notional = notional;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
