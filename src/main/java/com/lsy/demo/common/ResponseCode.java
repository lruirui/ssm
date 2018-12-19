package com.lsy.demo.common;

import com.sun.scenario.effect.impl.prism.PrImage;

/**
 * @author lsy
 * @create 2018-12-19 21:07
 */
public enum  ResponseCode {
    SUCCESS(0,"SUCCESS"),
    FAIL(1,"FAIL");
    private final int code;
    private final String desc;
    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }
    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }
}
