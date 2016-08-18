package com.ecbusiness.domain;

/**
 * Created by gaoqi on 2016/1/21.
 */
public class LogisticsInputParm {

    private String expresskey;//快递的key
    private String expressname;//快递名
    private String expresswebsite;
    private String expresstelephone;

    public String getExpresskey() {
        return expresskey;
    }

    public void setExpresskey(String expresskey) {
        this.expresskey = expresskey;
    }

    public String getExpressname() {
        return expressname;
    }

    public void setExpressname(String expressname) {
        this.expressname = expressname;
    }

    public String getExpresswebsite() {
        return expresswebsite;
    }

    public void setExpresswebsite(String expresswebsite) {
        this.expresswebsite = expresswebsite;
    }

    public String getExpresstelephone() {
        return expresstelephone;
    }

    public void setExpresstelephone(String expresstelephone) {
        this.expresstelephone = expresstelephone;
    }
}
