package Ejercicio5;

import java.util.Date;
import java.util.GregorianCalendar;

public class mainFecha {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(2019,11,11);
        Date date = calendar.getTime(); //creo la fecha que me indican en el Gregorian calendar.

        Fecha fecha = new Fecha(date); //creamos una instancia de Fecha con la fecha del calendario.
        Date newDate = fecha.SumarDia(calendar,5); //Creamos una nueva fecha con los dias sumados

        fecha.setDate(newDate); //seteamos la nueva fecha

        System.out.println(fecha.toString());
    }
}
