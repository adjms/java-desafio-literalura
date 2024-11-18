package aluracursos.DesafioLiteralura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int anoNacimiento;
    private int anoFallecimiento;
    @ManyToOne
    private Libro libro;

    public Autor(){}

    public Autor(String nombre, int anoNacimiento, int anoFallecimiento) {
        this.nombre = nombre;
        this.anoNacimiento = anoNacimiento;
        this.anoFallecimiento = anoFallecimiento;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public int getAnoFallecimiento() {
        return anoFallecimiento;
    }

    public void setAnoFallecimiento(int anoFallecimiento) {
        this.anoFallecimiento = anoFallecimiento;
    }
}
