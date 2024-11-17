package aluracursos.DesafioLiteralura.repository;

import aluracursos.DesafioLiteralura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
