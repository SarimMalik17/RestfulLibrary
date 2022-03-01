package com.samal.RestfulLibrary;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/library"})
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBook() {
        return this.bookService.getBooks();
    }

    @GetMapping(
            path = {"/author/{author}"}
    )
    public List<Book> getBooksByAuthor(@PathVariable("author") String author) {
        return this.bookService.getBooksByAuthor(author);
    }

    @GetMapping(
            path = {"/genre/{genre}"}
    )
    public List<Book> getBooksByGenre(@PathVariable("genre") String genre) {
        return this.bookService.getBooksByGenre(genre);
    }

    @PostMapping(
            path = {"/add"}
    )
    public void addNewBook(@RequestBody Book book) {
        this.bookService.addNewBook(book);
    }
}
