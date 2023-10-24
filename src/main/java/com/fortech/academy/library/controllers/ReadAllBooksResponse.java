package com.fortech.academy.library.controllers;

import com.fortech.academy.library.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class ReadAllBooksResponse {

    private final List<Book> books = new ArrayList<>();

    public ReadAllBooksResponse () {
    }

    public ReadAllBooksResponse (List<Book> books) {
        this.books.addAll(books);
    }

    public List<Book> getBooks() {
        return books;
    }
}
