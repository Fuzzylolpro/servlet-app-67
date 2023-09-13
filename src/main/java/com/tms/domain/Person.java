package com.tms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Getter
@Setter
@Component
@ToString
public class Person {
    private Long id;
    private String firstName;
    private String secondName;
    private Integer age;
    private Boolean isMarried;
    private Timestamp created;
    private Role role;


}

