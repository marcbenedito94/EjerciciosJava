package com.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {
    private static int cantidadNumerosEnteros;
    private static int totalNumerosPositivos;
    private static int totalNumerosNegativos;
    private static ArrayList<Integer> numerosEnteros = new ArrayList<Integer>();

    public static void main(String[] args) {
        obtenerNumerosEnteros();
        mostrarNumerosPositivos();
        mostrarNumerosNegativos();
    }

    public static void obtenerNumerosEnteros () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuántos números enteros quieres?");
        cantidadNumerosEnteros = scanner.nextInt();

        for (int a = 0; a < cantidadNumerosEnteros; a ++) {
            System.out.println("Escribe un número entero:");
            numerosEnteros.add(scanner.nextInt());
        }
        System.out.println();
    }

    public static void mostrarNumerosEnteros () {
        obtenerNumerosEnteros();

        System.out.println();
        System.out.print("Los números enteros son: ");

        for (int a = 0; a < cantidadNumerosEnteros; a ++) {
            System.out.print(numerosEnteros.get(a) + "  ");
        }

        System.out.println();
    }

    public static void mostrarNumerosPositivos () {
        System.out.print("Los números enteros positivos son: ");
        for (int a = 0; a < cantidadNumerosEnteros; a ++) {
            if (numerosEnteros.get(a) >= 0) {
                System.out.print(numerosEnteros.get(a) + " ");
                totalNumerosPositivos ++;
            }
        }
        System.out.println(" TOTAL: " + totalNumerosPositivos);
    }

    public static void mostrarNumerosNegativos () {
        System.out.print("Los números enteros negativos son: ");
        for (int a = 0; a < cantidadNumerosEnteros; a ++) {
            if (numerosEnteros.get(a) < 0) {
                System.out.print(numerosEnteros.get(a) + " ");
                totalNumerosNegativos ++;
            }
        }
        System.out.println(" TOTAL: " + totalNumerosNegativos);
    }
}
