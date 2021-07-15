package com.dev.blog.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

// 역할: RestController
@ControllerAdvice   // 모든 익셉션이 발생하면 이 컨트롤로 들어온다.
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = IllegalArgumentException.class)
    public String handleArgumentException(IllegalArgumentException e) {
        return "<h1>" + e.getMessage() + "</h1>";
    }
    
}
