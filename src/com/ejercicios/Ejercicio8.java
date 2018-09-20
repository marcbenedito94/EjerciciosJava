package com.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    private static int numeroEnetero;
    private static int numeroFibonacci1 = 1;
    private static int numeroFibonacci2 = 1;
    private static int indiceBucleFibonacci;

    public static void main(String[] args) {
        crearSerieFibonacci();
    }

    public static void obtenerNumeroEntero () {
        Scanner sc = new Scanner(System.in);
        //int numero,fibo1,fibo2,i;
        do {
            System.out.print("Introduce numero mayor que 1: ");
            numeroEnetero = sc.nextInt();
        } while(numeroEnetero <= 1);
    }

    public static void crearSerieFibonacci () {
        obtenerNumeroEntero();

        System.out.println("Los " + numeroEnetero + " primeros términos de la serie de Fibonacci son:");

        System.out.print(0 + " " + numeroFibonacci1 + " ");
        for(indiceBucleFibonacci = 2; indiceBucleFibonacci <= numeroEnetero; indiceBucleFibonacci ++){
            System.out.print(numeroFibonacci2 + " ");
            numeroFibonacci2 = numeroFibonacci1 + numeroFibonacci2;
            numeroFibonacci1 = numeroFibonacci2 - numeroFibonacci1;
        }
        System.out.println();
    }
}
