package com.s18Challange.project.dao;

import com.s18Challange.project.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
