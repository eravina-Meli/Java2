package Ejercicio2;

public class MainContador {
    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.setContador(-100);
        int cont = contador.Decrementar(200);
        System.out.println(cont);
    }
}
