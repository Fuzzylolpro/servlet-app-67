package com.tms.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
@Schema(description = "Этот класс описывает персону")
@Data
@Component
@Entity(name = "person") // c какой таблицей хотим подружить
public class Person {
    @Id
    @SequenceGenerator(name = "seq_person", sequenceName = "person_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "seq_person", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Size(min = 2,max = 20)
    @NotNull
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Min(value = 18) @Max( value = 120)
    @Column(name = "age")
    private Integer age;
    @Column(name = "is_married")
    private Boolean isMarried;
    @Temporal(TemporalType.TIMESTAMP) // из строки в timestamp
    @Column(name = "created")
    private Timestamp created;
}

