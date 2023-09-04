package com.s18Challange.project.service;

import com.s18Challange.project.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();
    Category findById(int id);
    Category save(Category category);
    void delete(Category category);
}
