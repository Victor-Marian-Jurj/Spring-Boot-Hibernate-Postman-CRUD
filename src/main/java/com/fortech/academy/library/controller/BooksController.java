package com.fortech.academy.library.controller;

import com.fortech.academy.library.entities.Book;
import com.fortech.academy.library.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BooksController {

    private final BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("test")
    public String test() {
        return "It works...";
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

    @GetMapping
    public List<Book> readAllBooks() {
        return booksService.getAllBooks();
    }


}