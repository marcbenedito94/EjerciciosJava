package com.ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {

    private static Integer[] numerosEnteros = new Integer[10];
    private static final int cantidadNumerosEnteros = 10;

    public static void main(String[] args) {
        obtenerNumerosEnteros();
        mostrarNumerosEnteros();
        mostrarNumerosEnterosInverso();
    }

    public static void obtenerNumerosEnteros () {
        Scanner scanner = new Scanner(System.in);

        for (int a = 0; a < numerosEnteros.length; a ++) {
            System.out.println("Escribe un número entero");
            numerosEnteros[a] = scanner.nextInt();
        }
    }

    public static void mostrarNumerosEnteros () {
        for (int a = 0; a < numerosEnteros.length; a ++) {
            System.out.print(numerosEnteros[a] + " - ");
        }

        System.out.println();
    }

    public static void mostrarNumerosEnterosInverso () {
        Arrays.sort(numerosEnteros, Collections.reverseOrder());
        for (int a = 0; a < numerosEnteros.length; a ++) {
            System.out.print(numerosEnteros[a] + " - ");
        }
    }
}
