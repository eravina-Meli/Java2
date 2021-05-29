package Ejercicio2;

public class Contador {

    //Variables
    private int contador;

    //Metodos
    public int Incrementar(int contador){
        return this.contador += contador;
    }
    public int Decrementar(int contador){
        return this.contador -= contador;
    }


    //Constructores
    public Contador(int contador){
        this.contador = contador;
    }

    public Contador(Contador contador){
        this.contador = contador.contador;
    }
    public Contador(){}

    //Getters and Setters
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        if(contador >=0) {
            this.contador = contador;
        }
        else{
            throw new NumberFormatException("No se pueden adicionar numeros negativos");
        }
    }
}
