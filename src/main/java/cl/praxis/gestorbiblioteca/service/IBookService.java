package cl.praxis.gestorbiblioteca.service;

import cl.praxis.gestorbiblioteca.entity.Book;

import java.util.List;

public interface IBookService {
    Book getBook(Long id);
    List<Book> getAllBooks();
    Book saveBook(Book book);
    Book updateBook(Book book);
    void deleteBook(Book book);
    void deleteBookById(Long id);
}
