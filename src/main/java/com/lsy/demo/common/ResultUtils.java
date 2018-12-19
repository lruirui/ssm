package com.lsy.demo.common;

/**
 * @author lsy
 * @create 2018-12-19 21:27
 */
public class ResultUtils {
    public static Response success(Object data) {
        Response response = new Response();
        response.setData(data);
        response.setStatus(ResponseCode.SUCCESS.getCode());
        return response;
    }
    public static Response success(Object data,String msg) {
        Response response = new Response();
        response.setData(data);
        response.setStatus(ResponseCode.SUCCESS.getCode());
        response.setMsg(msg);
        return response;
    }
    public static Response fail(String msg) {
        Response response = new Response();
        response.setStatus(ResponseCode.FAIL.getCode());
        response.setMsg(msg);
        return response;
    }
}
