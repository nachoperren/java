package com.kaitzen;

import java.text.*;
import java.util.Calendar;
import java.util.Date;

public class Fecha {
    private Date fecha;
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Fecha(){
        fecha = new Date();
    }

    Fecha(String fecha){
        try {
            this.fecha = df.parse(fecha);
        } catch (ParseException pe) {
            System.out.println("ERROR - Formato de fecha inválido");
        }
    }

    public boolean esCorrecta(String fecha) {
        try {
            this.fecha = df.parse(fecha);
        } catch (ParseException pe) {
            System.out.println("ERROR - Formato de fecha inválido");
            return false;
        }
        System.out.println("Formato de fecha válido");
        return true;
    }

    public void pasarAlDiaSiguiente() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        fecha = cal.getTime();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String toString() {
        return String.format("La fecha actual es $s", df.format(fecha));
    }
}
