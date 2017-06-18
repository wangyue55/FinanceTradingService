package com.fts.services;

import com.fts.domain.Trade;

import java.util.Random;

/**
 * Created by WangYue on 2017/6/18.
 */
public class TradeGenerator {
    Random idGen;

    public TradeGenerator(){
        idGen = new Random();
    }

    public void putOrder(String productName, String userName, int notional){
        Trade trade = new Trade();
        trade.setTradeId(idGen.nextInt());
        trade.setTradeVersion(1);
        trade.setProductName(productName);
        trade.setUserName(userName);
        trade.setNotional(notional);


    }
}
