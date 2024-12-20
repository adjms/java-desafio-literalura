package aluracursos.DesafioLiteralura.model;

public enum Categoria {

    AVENTURA("Adventura stories"),
    PSICOLOGIA("Psychological fiction"),
    FICCION("fiction"),
    ROMANCE("Love stories"),
    CIENCIA("Science"),
    MISTERIO("Mystery"),
    FANTASIA("Fantasy"),
    POESIA("Poetry"),
    DRAMA("Drama"),
    BIOGRAFIA("Biography");

    private String categoriaGutendex;
    Categoria (String categoriaGutendex){
        this.categoriaGutendex = categoriaGutendex;
    }

    public static Categoria fromString(String text){
        for(Categoria categoria : Categoria.values()){
            if(categoria.categoriaGutendex.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("No hay categoria encontrada: " + text);
    }
}
