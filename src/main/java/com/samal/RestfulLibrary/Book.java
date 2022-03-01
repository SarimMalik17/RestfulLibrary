package com.samal.RestfulLibrary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String genre;
    private String author;
    private boolean available;

    public Book(Long id, String name, String genre, String author, boolean available) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.available = available;
    }

    public Book() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toString() {
        return "Book{id=" + this.id + ", name='" + this.name + "', genre='" + this.genre + "', author='" + this.author + "', available=" + this.available + "}";
    }
}
