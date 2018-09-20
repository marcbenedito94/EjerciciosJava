package com.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    private static int anoBisiesto;

    public static void main(String[] args) {
        esBisiesto();
    }

    public static void obtenerAno () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un año:");
        anoBisiesto = scanner.nextInt();
    }

    public static void esBisiesto () {
        obtenerAno();

        if ((anoBisiesto % 4 == 0) && (anoBisiesto % 100 != 0)) {
            System.out.println(anoBisiesto + " es bisiesto");
        } else {
            System.out.println(anoBisiesto + " no es bisiesto");
        }
    }
}
