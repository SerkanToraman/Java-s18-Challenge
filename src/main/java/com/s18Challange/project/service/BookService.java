package com.s18Challange.project.service;

import com.s18Challange.project.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(int id);
    Book save(Book book);
    void delete(Book book);
}
