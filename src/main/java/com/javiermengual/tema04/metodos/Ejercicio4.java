package com.javiermengual.tema04.metodos;

import java.util.Scanner;

public class Ejercicio4 {
    /**
     *
     * @param n1 Primer numero a comparar
     * @param n2    Segundo numero a comparar
     * @param n3    Tercer numero a comparar
     * @param n4    Cuarto numero a comparar
     * @return      Numero mayor de los 4
     */
    public static int mayorDe4(int n1, int n2, int n3, int n4) {
        return Math.max(Math.max(n1, n2), Math.max(n3, n4));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1,n2,n3,n4;
        System.out.println("Dime el num1");
        n1= sc.nextInt();
        System.out.println("Dime el num2");
        n2= sc.nextInt();
        System.out.println("Dime el num3");
        n3= sc.nextInt();
        System.out.println("Dime el num4");
        n4= sc.nextInt();

        System.out.println("El mayor de los 4 es: "+mayorDe4(n1,n2,n3,n4));
    }
}
