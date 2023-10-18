package com.tms.HiberLesson;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Collection;

@Data
@Entity(name = "author")
@ToString(exclude = "books")
@EqualsAndHashCode(exclude = "books")
public class Author {
    @Id
    @SequenceGenerator(name = "author_generator", sequenceName = "author_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "author_generator", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "author_name")
    private String authorName;

    @JoinTable(name = "l_author_book",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Book> books;
}
