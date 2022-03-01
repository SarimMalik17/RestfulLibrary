package com.samal.RestfulLibrary;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepo repository;

    @Autowired
    public BookService(BookRepo repository) {
        this.repository = repository;
    }

    public List<Book> getBooks() {
        return this.repository.findAll();
    }

    public List<Book> getBooksByAuthor(String author) {
        return this.repository.findBooksByAuthor(author);
    }

    public List<Book> getBooksByGenre(String genre) {
        return this.repository.findBooksByGenre(genre);
    }

    public void addNewBook(Book book) {
        this.repository.save(book);
    }

    public void deleteBook(Long bookId) {
        boolean exists = this.repository.existsById(bookId);
        if (!exists) {
            throw new IllegalStateException("Book with id " + bookId + " does not exist");
        } else {
            this.repository.deleteById(bookId);
        }
    }
}
