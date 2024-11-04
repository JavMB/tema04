package com.javiermengual.tema04.manejodefechas;

import com.javiermengual.tema04.lib.DateUtils;
import com.javiermengual.tema04.lib.IO;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double DISTANCIA_MARTE = 225_0000_00;

        LocalDateTime fechaSalida = DateUtils.pedirFechaAlUsuarioConHora();

        System.out.println("Dime la velocidad porfavor");
        double velocidad = sc.nextDouble();

        LocalDateTime fechaLlegada = fechaLlegadaMarte(fechaSalida, DISTANCIA_MARTE, velocidad);

        mostrarDatosDelViaje(fechaLlegada,fechaSalida,velocidad,DISTANCIA_MARTE);

    }

    /**
     *
     * @param fechaSalida fecha salida de la tierra
     * @param distancia     distancia hasta marte
     * @param velocidad     velocidad a la que salimos en km/h
     * @return
     */
    public static LocalDateTime fechaLlegadaMarte(LocalDateTime fechaSalida, double distancia, double velocidad) {
        double horas = distancia / velocidad;
        long segundos = (long) (horas * 3600); // Convertir horas a segundos
        return fechaSalida.plusSeconds(segundos);
    }

    /**
     *
     * @param fechaLlegada Fecha en que llegamos a marte
     * @param fechaSalida   Fecha que salimos de la tierra
     * @param velocidad     Velocidad a la que vamos en km/h
     * @param distancia      distancia a recorrer hasta el planeta
     */
    public static void mostrarDatosDelViaje(LocalDateTime fechaLlegada, LocalDateTime fechaSalida, double velocidad, double distancia) {
        // Calcular el tiempo de viaje
        double horasViaje = distancia / velocidad;
        double diasViaje = horasViaje / 24;

        // Calcular la duración del viaje
        Duration duracionViaje = Duration.between(fechaSalida, fechaLlegada);

        // Formatear las fechas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Mostrar resultados
        System.out.println("Datos del viaje a Marte:");
        System.out.println("------------------------");
        System.out.printf("Distancia a Marte: %.2f km%n", distancia);
        System.out.printf("Velocidad de la nave: %.2f km/h%n", velocidad);
        System.out.println("Fecha y hora de salida: " + fechaSalida.format(formatter));
        System.out.println("Fecha y hora estimada de llegada a Marte: " + fechaLlegada.format(formatter));
        System.out.printf("Tiempo total de viaje: %.2f horas (%.2f dias)%n", horasViaje, diasViaje);
        System.out.printf("Tiempo total de viaje desglosado: %d dias, %d horas, %d minutos y %d segundos%n",
                duracionViaje.toDays(),
                duracionViaje.toHoursPart(),
                duracionViaje.toMinutesPart(),
                duracionViaje.toSecondsPart());
    }


}


