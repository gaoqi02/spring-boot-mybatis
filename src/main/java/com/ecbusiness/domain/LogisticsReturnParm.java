package com.ecbusiness.domain;

import java.util.List;

/**
 * Created by gaoqi on 2016/1/21.
 */
public class LogisticsReturnParm {

    private String id;//快递代号
    private String name;//快递名称
    private String order;//快递单号
    private String message;//提示信息、如果查询失败，此处返回失败原因,查询成功则该值为空
    private String errcode;//错误代号
    private String status;//单号状态
    private List<LogisticsContent> data;//跟踪数据

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<LogisticsContent> getData() {
        return data;
    }

    public void setData(List<LogisticsContent> data) {
        this.data = data;
    }
}
