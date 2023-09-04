package com.s18Challange.project.service;

import com.s18Challange.project.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();
    Author findById(int id);
    Author save(Author author);
    Author delete(Author author);
}
