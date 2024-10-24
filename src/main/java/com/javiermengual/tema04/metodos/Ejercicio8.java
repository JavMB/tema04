package com.javiermengual.tema04.metodos;

import com.javiermengual.tema04.lib.IO;

public class Ejercicio8 {
    /**
     *
     * @param n1 primer digito
     * @param n2 segundo digito
     * @param n3 tercer digito
     * @param n4 cuarto digito
     * @return devuelve si es capicua o no
     */
    public static boolean esCapicua(int n1, int n2, int n3, int n4) {
        String capicua = "" + n1 + n2 + n3 + n4;
        return capicua.charAt(0) == capicua.charAt(3) && capicua.charAt(1) == capicua.charAt(2);
    }

    public static void main(String[] args) {

        int numero = IO.solicitarInt("Dime el num", 1000, 9999);

        int primerDigito = numero / 1000;
        int segundoDigito = (numero % 1000) / 100;
        int tercerDigito = (numero % 100) / 10;
        int cuartoDigito = numero % 10;

        System.out.println(esCapicua(primerDigito, segundoDigito, tercerDigito, cuartoDigito));

    }
}
