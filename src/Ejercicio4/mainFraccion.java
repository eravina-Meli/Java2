package Ejercicio4;

public class mainFraccion {
    public static void main(String[] args) {
        Fraccion f = new Fraccion();
        Fraccion resta = new Fraccion();
        Fraccion sum = new Fraccion();
        f.setNumerador(10);
        f.setDenominador(8);
        //resta = f.restar(10);
        sum = f.sumar(f);
        System.out.println("La suma de numeradores es: " + sum.getNumerador() + "/" + sum.getDenominador());
    }
}
