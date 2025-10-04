package com.uptc.frw.ferialibroweb.controller;

import com.uptc.frw.ferialibroweb.model.Book;
import com.uptc.frw.ferialibroweb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.findAllBook();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id) {
        return bookService.findBookById(id);
    }
}
