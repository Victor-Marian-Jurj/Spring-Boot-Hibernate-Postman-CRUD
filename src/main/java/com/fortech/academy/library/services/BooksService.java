package com.fortech.academy.library.services;

import com.fortech.academy.library.entities.Book;
import com.fortech.academy.library.repositories.BooksRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BooksService {

    private final BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public void addBook(Book newBook) {
        booksRepository.save(newBook);
    }

    public Book getBookById(Long id) throws NoSuchElementException {
        return booksRepository.findById(id).orElseThrow();
    }

    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }


    @Transactional
    public Book disableBookById(Long id) {
        Book book = booksRepository.findById(id).orElseThrow();
        book.setEnabled(false);
        return book;
    }
}
