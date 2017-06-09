package com.kaitzen;

//import com.google.common.collect.Iterables;

import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Hola Mundo !!!");

        /* INGRESO POR TECLADO
        // esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        // mensaje para el usuario
        System.out.print("Ingrese su nombre: ");
        // leemos un valor entero por teclado
        String nom = scanner.nextLine();
        // mostramos un mensaje y luego el valor leido
	    System.out.println("Hola Mundo: " + nom);
         */

        /* DECISION
        Scanner scanner = new Scanner(System.in);
        // Mensaje para el usuario
        System.out.print("Ingrese nombre edad altura: ");
        // leemos el nombre
        String nom = scanner.next();
        // leemos la edad
        int edad= scanner.nextInt();
        // leemos la altura
        double altura = scanner.nextDouble();
        // mostramos los datos por consola
        System.out.println("Nombre: "+nom
                        +" Edad: "+edad
                        +" Altura : "+altura);
        if( edad >= 21 ) {
            System.out.println("Ud. es mayor de edad !");
        } else {
            System.out.println("Ud. es es menor de edad");
        }
        */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana (numero): ");
        int v = scanner.nextInt();
        String dia;
        switch( v ) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Dia incorrecto... El valor debe ser entre 1 y 7.";
        }
        System.out.println(dia);
        */

        /* ITERACCION
        Scanner scanner = new Scanner(System.in);
        // leo el valor de n
        int n = scanner.nextInt();
        int i = 1;
        System.out.println("While()");
        while( i <= n ) {
            // muestro el valor de i
            System.out.println(i);
            // incremento el valor de i
            i++;
        }
        i = 1;
        System.out.println("Do ... While());
        do{
            System.out.println(i);
            i++;
        } while( i <= n );

        i = 1;
        System.out.println("For()");
        for( int i=1; i<=n; i++ )
        {
            System.out.println(i);
        }
        */

        /* DEPENDENCIAS
        List<String> names = Arrays.asList("Martin", "Diego", "Fede", "Martin", "Andrey");
        for (String name: names) {
            System.out.println(String.format("%1$s appears: %2$s times",name,Iterables.frequency(names, name)));
        }
        */
    }
}
