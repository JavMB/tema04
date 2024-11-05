package com.javiermengual.tema04.manejodefechas;
import com.javiermengual.tema04.lib.DateUtils;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LocalDate fechaCalculada = LocalDate.now();
        int opcion;

        do {
            primerMenu(fechaCalculada);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    fechaCalculada = DateUtils.pedirFechaAlUsuario();
                    break;
                case 2:
                    fechaCalculada = segundoMenu(fechaCalculada);
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

    /**
     *
     * @param fecha fecha a mostrar
     */
    public static void primerMenu(LocalDate fecha) {
        System.out.printf("*********************************\n\n" +
                "*** FECHA CALCULADA: %s ***\n\n" +
                "*********************************\n\n" +
                "1. Modificar fecha calculada\n" +
                "2. Operaciones\n" +
                "0. Salir del programa\n" +
                "Elige una opción: ", fecha);
    }

    /**
     *
     * @param fechaCalculada fecha a la que aplicaremos calculos
     * @return fecha con los calculos
     */
    public static LocalDate segundoMenu(LocalDate fechaCalculada) {
        Scanner sc = new Scanner(System.in);
        int opcion2;
        do {
            System.out.printf(
                    "**********************************%n" +
                            "*** OPERACIONES ***%n" +
                            "*** FECHA CALCULADA: %s ***%n" +
                            "**********************************%n" +
                            "1. Sumar años%n" +
                            "2. Sumar meses%n" +
                            "3. Sumar días%n" +
                            "4. Restar años%n" +
                            "5. Restar meses%n" +
                            "6. Restar días%n" +
                            "-----------------------%n" +
                            "0. Volver al menú principal%n" +
                            "Elige una opción: ",
                    fechaCalculada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            );

            opcion2 = sc.nextInt();

            int cantidad;

            switch (opcion2) {
                case 1:
                    System.out.print("Introduce el número de años a sumar: ");
                    cantidad = sc.nextInt();
                    fechaCalculada = fechaCalculada.plusYears(cantidad);
                    System.out.println("Se han sumado " + cantidad + " años. Nueva fecha: " + fechaCalculada);
                    break;
                case 2:
                    System.out.print("Introduce el número de meses a sumar: ");
                    cantidad = sc.nextInt();
                    fechaCalculada = fechaCalculada.plusMonths(cantidad);
                    System.out.println("Se han sumado " + cantidad + " meses. Nueva fecha: " + fechaCalculada);
                    break;
                case 3:
                    System.out.print("Introduce el número de días a sumar: ");
                    cantidad = sc.nextInt();
                    fechaCalculada = fechaCalculada.plusDays(cantidad);
                    System.out.println("Se han sumado " + cantidad + " días. Nueva fecha: " + fechaCalculada);
                    break;
                case 4:
                    System.out.print("Introduce el número de años a restar: ");
                    cantidad = sc.nextInt();
                    fechaCalculada = fechaCalculada.minusYears(cantidad);
                    System.out.println("Se han restado " + cantidad + " años. Nueva fecha: " + fechaCalculada);
                    break;
                case 5:
                    System.out.print("Introduce el número de meses a restar: ");
                    cantidad = sc.nextInt();
                    fechaCalculada = fechaCalculada.minusMonths(cantidad);
                    System.out.println("Se han restado " + cantidad + " meses. Nueva fecha: " + fechaCalculada);
                    break;
                case 6:
                    System.out.print("Introduce el número de días a restar: ");
                    cantidad = sc.nextInt();
                    fechaCalculada = fechaCalculada.minusDays(cantidad);
                    System.out.println("Se han restado " + cantidad + " días. Nueva fecha: " + fechaCalculada);
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion2 != 0);
        return fechaCalculada;


    }
}
