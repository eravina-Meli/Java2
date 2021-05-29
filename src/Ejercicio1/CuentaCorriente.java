package Ejercicio1;

public class CuentaCorriente {

    //ATRIBUTOS
    private double saldo;

    //METODOS
    public double Ingreso(Double ingreso){
        return this.saldo += ingreso;
    }

    public double Egreso(Double egreso){
        return this.saldo -= egreso;
    }

    public Double reintegro(){
        return this.saldo;
    }

    public void Transferencia(CuentaCorriente cuentaDestino, Double monto){
        if(cuentaDestino != null && monto > 0) {
            cuentaDestino.Ingreso(monto);
        }else if(cuentaDestino == null){
            System.out.println("La cuenta de Destino " + cuentaDestino + " en la cual quiere depositar el monto, es null.");
        }else{
            System.out.println("Debe ingresar un monto mayor a 0.");
        }
    }

    //CONSTRUCTORES
    public CuentaCorriente(double saldo){
        this.saldo = saldo;
    }

    public CuentaCorriente(){
        this.saldo = 0;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        this.saldo = cuentaCorriente.saldo;
    }


    //GETTERS AND SETTERS
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
