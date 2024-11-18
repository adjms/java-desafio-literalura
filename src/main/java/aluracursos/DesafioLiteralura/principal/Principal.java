package aluracursos.DesafioLiteralura.principal;

import aluracursos.DesafioLiteralura.model.DatosLibro;
import aluracursos.DesafioLiteralura.repository.LibroRepository;
import aluracursos.DesafioLiteralura.service.ConsumoAPI;
import aluracursos.DesafioLiteralura.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "http://gutendex.com/books/?search=";
    private final String API_KEY = "";
    private ConvierteDatos conversor = new ConvierteDatos();
    private LibroRepository repositorio;

    public Principal(LibroRepository repository) {
        this.repositorio = repository;
    }

    public void menuPrincipal(){
        var opcion = -1;
        while(opcion != 0){
            var menu = """
                    1 - Buscar libro por titulo
                    2 - Listar libros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos en un determinado año
                    5 - Listar libros por idioma
                    
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    buscarLibroPorTitulo();
                    break;
                case 2:
                    listarLibrosRegistrados();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresVivosPorAnno();
                    break;
                case 5:
                    listarLibrosPorIdioma();
                    break;
                case 0:
                    System.out.println("Cerrando aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private DatosLibro getDatosLibro(){
        System.out.println("Escribe el titulo del libro que deseas buscar: ");
        var nombreLibro = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE + nombreLibro.replace(" ", "%20"));
        System.out.println(json);
        DatosLibro datos = conversor.obtenerDatos(json, DatosLibro.class);
        return datos;
    }

    private void buscarLibroPorTitulo() {
        System.out.println("Escribe el titulo del libro que deseas buscar: ");
        var nombreLibro = teclado.nextLine();
    }

    private void listarLibrosRegistrados() {
        System.out.println("Listar libros registrados");
    }

    private void listarAutoresRegistrados() {
        System.out.println("Listar autores registrados");
    }

    private void listarAutoresVivosPorAnno() {
        System.out.println("listar autores vivos por año");
    }

    private void listarLibrosPorIdioma() {
        System.out.println("listar libros por idioma");
    }


}
