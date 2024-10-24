package com.javiermengual.tema04.metodos;

import java.util.Random;

public class Ejercicio11 {
    /**
     * @param min numero minimo a generar aleatorio
     * @param max numero maximo a generar aleatorio
     * @return numero aleatorio entre min y max
     */
    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }

    public static String generarResultado(int numeroPosibles) {
        String resultadoFinal = "";
        for (int i = 1; i <= 15; i++) {

            int resultado = generarNumeroAleatorio(0, numeroPosibles);
            String quiniela = switch (resultado) {
                case 0 -> "1";
                case 1 -> "X";
                case 2 -> "2";
                default -> "";
            };
            resultadoFinal = resultadoFinal + "Partido " + i + "   " + quiniela+"\n";
        }
        return resultadoFinal;
    }

    public static void main(String[] args) {

        System.out.printf(generarResultado(3));
    }
}
