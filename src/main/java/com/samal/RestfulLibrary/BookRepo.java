package com.samal.RestfulLibrary;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
    List<Book> findBooksByAuthor(String author);

    List<Book> findBooksByGenre(String genre);
}
