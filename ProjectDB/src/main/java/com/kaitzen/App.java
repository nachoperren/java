package com.kaitzen;

import java.sql.SQLException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( " --------------------------------------------------------" );
        System.out.println( "|                   Proyecto DB                          |" );
        System.out.println( " --------------------------------------------------------" );

        DBClient client = new DBClient();
        int userId = 0;

        try {
            client.insert("Fede Pellegrinet");
            userId = client.insert("Juan Pablo Fiori");
            client.insert("Francisco Sanmartino");
        } catch(SQLException e) {
            System.out.println("Error insertando valores: " + e.getMessage());
        }

        try {
            Person fede = client.select("Fede Pellegrinet");
            System.out.println(fede);
            Person juan = client.select(userId);
            System.out.println(juan);
            List<Person> crowd = client.select();
            System.out.println(crowd);
        } catch (SQLException e) {
            System.out.println("Error buscando valores: " + e.getMessage());
        }
    }
}
