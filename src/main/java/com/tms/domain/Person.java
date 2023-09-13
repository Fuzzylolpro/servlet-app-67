package com.tms.domain;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Getter
@Setter
@Component
@ToString
public class Person {
    private Long id;
    @Size(min = 2,max = 20)
    @NotNull
    private String firstName;
    private String secondName;
    @Min(value = 18) @Max( value = 120)
    private Integer age;
    private Boolean isMarried;
    private Timestamp created;
    private Role role;


}

