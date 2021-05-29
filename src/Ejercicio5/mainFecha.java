package Ejercicio5;

import java.util.Date;
import java.util.GregorianCalendar;

public class mainFecha {
    public static void main(String[] args) {
        GregorianCalendar calendar =  new GregorianCalendar();
        calendar.setTime(new Date());

        System.out.println(calendar.getTimeZone().toZoneId());
    }
}
