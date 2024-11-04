package com.javiermengual.tema04.manejodefechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Ejercicio6 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                actualizarPantalla();
            }
        }, 0, 1000); // Actualizar cada segundo
    }

    public static void actualizarPantalla() {
        // Limpiar la pantalla (implementar)

        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaActual = ahora.format(formatter);

        // Mostrar la fecha actual
        System.out.println(fechaActual);

        // Calcular tiempo hasta Año Nuevo
        LocalDateTime añoNuevo = LocalDateTime.of(ahora.getYear() + 1, 1, 1, 0, 0);

        // TODO: Calcular meses, días, horas, minutos y segundos restantes
        long meses = 0;
        long dias = 0;
        long horas = 0;
        long minutos = 0;
        long segundos = 0;

        // Mostrar cuenta regresiva
        System.out.printf("Tiempo hasta Año Nuevo: %d meses, %d días, %d horas, %d minutos, %d segundos%n",
                meses, dias, horas, minutos, segundos);
    }
}
