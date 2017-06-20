package com.fts.services;

import java.util.Date;

/**
 * Created by WangYue on 2017/6/20.
 */
public class RequestIDGenerator {

    public String generateRequestID(){
        String requestID = String.valueOf(System.nanoTime());

        return requestID;
    }
}
