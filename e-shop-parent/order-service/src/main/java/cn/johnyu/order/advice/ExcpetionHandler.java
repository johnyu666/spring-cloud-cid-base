package cn.johnyu.order.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.net.SocketTimeoutException;

@RestControllerAdvice
public class ExcpetionHandler {
    @ExceptionHandler(value = SocketTimeoutException.class)
    public String handleSocketTimeout(){
        return "超时异常";
    }
}
