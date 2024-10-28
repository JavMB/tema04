package com.javiermengual.tema04.metodos;

import java.util.Scanner;


public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de n: ");
        int n = scanner.nextInt();

        System.out.print("Introduce el valor de m: ");
        int m = scanner.nextInt();

        if (n >= m && m >= 0) {
            long resultado = calcularCoeficienteBinomial(n, m);
            System.out.println("El coeficiente binomial de " + n + " sobre " + m + " es: " + resultado);
        } else {
            System.out.println("Error: n debe ser mayor o igual a m, y m debe ser no negativo.");
        }

        scanner.close();
    }

    public static long calcularCoeficienteBinomial(int n, int m) {
        return Ejercicio7.calcularFactorial(n) / Ejercicio7.calcularFactorial(m) * Ejercicio7.calcularFactorial(n - m);
    }


}
