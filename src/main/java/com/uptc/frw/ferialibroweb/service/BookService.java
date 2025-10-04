package com.uptc.frw.ferialibroweb.service;

import com.uptc.frw.ferialibroweb.model.Book;
import com.uptc.frw.ferialibroweb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBook() {
        return bookRepository.findAll();
    }
}
