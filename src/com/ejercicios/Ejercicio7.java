package com.ejercicios;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    private static int cantidadNumerosEnteros;
    private static ArrayList<Integer> numerosEnteros = new ArrayList<Integer>();
    private static int sumaNumerosEnteros;
    private static float mediaNumerosEnteros;

    public static void main(String[] args) {
        calcularMediaNumerosEnteros();
    }

    public static void obtenerNumerosEnteros () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuántos números enteros quieres?");
        cantidadNumerosEnteros = scanner.nextInt();

        for (int a = 0; a < cantidadNumerosEnteros; a ++) {
            System.out.println("Escribe un número entero:");
            numerosEnteros.add(scanner.nextInt());
        }
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

    public static void calcularMediaNumerosEnteros () {
        mostrarNumerosEnteros();

        for (int a = 0; a < cantidadNumerosEnteros; a ++) {
            sumaNumerosEnteros += numerosEnteros.get(a);
        }

        mediaNumerosEnteros = sumaNumerosEnteros/cantidadNumerosEnteros;
        System.out.println("La media de todos los números enteros es: " + mediaNumerosEnteros);
    }
}
