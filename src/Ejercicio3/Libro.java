package Ejercicio3;

public class Libro {
    //Atributos
    private String titulo, isbn,autor;

    //Contructores
    public Libro(){}

    public Libro(String titulo,String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor=autor;
    }

    //Metodos
    public void Prestamo(){
        System.out.println("Se presto el Libro " + toString());
    }

    public void Devolucion(){
        System.out.println("Se devolvio el Libro " + toString());
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
