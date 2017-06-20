package com.fts.domain.response;

import com.fts.domain.request.DefaultHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by WangYue on 2017/6/20.
 */
@ApiModel("交易请求ID")
public class RequestID extends DefaultHeader {
    @ApiModelProperty(value = "请求ID", required = true)
    String requestID;
    @ApiModelProperty(value = "时间戳", required = true)
    String timestamp;

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
