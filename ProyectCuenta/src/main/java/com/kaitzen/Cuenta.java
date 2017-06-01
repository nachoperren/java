package com.kaitzen;

import java.util.Random;

public class Cuenta {
    private float amount;
    private String name;
    private Integer id;
    private static Random RD = new Random();
    private static Integer LOWER_ID = 1;
    private static Integer HIGHER_ID = 1000;

    Cuenta() {
        id = getRandomId();
        name = "This is a new Account";
        amount = 0;
    }

    Cuenta(float montoInicial, String name) {
        this.id = getRandomId();
        this.amount = montoInicial;
        this.name = name;
    }

    Cuenta(Cuenta cuentaBase) {
        this.id = getRandomId();
        this.name = cuentaBase.getName();
        this.amount = cuentaBase.getAmount();
    }
    
    public void ingreso(float monto) {
        this.amount += monto;
        logMe();
    }

    public void reintegro(float monto) {
        this.amount += monto;
        logMe();
    }

    public void transferencia(float monto) {
        this.amount -= monto;
        logMe();
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            logError("Name can not be null");
        } else {
            this.name = name;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String toString() {
        return "Esta cuenta con ID: " + id + " es propiedad de " + name + " y tiene actualmente $" + amount;
    }

    private void logMe() {
        System.out.println(this);
    }

    private Integer getRandomId() {
        return RD.nextInt(HIGHER_ID - LOWER_ID) + LOWER_ID;
    }

    private void logError(String errorMsg) {
        StringBuffer strBuf = new StringBuffer();
        strBuf.append("******** Hubo un error: ");
        strBuf.append(errorMsg);
        strBuf.append(" ********");
        System.out.println(strBuf);
    }
}
