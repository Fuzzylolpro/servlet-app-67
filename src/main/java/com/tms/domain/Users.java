package com.tms.domain;

import com.tms.validation.Email67;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
@Getter
@Setter
@ToString
@Component
public class Users {
    private Long id;
    @Size(min = 2,max = 20)
    @NotNull
    private String login;
    private String password;
    @Email67
    private String email;
    @Min(value = 18)
    private int age;
    private Timestamp created;
}
