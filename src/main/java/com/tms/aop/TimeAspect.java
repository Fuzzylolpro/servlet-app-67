package com.tms.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Aspect
@Component
public class TimeAspect {

    @Around(value = "@annotation(com.tms.aop.MyFirstTimeAnotation)")
    void sendInfoBeforeMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        LocalTime startTime = LocalTime.now();
        joinPoint.proceed();
        LocalTime endTime = LocalTime.now();
        int result = endTime.getNano() - startTime.getNano();
        System.out.println(result);

    }

    /*@AfterReturning(value = "(com.tms.service_aop.*)", returning = "result")
    void sendInfoBeforeMethod(JoinPoint joinPoint, Object result) {
        System.out.println(LocalDateTime.now() + "THIS IS MY AOP!!" + joinPoint.getSignature().getName());
        System.out.println("result:  " + result);*/

    /*@AfterThrowing(value = "within(com.tms.service_aop.*)", throwing = "exception")
    void sendInfoBeforeMethod(JoinPoint joinPoint, Throwable exception){
        System.out.println(LocalDateTime.now() + "THIS IS MY AOP!!" + joinPoint.getSignature().getName());
        System.out.println("My exception!" + exception);
    }*/

    /*@Before(value = "within(com.tms.service_aop.*)")
    void sendInfoBeforeMethod(JoinPoint joinPoint){
        System.out.println(LocalDateTime.now() + "THIS IS MY AOP!!" + joinPoint.getSignature().getName());
    }*/
}

