package com.fortech.academy.library.services;

import com.fortech.academy.library.entities.Book;
import com.fortech.academy.library.repositories.BooksRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Slf4j
public class BooksService {

    private final BooksRepository booksRepository;

    public void addBook(Book newBook) {
        booksRepository.save(newBook);
    }

    public Book getBookById(Long id) throws NoSuchElementException {
        return booksRepository.findById(id).orElseThrow();
    }

    public List<Book> getAllBooks() {
        log.info("getAllBooks");
        return booksRepository.findAll();
    }


    @Transactional
    public Book disableBookById(Long id) {
        Book book = booksRepository.findById(id).orElseThrow();
        book.setEnabled(false);
        return book;
    }
}
