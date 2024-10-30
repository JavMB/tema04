package com.javiermengual.tema04.manejodefechas;

import com.javiermengual.tema04.lib.IO;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Ejercicio4 {
    /**
     * @param fechaNacimiento fecha nacimiento
     * @return devuelve tu signo zodiacal
     */
    public static String obtenerSignoZodiacal(LocalDate fechaNacimiento) {
        int dia = fechaNacimiento.getDayOfMonth();
        Month mes = fechaNacimiento.getMonth();

        if ((mes == Month.JANUARY && dia >= 21) || (mes == Month.FEBRUARY && dia <= 16)) {
            return "Capricornio";
        } else if ((mes == Month.FEBRUARY && dia >= 17) || (mes == Month.MARCH && dia <= 11)) {
            return "Acuario";
        } else if ((mes == Month.MARCH && dia >= 12) || (mes == Month.APRIL && dia <= 18)) {
            return "Piscis";
        } else if ((mes == Month.APRIL && dia >= 19) || (mes == Month.MAY && dia <= 13)) {
            return "Aries";
        } else if ((mes == Month.MAY && dia >= 14) || (mes == Month.JUNE && dia <= 19)) {
            return "Tauro";
        } else if ((mes == Month.JUNE && dia >= 20) || (mes == Month.JULY && dia <= 20)) {
            return "Géminis";
        } else if ((mes == Month.JULY && dia >= 21) || (mes == Month.AUGUST && dia <= 9)) {
            return "Cáncer";
        } else if ((mes == Month.AUGUST && dia >= 10) || (mes == Month.SEPTEMBER && dia <= 15)) {
            return "Leo";
        } else if ((mes == Month.SEPTEMBER && dia >= 16) || (mes == Month.OCTOBER && dia <= 30)) {
            return "Virgo";
        } else if ((mes == Month.OCTOBER && dia >= 31) || (mes == Month.NOVEMBER && dia <= 22)) {
            return "Libra";
        } else if ((mes == Month.NOVEMBER && dia >= 23) || (mes == Month.NOVEMBER && dia <= 29)) {
            return "Escorpio";
        } else if ((mes == Month.NOVEMBER && dia == 30) || (mes == Month.DECEMBER && dia <= 17)) {
            return "Ofiuco";
        } else {
            return "Sagitario";
        }
    }

    public static void main(String[] args) {
        String fecha = IO.solicitarString("Dime tu fecha nacimiento (dd/mm/yyyy): ", 1, 10);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fecha, formatter);

        String signo = obtenerSignoZodiacal(fechaNacimiento);
        System.out.println("El signo zodiacal es: " + signo);
    }
}
