package com.fortech.academy.library.controller;

import com.fortech.academy.library.entities.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("books")
public class BooksController {

    @GetMapping("test")
    public String test() {
        return "It works...";
    }

    @GetMapping
    public List<Book> getAllBooks() {
        List<Book> responseBody = new ArrayList<>();
        responseBody.add(new Book(true, "978-025489", "Robert C. Martin", "Clean Code", 2008));
        responseBody.add(new Book(true, "978-059988", "Robert C. Martin", "Clean Architecture", 2017));
        responseBody.add(new Book(true, "978-116688", "Martin Fowler", "Refactoring: Improving the Design of Existing Code (2nd Edition)", 2018));
        return responseBody;
    }

}