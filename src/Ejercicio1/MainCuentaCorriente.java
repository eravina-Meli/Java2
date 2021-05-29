package Ejercicio1;

public class MainCuentaCorriente {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente();


        System.out.println("-------------------------");
        cuentaCorriente.Ingreso(200.0);
        System.out.println("El Saldo actual de la cuenta es: " + cuentaCorriente.getSaldo());
        System.out.println("-------------------------");

        cuentaCorriente.Egreso(10.0);
        System.out.println("El Saldo es: " + cuentaCorriente.getSaldo() + " se restaron: " + 10.0);
        System.out.println("-------------------------");

        cuentaCorriente.reintegro();
        System.out.println("EL Saldo actual de la cuenta es: " + cuentaCorriente.getSaldo());
        System.out.println("-------------------------");

        System.out.println("---------TRANSFERENCIA--------");
        double montoTransferido = 100.0;
        CuentaCorriente cuentaDestino = new CuentaCorriente();
        cuentaCorriente.Transferencia(cuentaDestino,montoTransferido);
        cuentaCorriente.Egreso(montoTransferido);

        System.out.println(
                "Monto a transferir de: " + 100.0 + "\n"
                +"La cuenta Origen tiene: " + cuentaCorriente.getSaldo() +"\n"+
                        "La cuenta Destino tiene un total de: " + cuentaDestino.getSaldo());
        System.out.println("-------------------------");


        CuentaCorriente cuentaReal = new CuentaCorriente();
        cuentaReal.setSaldo(800.0);
        cuentaReal.Ingreso(400.0);
        System.out.println("EL saldo de la cuenta Real es de : " + cuentaReal.getSaldo());
        System.out.println("---------------------------------");

        CuentaCorriente cuentaCopia = new CuentaCorriente(cuentaReal);
        System.out.println("La cuenta COPIA tiene un saldo de " + cuentaCopia.getSaldo());
        System.out.println("---------------------------------");

    }
}
