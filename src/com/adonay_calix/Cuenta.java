package com.adonay_calix;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Cuenta {

    protected String numeroCuenta;

    protected float saldo;

    protected int tipoCuenta;

    public String generarNumeroCuenta() {

        int diaActual, mesActual, anioActual;

        Calendar calendario = new GregorianCalendar();

        diaActual = calendario.get(Calendar.DATE);

        mesActual = calendario.get(Calendar.MONTH);

        anioActual = calendario.get(Calendar.YEAR);

        Random numeroALeatorio = new Random();

        int rango;

        rango = (int)(numeroALeatorio.nextDouble()*10000 + 1);

        String codigoCuenta = "";

        codigoCuenta += anioActual + "" + (mesActual + 1) + "" + diaActual  + rango;

        return codigoCuenta;

    }



}
