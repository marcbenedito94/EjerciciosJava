package com.ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

    private static int[][] matrizHojaCalculo = new int[5][6];
    private static int numero;
    private static int sumaFila1 = 0;
    private static int sumaFila2 = 0;
    private static int sumaFila3 = 0;
    private static int sumaFila4 = 0;
    private static int sumaColumna1 = 0;
    private static int sumaColumna2 = 0;
    private static int sumaColumna3 = 0;
    private static int sumaColumna4 = 0;
    private static int sumaColumna5 = 0;
    private static int sumaTotalFilas = 0;
    private static int sumaTotalColumna = 0;

    public static void main(String[] args) {
        imprimirMatriz();
    }

    public static void obtenerGuardarNumeros () {
        Scanner scanner = new Scanner(System.in);

        for (int a = 0; a < 4; a ++) {
            for (int b = 0; b < 5; b ++) {
                System.out.println("Dame un número");
                numero = scanner.nextInt();
                matrizHojaCalculo[a][b] = numero;
            }
        }
    }

    public static void imprimirMatriz () {
        obtenerGuardarNumeros();

        for (int a = 0; a < 4; a ++) {
            for (int b = 0; b < 5; b ++) {
                System.out.print(matrizHojaCalculo[a][b] + " - ");

                if (a == 0) {
                    sumaFila1 += matrizHojaCalculo[a][b];
                }
                else if (a == 1) {
                    sumaFila2 += matrizHojaCalculo[a][b];
                }
                else if (a == 2) {
                    sumaFila3 += matrizHojaCalculo[a][b];
                }
                else if (a == 3) {
                    sumaFila4 += matrizHojaCalculo[a][b];
                }

                // Columnas
                if (b == 0) {
                    sumaColumna1 += matrizHojaCalculo[a][b];
                }
                else if (b == 1) {
                    sumaColumna2 += matrizHojaCalculo[a][b];
                }
                else if (b == 2) {
                    sumaColumna3 += matrizHojaCalculo[a][b];
                }
                else if (b == 3) {
                    sumaColumna4 += matrizHojaCalculo[a][b];
                }
                else if (b == 4) {
                    sumaColumna5 += matrizHojaCalculo[a][b];
                }
            }

            System.out.println();
            System.out.println();
        }
        //System.out.println(sumaFila1 + " - " + sumaFila2 + " - " + sumaFila3 + " - " + sumaFila4);
        System.out.println(sumaColumna1 + " - " + sumaColumna2 + " - " + sumaColumna3 + " - " + sumaColumna4 + " - " + sumaColumna5);
    }
}
