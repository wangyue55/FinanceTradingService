package com.fts.domain.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by WangYue on 2017/6/20.
 */
@ApiModel("Request ID 申请参数")
public class RequestIDParam{
    @ApiModelProperty(value = "设备型号", required = true)
    public String deviceMode;
    @ApiModelProperty(value = "设备编号", required = false)
    public String deviseSeriseNo;
    @ApiModelProperty(value = "设备IP地址", required = false)
    public String ipAddress;
    @ApiModelProperty(dataType = "DefaultHeader")
    public DefaultHeader defaultHeader;


    public String getDeviceMode() {
        return deviceMode;
    }

    public void setDeviceMode(String deviceMode) {
        this.deviceMode = deviceMode;
    }

    public String getDeviseSeriseNo() {
        return deviseSeriseNo;
    }

    public void setDeviseSeriseNo(String deviseSeriseNo) {
        this.deviseSeriseNo = deviseSeriseNo;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public DefaultHeader getDefaultHeader() {
        return defaultHeader;
    }

    public void setDefaultHeader(DefaultHeader defaultHeader) {
        this.defaultHeader = defaultHeader;
    }
}
