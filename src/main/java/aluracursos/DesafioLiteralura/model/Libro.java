package aluracursos.DesafioLiteralura.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Entity
@Table(name="libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL)
    private List<Autor> autor;
    @ElementCollection
    @CollectionTable(name = "libro_idiomas", joinColumns = @JoinColumn(name = "libro_id"))
    private List<String> idioma;
    @ElementCollection(targetClass = Categoria.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "libro_categorias", joinColumns = @JoinColumn(name = "libro_id"))
    private List<Categoria> categorias;
    private int descargas;

    public Libro(){}

    public Libro(Long id, String titulo, List<Autor> autor, List<String> idioma, List<Categoria> categorias, int descargas) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.categorias = categorias;
        this.descargas = descargas;
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", titulo= '" + titulo + '\'' +
                ", autor= " + autor + '\'' +
                ", idioma= " + idioma + '\'' +
                ", categorias= " + categorias + '\'' +
                ", descargas= " + descargas + '\'';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }

    public List<String> getIdioma() {
        return idioma;
    }

    public void setIdioma(List<String> idioma) {
        this.idioma = idioma;
    }


    public int getDescargas() {
        return descargas;
    }

    public void setDescargas(int descargas) {
        this.descargas = descargas;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
}
