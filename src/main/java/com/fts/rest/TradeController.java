package com.fts.rest;

import com.fts.domain.Trade;
import com.fts.services.TradeGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.web.bind.annotation.*;

/**
 * Created by WangYue on 2017/6/18.
 */
@Api(value="订单操作接口")
@RestController
public class TradeController {
    TradeGenerator tradeGenerator = new TradeGenerator();

    @ApiOperation(value="获取随机订单")
    @RequestMapping(value = "/order/demo", method = RequestMethod.GET)
    public Trade demoOrder() {
        return tradeGenerator.generateDemoOrder();
    }

    @ApiOperation(value="创建新的订单")
    @RequestMapping(value = "/order/new",method = RequestMethod.POST)
    public Trade newOrder(@RequestBody Trade trade){
        return tradeGenerator.putOrder(trade.getProductName(), trade.getUserName(), trade.getNotional());
    }

}
