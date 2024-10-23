package com.javiermengual.tema04.metodos;

import java.util.Scanner;

public class Ejercicio6 {
    /**
     *
     * @param caracter caracter a imprimir
     * @param veces    num de veces de imprimir caracter
     * @param lineas    num de lineas que se imprimira el caracter
     */
    public static void imprimirCaracterEspacios(char caracter, int veces,int lineas) {
        for (int i = 1; i <=lineas ; i++) {
            for (int j = 1; j <=veces ; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el caracter a imprimir");
        char c=sc.next().charAt(0);
        System.out.println("Dime el numero de veces que quieres imprimirlo");
        int numVeces= sc.nextInt();
        System.out.println("Dime el numero de lineas que quieres imprimirlo");
        int numLineas= sc.nextInt();

        imprimirCaracterEspacios(c,numVeces,numLineas);




    }
}
