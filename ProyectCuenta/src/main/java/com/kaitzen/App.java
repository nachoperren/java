package com.kaitzen;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("---------------- Cuenta 1 ----------------");

        Cuenta c1 = new Cuenta();
        c1.ingreso(200);
        c1.reintegro(100);
        c1.transferencia(130);
        System.out.println(c1.toString());

        System.out.println("---------------- Cuenta 2 ----------------");

        Cuenta c2 = new Cuenta(500, "Fede");
        System.out.println(c2);

        System.out.println("---------------- Cuenta 3 ----------------");

        Cuenta c3 = new Cuenta(c1);
        c3.setName("Nico");
        c3.ingreso(3000);
        c3.transferencia(0);

        c3.setName(null);
        System.out.println(c3);
    }
}
