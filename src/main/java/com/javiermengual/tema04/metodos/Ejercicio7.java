package com.javiermengual.tema04.metodos;

import com.javiermengual.tema04.lib.IO;

public class Ejercicio7 {

    /**
     * @param num Numero a cacular factorial
     * @return Factorial calculado
     */
    public static long calcularFactorial(long num) {
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;


    }

    public static void main(String[] args) {

        System.out.println(" el factorial es : " + calcularFactorial(IO.solicitarInt("Dime un numero para el factorial", 1, 9999)));

    }
}
