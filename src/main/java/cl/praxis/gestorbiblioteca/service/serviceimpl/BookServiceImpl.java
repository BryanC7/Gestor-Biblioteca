package cl.praxis.gestorbiblioteca.service.serviceimpl;

import cl.praxis.gestorbiblioteca.entity.Book;
import cl.praxis.gestorbiblioteca.repository.IBookRepository;
import cl.praxis.gestorbiblioteca.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceImpl")
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookRepository bookRepository;
    @Override
    public Book getBook(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
