package aluracursos.DesafioLiteralura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<Autor>autor,
        @JsonAlias("languages") List<String> idioma,
        @JsonAlias("subjects") List<Categoria> categorias,
        @JsonAlias("download_count") int descargas) {
}
