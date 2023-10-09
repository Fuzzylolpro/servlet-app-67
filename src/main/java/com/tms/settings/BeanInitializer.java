package com.tms.settings;

import com.tms.interseptor.SpringInterceptor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.tms")
public class BeanInitializer implements WebMvcConfigurer {
    private final SpringInterceptor springInterceptor;

    public BeanInitializer(SpringInterceptor springInterceptor) {
        this.springInterceptor = springInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(springInterceptor).addPathPatterns("/person/**");
    }
    @Bean
    public EntityManagerFactory entityManagerFactory(){
        return Persistence.createEntityManagerFactory("default");
    }
    @Bean
    public EntityManager entityManager(){
        return entityManagerFactory().createEntityManager();
    }

}

