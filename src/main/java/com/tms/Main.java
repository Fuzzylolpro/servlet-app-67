package com.tms;

import com.tms.domain.Person;

import com.tms.service_aop.AopPersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
@EnableAspectJAutoProxy
public class Main {
    public static void main(String[] args) {
        //Контейнер IoC
        ApplicationContext context = new AnnotationConfigApplicationContext("com.tms");
        AopPersonService aopPersonService = (AopPersonService) context.getBean("aopPersonService");
        aopPersonService.getHelloMessage();
    }
}
