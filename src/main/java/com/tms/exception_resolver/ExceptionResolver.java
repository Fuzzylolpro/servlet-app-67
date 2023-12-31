package com.tms.exception_resolver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@Slf4j
@ControllerAdvice
public class ExceptionResolver {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity exceptionHandlerMethod(Exception e){
        log.warn(String.valueOf(e));
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}
