package com.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    private static int altura_piramide;
    private static String simbolo;
    private static String cadena_vacia = " ";

    public static void main(String[] args) {
        dibujarPiramide();
    }

    public static void obtenerSimboloYAltura () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el símbolo:");
        simbolo = scanner.nextLine();

        System.out.println("Escribe la altura:");
        altura_piramide = scanner.nextInt();
    }

    public static void dibujarPiramide () {
        obtenerSimboloYAltura();
        for (int altura = 1; altura <= altura_piramide; altura ++) {
            for (int blancos = 1; blancos <= altura_piramide - altura; blancos ++) {
                System.out.print(cadena_vacia);
            }

            for (int caracter = 1; caracter <= (altura * 2) - 1; caracter ++) {
                System.out.print(simbolo);
            }

            System.out.println();
        }
    }
}
