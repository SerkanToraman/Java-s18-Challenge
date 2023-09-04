package com.s18Challange.project.service;

import com.s18Challange.project.dao.BookRepository;
import com.s18Challange.project.entity.Book;

import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()){
            return book.get();
        }
        return null;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }
}
