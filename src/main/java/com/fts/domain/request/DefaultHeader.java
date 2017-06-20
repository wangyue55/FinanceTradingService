package com.fts.domain.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by WangYue on 2017/6/20.
 */

@ApiModel("标准请求报文")
public class DefaultHeader {
    @ApiModelProperty(value = "发起系统", required = false)
    String originatingSourceSystem;
    @ApiModelProperty(value = "发起系统原ID", required = false)
    String originatingSourceSystemID;
    @ApiModelProperty(value = "请求接口版本", required = false)
    String apiVersion;
    @ApiModelProperty(value = "服务器名称", required = false)
    String hostName;
    @ApiModelProperty(value = "客户端名称", required = false)
    String clientName;

    public String getOriginatingSourceSystem() {
        return originatingSourceSystem;
    }

    public void setOriginatingSourceSystem(String originatingSourceSystem) {
        this.originatingSourceSystem = originatingSourceSystem;
    }

    public String getOriginatingSourceSystemID() {
        return originatingSourceSystemID;
    }

    public void setOriginatingSourceSystemID(String originatingSourceSystemID) {
        this.originatingSourceSystemID = originatingSourceSystemID;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
