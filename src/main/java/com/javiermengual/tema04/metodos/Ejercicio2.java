package com.javiermengual.tema04.metodos;

import java.util.Scanner;

public class Ejercicio2 {
    /**
     *  Calcula el area de un circulo con un radio
     * @param radio El radio del circulo
     * @return El area del circuo
     */
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Calcula la longitud del circulo con un radio
     * @param radio El radio del circulo
     * @return La longitud del circulo
     */
    public static double calcularLongitud(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola dime el radio porfavor");
        double radio = scanner.nextInt();
        double area = calcularArea(radio);
        double longitud = calcularLongitud(radio);

        System.out.printf("Tienes un area de %.2f y una longitud de %.2f\n",area,longitud);


    }
}
