package com.s18Challange.project.service;

import com.s18Challange.project.dao.AuthorRepository;
import com.s18Challange.project.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author findById(int id) {
        Optional<Author> author = authorRepository.findById(id);
        if(author.isPresent()){
            return author.get();
        }
        return null;
    }

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author delete(Author author) {
        Optional<Author> deletedAuthorOptional =authorRepository.findById(author.getId());
        if (deletedAuthorOptional.isPresent()) {
            Author deletedAuthor = deletedAuthorOptional.get();
            authorRepository.delete(author);
            return deletedAuthor;
        }
            return null;
    }
}
