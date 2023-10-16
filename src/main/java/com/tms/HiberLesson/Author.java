package com.tms.HiberLesson;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity(name = "author")
public class Author {
    @Id
    @SequenceGenerator(name = "author_generator", sequenceName = "author_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "author_generator", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "author_name")
    private String authorName;
}
