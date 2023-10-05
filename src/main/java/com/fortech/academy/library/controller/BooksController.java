package com.fortech.academy.library.controller;

import com.fortech.academy.library.entities.Book;
import com.fortech.academy.library.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping
    public List<Book> getAllBooks() {
        return booksService.getAllBooks();
    }

}