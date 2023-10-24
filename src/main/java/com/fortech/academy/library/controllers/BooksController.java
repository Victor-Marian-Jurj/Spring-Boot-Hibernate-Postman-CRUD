package com.fortech.academy.library.controllers;

import com.fortech.academy.library.entities.Book;
import com.fortech.academy.library.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("books")
public class BooksController {

    private final BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @PostMapping
    public void createBook(@RequestBody CreateBookRequest requestBody) {
        Book newBook = new Book();
        newBook.setEnabled(true);
        newBook.setIsbn(requestBody.getIsbn());
        newBook.setAuthors(requestBody.getAuthors());
        newBook.setTitle(requestBody.getTitle());
        newBook.setYear(requestBody.getYear());
        booksService.addBook(newBook);
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> readBookById(@PathVariable Long id) {
        try {
            Book responseBody = booksService.getBookById(id);
            return ResponseEntity.ok(responseBody);
        } catch (NoSuchElementException exception) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<ReadAllBooksResponse> readAllBooks() {
        List<Book> books = booksService.getAllBooks();
        ReadAllBooksResponse responseBody = new ReadAllBooksResponse(books);
        return ResponseEntity.ok(responseBody);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Book> disableBookById(@PathVariable Long id) {
        try {
            Book responseBody = booksService.disableBookById(id);
            return ResponseEntity.ok(responseBody);
        } catch (NoSuchElementException exception) {
            return ResponseEntity.notFound().build();
        }
    }
}