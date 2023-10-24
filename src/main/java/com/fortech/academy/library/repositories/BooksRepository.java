package com.fortech.academy.library.repositories;

import com.fortech.academy.library.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {
}
