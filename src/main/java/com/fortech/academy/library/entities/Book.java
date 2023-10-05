package com.fortech.academy.library.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "enabled")
    private boolean isEnabled;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "authors")
    private String authors;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    public Book() {
    }

    public Book(boolean isEnabled, String isbn, String authors, String title, int year) {
        this.isEnabled = isEnabled;
        this.isbn = isbn;
        this.authors = authors;
        this.title = title;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
