package Ejercicio4;

public class Fraccion {
    private int numerador;
    private int denominador;


    public Fraccion sumar(Fraccion fraccion){
        numerador = numerador * fraccion.denominador+ denominador * fraccion.numerador;
        denominador = denominador * fraccion.denominador;

        return this;
    }
    public Fraccion sumar(int numero){
        numerador = numerador + denominador * numero;

        return this;
    }

    public Fraccion restar(Fraccion fraccion){
        numerador = numerador * fraccion.denominador - denominador * fraccion.numerador;
        denominador = denominador * fraccion.denominador;

        return this;
    }
    public Fraccion restar(int numero){
        numerador = numerador - denominador * numero;
        return this;
    }
    public Fraccion Dividir(Fraccion fraccion){
        numerador *= fraccion.denominador;
        denominador *= fraccion.numerador;;
        return this;
    }
    public Fraccion Dividir(int numero){
        numerador *= numero;
        denominador *= numero;
        return this;
    }
    public Fraccion Multiplicar(Fraccion franccion){
        numerador = numerador * franccion.numerador;
        denominador = denominador * franccion.denominador;
        return this;
    }
    public Fraccion Multiplicar(int numero){
        numero *= numerador;
        return this;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(){
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
}
