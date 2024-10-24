package com.javiermengual.tema04.metodos;

import com.javiermengual.tema04.lib.IO;

public class Ejercicio13 {
    public static String saludar(String nombre, String idioma) {
        String saludoIdioma;
        if (idioma.equals("a")) {
            return "Bon dia " + nombre;

        } else if (idioma.equals("b")) {
            return "Buenos dias " + nombre;
        } else if (idioma.equals("c")) {
            return "Good day " + nombre

        } else return null;

    }

    public static void main(String[] args) {
        String nombre = IO.solicitarString("Hola dime tu nombre", 2, 20);
        String idioma = IO.solicitarString("Hola dime tu idioma de preferencia\n a)Valenciano\n b)Castellano\nc)Ingles ", 1, 1);

        System.out.println(nombre, idioma);


    }
}
