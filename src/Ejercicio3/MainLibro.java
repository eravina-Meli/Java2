package Ejercicio3;

public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("HarryPotter","9780545582889","Rowling J.K");
        libro1.Prestamo();
        libro1.Devolucion();
    }
}
