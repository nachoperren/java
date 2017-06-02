package com.kaitzen;

import java.util.StringTokenizer;

public class NIF {
    private String id;

    NIF(){}

    NIF(String id){
        this.id = id;
    }

    NIF(Double dni, String nombre){
        this.id = dni+nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDni() {
        return id.substring(0,8);
    }

    public String getNombre() {
        return id.substring(8);
    }

    public String getDniSinSaber() {
        StringBuffer strBuf = new StringBuffer();
        for (int x=0;x<id.length();x++) {
            if (Character.isDigit(id.charAt(x))) {
                strBuf.append(id.charAt(x));
            }
        }
        return strBuf.toString();
    }

    public String getNombreSinSaber() {
        StringBuffer strBuf = new StringBuffer();
        for (int x=0;x<id.length();x++) {
            if (Character.isAlphabetic(id.charAt(x))) {
                strBuf.append(id.charAt(x));
            }
        }
        return strBuf.toString();
    }

    public int cuantasVeces(String caracter) {
        int count = 0;
        for (int x=0;x<id.length();x++) {
            if (id.charAt(x) == caracter.charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public boolean empiezaCon(String caracter) {
        return id.startsWith(caracter);
    }

    public boolean terminaCon(String caracter) {
        return id.endsWith(caracter);
    }
}
