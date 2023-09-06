package com.tms.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class TimeAspect {

    @Before(value = "within(com.tms.service_aop.*)")
    void sendInfoBeforeMethod(JoinPoint joinPoint){
        System.out.println(LocalDateTime.now() + "THIS IS MY AOP!!" + joinPoint.getSignature().getName());
    }
}
