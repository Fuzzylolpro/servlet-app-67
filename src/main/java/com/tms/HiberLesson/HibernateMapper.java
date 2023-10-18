package com.tms.HiberLesson;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class HibernateMapper {
    public Book getNormalBook(Book book){
        Book normalBook = new Book();
        normalBook.setId(book.getId());
        normalBook.setBookName(book.getBookName());
        normalBook.setAuthors(new ArrayList<>());
        for (Author author : book.getAuthors()){
            Author normalAuthor = new Author();
            normalAuthor.setId(author.getId());
            normalAuthor.setAuthorName(author.getAuthorName());
            normalBook.getAuthors().add(normalAuthor);
        }
        return normalBook;
        //book.getAuthors().stream().forEach(author -> author.setBooks(null));
        //return book;
        //Решение в 2 поля!
    }

    public Author getNormalAuthor(Author author){

        Author normalAuthor = new Author();
        normalAuthor.setId(author.getId());
        normalAuthor.setAuthorName(author.getAuthorName());
        normalAuthor.setBooks(new ArrayList<>());
        for (Book book : author.getBooks()){
            Book normalBook = new Book();
            normalBook.setId(book.getId());
            normalBook.setBookName(book.getBookName());
            normalAuthor.getBooks().add(normalBook);
        }
        return normalAuthor;
    }
}
