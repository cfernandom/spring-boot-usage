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

    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Book book) {
        Book newBook = findBookById(book.getId());
        if (newBook == null) {
            throw new RuntimeException("Registros no encontrado");
        }
        newBook.setTitle(book.getTitle());
        newBook.setPrice(book.getPrice());
        saveBook(newBook);

        return newBook;
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
