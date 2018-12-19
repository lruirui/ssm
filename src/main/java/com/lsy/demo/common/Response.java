package com.lsy.demo.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * @author lsy
 * @create 2018-12-19 21:12
 */
@Data
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Response<T> {
    private int status;
    private String msg;
    private T data;
}
