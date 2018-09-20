package com.ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

    private static int numero;
    private static int cifra;
    private static int inverso;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame un número");
        numero = scanner.nextInt();

        System.out.println("El número invertido de " + numero + " es: " + invertirNumero(numero));
    }

    public static int invertirNumero (int numeroEntero) {
        inverso = 0;
        while(numeroEntero != 0){
            cifra = numeroEntero % 10;
            inverso = (inverso * 10) + cifra;
            numeroEntero /= 10;
        }
        return inverso;
    }
}
