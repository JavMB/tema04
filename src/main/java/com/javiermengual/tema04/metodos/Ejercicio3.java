package com.javiermengual.tema04.metodos;

import java.util.Scanner;
import java.util.SequencedSet;

public class Ejercicio3 {
    /**
     *
     * @param n1 primer numero a comparar
     * @param n2 segundo numero a comparar
     * @return numero mayor entre los dos
     */
    public static int mayorMenor(int n1,int n2){
        return Math.max(n1, n2);
    }
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola dime dos numeros");
        num1= sc.nextInt();
        System.out.println("Hola dime el siguiente numeros");
        num2= sc.nextInt();

        System.out.println("Aqui tienes el mayor :"+mayorMenor(num1,num2));


    }

}
