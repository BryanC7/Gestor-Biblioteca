package cl.praxis.gestorbiblioteca.repository;

import cl.praxis.gestorbiblioteca.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
