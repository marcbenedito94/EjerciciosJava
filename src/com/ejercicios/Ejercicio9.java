package com.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

    private static int base;
    private static int baseAuxiliar;
    private static int exponente;
    private static int potencia;

    public static void main(String[] args) {
        crearPotencia();
    }

    public static void obtenerBaseYExponente () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica la base");
        base = scanner.nextInt();

        System.out.println("Indica el expoente");
        exponente = scanner.nextInt();
    }

    public static void crearPotencia () {
        obtenerBaseYExponente();
        baseAuxiliar = base;

        for (int a = 0; a < exponente-1; a ++) {
            potencia = baseAuxiliar * base;
            baseAuxiliar = potencia;
        }

        System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + potencia);
    }
}
