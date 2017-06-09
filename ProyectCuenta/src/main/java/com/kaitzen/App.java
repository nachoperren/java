package com.kaitzen;

public class App 
{
    public static void main( String[] args )
    {
        Cuenta cuenta = new Cuenta();
        Cuenta cuenta2 = new Cuenta("Yo", 10000.0);
        System.out.println(cuenta2.toString());

        cuenta2.ingreso(250.5);
        cuenta2.reintegro(34.0);

        cuenta2.transferencia(20000.0);
    }
}
