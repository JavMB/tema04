package com.javiermengual.tema04.manejodefechas;

import com.javiermengual.tema04.lib.IO;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ejercicio2 {
    /**
     *
     * @param fechaNacimiento fecha nacimiento
     * @return edad en dias
     */
    public static long calculadorEdadEnDias(LocalDate fechaNacimiento){
        LocalDate fechaActual = LocalDate.now();
        return ChronoUnit.DAYS.between(fechaNacimiento, fechaActual);
    }
    public static void main(String[] args) {
        String fecha=
                IO.solicitarString("Dime tu fecha nacimiento (dd/mm/yyyy): ",1,10);
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento=LocalDate.parse(fecha,formatter);

        System.out.printf("Tienes %d años en dias\n",calculadorEdadEnDias(fechaNacimiento));
    }
}
