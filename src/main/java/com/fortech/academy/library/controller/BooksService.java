package com.fortech.academy.library.controller;

import com.fortech.academy.library.entities.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {


    public List<Book> getAllBooks() {
        List<Book> result = new ArrayList<>();
        result.add(new Book(true, "978-025489", "Robert C. Martin", "Clean Code", 2008));
        result.add(new Book(true, "978-059988", "Robert C. Martin", "Clean Architecture", 2017));
        result.add(new Book(true, "978-116688", "Martin Fowler", "Refactoring: Improving the Design of Existing Code (2nd Edition)", 2018));


        return result;
    }
}
