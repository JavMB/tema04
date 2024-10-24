package com.javiermengual.tema04.metodos;

import com.javiermengual.tema04.lib.IO;

public class Ejercicio9 {
    /**
     *
     * @param num numero para el sumatorio
     * @return devuelve el sumatorio
     */
    public static String sumatorio(int num) {
        String sum = "sumatorio(" + num + ") = \n";
        int espacios = 0;

        for (int i = num; i > 0; i--) {

            sum = sum + i + " + ";
            espacios++;

            if (espacios % 10 == 0 && i > 1) {
                sum = sum + "\n";
            }

        }

        return sum;


    }


    public static void main(String[] args) {
        int numero = IO.solicitarInt("Dime un numero para el sumatorio", 2, 2147483647);
        System.out.printf("%s", sumatorio(numero));
    }
}

