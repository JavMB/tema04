package com.javiermengual.tema04.metodos;

import java.util.Scanner;

public class Ejercicio5 {
    /**
     *
     * @param caracter caracter a imprimir
     * @param veces    veces a imprimirlo
     */
    public static void imprimirCaracter(char caracter, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char car;int veces;
        System.out.println("Hola dime un caracter");
        car=sc.next().charAt(0);
        System.out.println("Dime cuantas veces imprimirlo");
        veces= sc.nextInt();

        imprimirCaracter(car,veces);



    }
}
