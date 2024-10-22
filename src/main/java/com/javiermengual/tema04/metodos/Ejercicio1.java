package com.javiermengual.tema04.metodos;

public class Ejercicio1 {
    public static int SumaNums(int num1, int num2) {
        return num1+num2;
    }

    public static void main(String[] args) {
        int numero1 =2;
        int numero2=3;

        int suma= SumaNums(numero1,numero2);
        System.out.println(suma);
    }
}
