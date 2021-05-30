package Ejercicio5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {

    //ATRIBUTOS
    private GregorianCalendar fecha;
    private Date date;

    //METODOS
    public Date VerificarFecha(GregorianCalendar calendar){
        return new Date();
    }

    public Date SumarDia(GregorianCalendar calendar ,int day){
        int actual = calendar.get(Calendar.DATE);//obtengo dia de la fecha
        Date date = new Date(); //creamos una fecha nueva a retornar
        date.setDate(actual+day); //le seteamos el dia actual + la cantidad de dias a sumar
        return date; // retornamos la fecha nueva con los dias sumados.
    }

    //CONSTRUCTORES
    public Fecha(GregorianCalendar calendar,Date date) {
        this.fecha = calendar;
        this.date =date;
    }

    public Fecha(Date date){
        this.date = date;
    }

    public Fecha(){
        date = new Date();
    }

    //GETTERS Y SETTERS
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Fecha --> "  + this.getDate() ;
    }
}
