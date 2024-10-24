package com.javiermengual.tema04.metodos;

import java.util.Random;

public class Ejercicio12 {
    public enum Calificacion {
        INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, EXCELENTE, NO_VALIDO
    }

    /**
     *
     * @param nota nota para sacar equivalente alfanumerico
     * @return devolvemos calificacion
     */
    public static Calificacion calcularCalificacion(double nota) {
        return switch ((int) nota) {
            case 0, 1, 2, 3, 4 -> Calificacion.INSUFICIENTE;
            case 5 -> Calificacion.SUFICIENTE;
            case 6 -> Calificacion.BIEN;
            case 7, 8 -> Calificacion.NOTABLE;
            case 9, 10 -> Calificacion.EXCELENTE;
            default -> Calificacion.NO_VALIDO;
        };

    }


    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 51; i++) {
            System.out.println(calcularCalificacion(random.nextDouble(10)));

        }
    }
}
