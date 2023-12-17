package ru.fedotova.jdbcproject.repository;

import ru.fedotova.jdbcproject.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    List<Book> findBookById(Long id);
}
