package com.javiermengual.tema04.metodos;

import com.javiermengual.tema04.lib.IO;

public class Ejercicio10 {
    /**
     *
     * @param num numero para la tabla de multiplicar
     */
    public static void tablaMultiplicar(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + i * num);
        }

    }

    public static void main(String[] args) {
        tablaMultiplicar(IO.solicitarInt("Dime un numero entero", 1, 10));
    }
}
