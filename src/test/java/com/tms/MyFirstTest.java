package com.tms;


import com.tms.controller.FileController;
import com.tms.domain.Person;
import com.tms.service.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@DisplayName("This is my NAME!")
@SpringBootTest
public class MyFirstTest {
    static Person person = null;

    @Autowired
    FileController fileController;

    @BeforeAll
    static void BeforeAll() {
        person = new Person();
        System.out.println("BEFORE ALL!!!");
    }

    @BeforeEach
    void BeforeEach() {
        System.out.println("BEFORE!!!");
    }

    @Test
    public void myFirstTest() {
        System.out.println("This is my first test!!!");
    }

    @Test
    public void mySecondTest() {
        System.out.println("This is my second test!!!");
    }

    @Test
    void beanTest() {
        //то бин не налл
        Assertions.assertNotNull(fileController);
    }
}
