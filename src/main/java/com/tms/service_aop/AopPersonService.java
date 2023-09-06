package com.tms.service_aop;

import org.springframework.stereotype.Component;

@Component
public class AopPersonService {
    public String getHelloMessage(){
        return "Hello massage";
    }
}
