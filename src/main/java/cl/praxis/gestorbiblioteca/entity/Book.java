package cl.praxis.gestorbiblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="libros")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro", nullable = false, unique = true)
    private long id;
    @Column(name="titulo", nullable = false, length = 50)
    private String title;
    @Column(name = "autor", nullable = false, length = 50)
    private String author;
    @Column(name = "disponible", nullable = false)
    @ColumnDefault("true")
    private boolean isAvailable = true;
}
