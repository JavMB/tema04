package com.javiermengual.tema04.manejodefechas;

import com.javiermengual.tema04.lib.IO;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ejercicio1 {
    /**
     *
     * @param fechaNacimiento fecha nacimiento
     * @return edad calculada
     */
    public static int calculadorEdad(LocalDate fechaNacimiento){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    public static void main(String[] args) {
        String fecha=
        IO.solicitarString("Dime tu fecha nacimiento (dd/mm/yyyy): ",1,10);
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento=LocalDate.parse(fecha,formatter);

        System.out.printf("Tienes %d años \n",calculadorEdad(fechaNacimiento));


    }
}
