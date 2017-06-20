package com.fts.rest;

import com.fts.domain.Trade;
import com.fts.domain.request.RequestIDParam;
import com.fts.domain.response.RequestID;
import com.fts.services.RequestIDGenerator;
import com.fts.services.TradeGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by WangYue on 2017/6/18.
 */
@Api(value="Request信息获取", description = "申请订单Request ID")
@RestController
public class RequestController {
    RequestIDGenerator requestIDGenerator = new RequestIDGenerator();

    @ApiOperation(value="生成RequestID")
    @RequestMapping(value = "/trade/requestID", method = RequestMethod.POST)
    public RequestID demoOrder(@RequestBody RequestIDParam requestParam) throws UnknownHostException {
        RequestID requestID = new RequestID();
        requestID.setRequestID(requestIDGenerator.generateRequestID());

        InetAddress address = InetAddress.getLocalHost();
        requestID.setHostName(address.getHostAddress());

        requestID.setOriginatingSourceSystem(requestParam.getOriginatingSourceSystem());
        requestID.setApiVersion(requestParam.getApiVersion());
        return requestID;
    }


}
