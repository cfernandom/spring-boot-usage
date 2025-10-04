package com.uptc.frw.ferialibroweb.repository;

import com.uptc.frw.ferialibroweb.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
