package com.example.spring.documentation.openapi.book;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookRepository
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    private Map<Long, Book> books = new HashMap<>();

    // ============================== [Construction / Destruction] ==============================

    // -------------------- [Public Construction / Destruction] --------------------

    // ============================== [Getter/Setter] ==============================

    // -------------------- [Private Getter/Setter] --------------------

    // -------------------- [Public Getter/Setter] --------------------

    public Collection<Book> getBooks() {
        return books.values();
    }

    // ============================== [Methods] ==============================

    // -------------------- [Private Methods] --------------------

    // -------------------- [Public Methods] --------------------

    public Optional<Book> findById(long id) {
        return Optional.ofNullable(books.get(id));
    }

    public void add(Book book) {
        books.put(book.getId(), book);
    }
}
