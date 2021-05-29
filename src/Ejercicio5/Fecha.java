package Ejercicio5;

import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {

    //ATRIBUTOS
    private GregorianCalendar fecha;
    private Date date;

    //METODOS
    public boolean VerificarFecha(GregorianCalendar fecha){

        return true;
    }

    public void SumarDiaValorActualFecha(){

    }

    //CONSTRUCTORES
    public Fecha(GregorianCalendar calendar, Date date) {
        this.fecha = calendar;
        this.date = date;
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
        return "Fecha{" +
                "fecha=" + fecha +
                '}';
    }
}
