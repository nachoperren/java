package com.kaitzen;

import com.google.common.collect.Iterables;

import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<String> names = Arrays.asList("Martin", "Diego", "Fede", "Martin", "Andrey");
        for (String name: names) {
            System.out.println(String.format("%1$s appears: %2$s times",name,Iterables.frequency(names, name)));
        }
    }
}
