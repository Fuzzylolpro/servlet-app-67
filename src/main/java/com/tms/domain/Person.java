package com.tms.domain;

import com.tms.validation.Email67;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "Этот класс описывает персону")
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
    @Email67
    private String email;


}

