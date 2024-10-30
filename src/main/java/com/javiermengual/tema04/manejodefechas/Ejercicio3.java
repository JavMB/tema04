package com.javiermengual.tema04.manejodefechas;

import com.javiermengual.tema04.lib.IO;
import com.javiermengual.tema04.metodos.Ejercicio12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio3 {
    public enum Planeta {
        MERCURIO, VENUS, TIERRA, MARTE, JUPITER, SATURNO, URANO, NEPTUNO
    }

    /**
     *
     * @param fechaNacimiento fecha nacimiento
     * @param planeta  calcula la edad en dias depende del planeta
     * @return
     */
    public static double calculadorEdadPlanetaria(LocalDate fechaNacimiento, Planeta planeta) {
        final double MERCURIO = 87.9;
        final double VENUS = 224.7;
        final double TIERRA = 365.25;
        final double MARTE = 687;
        final double JUPITER = 4333;

        LocalDate fechaActual = LocalDate.now();
        double fechaEnDias = ChronoUnit.DAYS.between(fechaNacimiento, fechaActual);

        return switch (planeta) {
            case MERCURIO -> fechaEnDias / MERCURIO;
            case VENUS -> fechaEnDias / VENUS;
            case TIERRA -> fechaEnDias / TIERRA;
            case MARTE -> fechaEnDias / MARTE;
            case JUPITER -> fechaEnDias / JUPITER;
            default -> 0;
        };


    }

    /**
     *
     * @return devuelve un planeta segun el que escojas
     */
    public static Planeta devolverPlaneta() {
        int planeta;
        do {
            planeta = IO.solicitarInt("Dime el planeta 1.MERCURIO 2. VENUS 3 TIERRA 4 MARTE 5 JUPITER", 1, 10);

        } while (planeta < 0);

        return switch (planeta) {
            case 1 -> Planeta.MERCURIO;
            case 2 -> Planeta.VENUS;
            case 3 -> Planeta.TIERRA;
            case 4 -> Planeta.MARTE;
            case 5 -> Planeta.JUPITER;
            default -> throw new RuntimeException();
        };

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Planeta planeta;
        String fecha = IO.solicitarString("Dime tu fecha nacimiento (dd/mm/yyyy): ", 1, 10);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fecha, formatter);


        System.out.printf("Tienes %f dias \n", calculadorEdadPlanetaria(fechaNacimiento, devolverPlaneta()));
    }
}
