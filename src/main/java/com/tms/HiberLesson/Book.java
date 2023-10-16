package com.tms.HiberLesson;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Collection;

@Data
@ToString(exclude = "pages")
@EqualsAndHashCode(exclude = "pages")
@Entity(name = "books")
public class Book {
    @Id
    @SequenceGenerator(name = "books_generator", sequenceName = "books_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "books_generator", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "book_name")
    private String bookName;
    @OneToMany(mappedBy = "book",fetch = FetchType.EAGER) // LAZY EAGER
    private Collection<Page> pages;
}
