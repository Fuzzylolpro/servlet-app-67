package com.tms.service_aop;

import com.tms.aop.MyFirstTimeAnotation;
import org.springframework.stereotype.Component;

@Component
public class AopPersonService {
    @MyFirstTimeAnotation
    public String getHelloMessage(){
        return "Hello massage";
    }
}
