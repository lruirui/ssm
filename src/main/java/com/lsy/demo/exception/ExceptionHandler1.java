package com.lsy.demo.exception;

import com.lsy.demo.common.Response;
import com.lsy.demo.common.ResultUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lsy
 * @create 2018-12-19 21:41
 */
@ControllerAdvice
public class ExceptionHandler1 {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response hand() {
        return ResultUtils.fail("系统错误");
    }
}
