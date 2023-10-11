package com.tms.settings;

import com.tms.interseptor.SpringInterceptor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.tms")
public class BeanInitializer implements WebMvcConfigurer {
    @Bean
    public SessionFactory sessionFactory(){
        return new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
    }
    @Bean
    public Session session(){
        return sessionFactory().openSession();
    }
}

