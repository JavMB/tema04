package com.javiermengual.tema04.metodos;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio15 {

    public static int juego() throws InterruptedException {
        //Declarar variables
        Scanner scanner = new Scanner(System.in);
        boolean plantado = false;
        int puntosPlayer = 0;
        int porrasPlayer = 0;
        int puntosCPU;
        int porrasCPU = 0;
        char plantarse;
        //repetir juego hasta que uno de los dos llegue a 5 o mayor
        do {
            //Empieza el jugador o vuelve a tirar el jugador
            puntosPlayer = player(puntosPlayer);
            //preguntar si quiere seguir o no
            if (puntosPlayer < 11) {
                System.out.print("¿Deseas plantarte con " + puntosPlayer + " puntos? (s/n): ");
                plantarse = scanner.nextLine().charAt(0);
                plantado = plantarse == 's' || plantarse == 'S';
                //en el caso de que no juegue la cpu
                if (plantado) {
                    plantado = false;
                    // Ahora la CPU intenta igualar o mejorar el resultado del jugador

                    puntosCPU = cpu(puntosPlayer);

                    //resultados de ambos
                    if (puntosCPU > 11) {
                        System.out.println("CPU se ha pasado. Porra para Player!!");
                        porrasPlayer++;
                        puntosPlayer = 0;
                    } else if (puntosCPU > puntosPlayer) { // Gana CPU
                        if (puntosCPU == 11) {
                            System.out.println("\n$$$$$$$$$$$$$$$$");
                            System.out.println("$$$$ ¡ONCE! $$$$");
                            System.out.println("$$$$$$$$$$$$$$$$");
                            System.out.println("\nDoble porra para CPU\n");
                            porrasCPU += 2;
                            puntosPlayer = 0;
                        } else {
                            System.out.println("CPU ha mejorado tu puntuación. Porra para CPU!!");
                            puntosPlayer = 0;
                            porrasCPU++;
                        }
                    } else { // Empate
                        System.out.println("Empate!! Porra para los dos");
                        porrasCPU++;
                        porrasPlayer++;
                        puntosPlayer = 0;
                    }

                    //Cuantas porras tiene cada uno
                    System.out.println("\n**********************");
                    System.out.println("* " + porrasPlayer + " PLAYER  -  CPU " + porrasCPU + " *");
                    System.out.println("**********************");
                    System.out.print("\nPulsa intro para continuar...");
                    scanner.nextLine();
                }
                //Este es el caso de si el jugador llega a 11 o mayor
            } else if (puntosPlayer == 11) {
                // Al obtener 11 el jugador suma automáticamente 2 porras
                porrasPlayer += 2;
                puntosPlayer = 0;
                System.out.println("\n$$$$$$$$$$$$$$$$");
                System.out.println("$$$$ ¡ONCE! $$$$");
                System.out.println("$$$$$$$$$$$$$$$$");
                System.out.println("\n¡Bonificación! Doble porra");

                System.out.println("\n**********************");
                System.out.println("* " + porrasPlayer + " PLAYER  -  CPU " + porrasCPU + " *");
                System.out.println("**********************");
                System.out.print("\nPulsa intro para continuar...");
                scanner.nextLine();
            } else {
                // El jugador se ha pasado
                System.out.println("Ohh!! Te has pasado");
                System.out.println("Porra para la CPU");
                porrasCPU += 1;
                puntosPlayer = 0;
                System.out.println("\n**********************");
                System.out.println("* " + porrasPlayer + " PLAYER  -  CPU " + porrasCPU + " *");
                System.out.println("**********************");
                System.out.print("\nPulsa intro para continuar...");
                scanner.nextLine();
            }
            //aqui reinicia el bucle
        } while (porrasPlayer < 5 && porrasCPU < 5);
        return porrasPlayer;
    }

    /**
     * Aqui es donde se tirara del 1 al 6 (Si se quiere modificar la posibilidad de uno u otro vaya a su variable)
     *
     * @param min el minimo de la tirada
     * @param max el maximo de la tirada
     * @return devolvera la tirada
     */
    public static int proabilidad(int min, int max) {
        Random proabilidad = new Random();
        int aleatorio = proabilidad.nextInt(min, max);
        return aleatorio;
    }

    /**
     * Aqui es donde jugara el jugador
     *
     * @param puntosPlayer El puntuaje del jugador donde saldra y si sigue jugando no pierda los puntos
     * @return //devolvera el valor de los puntos
     * @throws InterruptedException Lee el principio
     */
    public static int player(int puntosPlayer) throws InterruptedException {
        final int DELAY = 500;
        int tiradaPlayer;
        System.out.println("Jugador lanza el dado al aire ...");
        Thread.sleep(DELAY);
        tiradaPlayer = proabilidad(1, 7);
        System.out.println("\n*****");
        System.out.println("* " + tiradaPlayer + " *");
        System.out.println("*****");
        puntosPlayer += tiradaPlayer;
        System.out.println("\nTu puntuación actual es " + puntosPlayer);
        return puntosPlayer;
    }

    /**
     * Aqui es donde la cpu intentara igualar o superar al jugador
     *
     * @param puntosPlayer el valor del jugador para intentar igualar o superar
     * @return devolvera lo que saco la cpu
     * @throws InterruptedException Lee el principio parte 2
     */
    public static int cpu(int puntosPlayer) throws InterruptedException {
        final int DELAY = 500;
        int puntosCPU = 0;
        int tiradaCPU;
        while (puntosCPU < puntosPlayer) {
            System.out.println("CPU lanza el dado al aire ...");
            Thread.sleep(DELAY);
            tiradaCPU = proabilidad(1, 7);
            System.out.println("\n?????");
            System.out.println("? " + tiradaCPU + " ?");
            System.out.println("?????\n");
            puntosCPU += tiradaCPU;
            System.out.println("La puntuación actual de la CPU es " + puntosCPU);
        }
        return puntosCPU;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int porrasPlayer;
        int porrasCPU;
        int opcion;

        do {
            System.out.println("***************************");
            System.out.println("*** JUEGO DE DADOS ONCE ***");
            System.out.println("***************************");
            System.out.println("1. Nueva partida ...");
            System.out.println("0. Salir");
            System.out.print("\nElige una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());
            if (opcion == 1) {
                porrasCPU = 0;
                porrasPlayer = juego();
                if (porrasCPU >= 5) {
                    System.out.println("\nCPU gana la partida!!! por " + porrasCPU + " porras a " + porrasPlayer + "\n");
                } else if (porrasPlayer >= 5) {
                    System.out.println("\nPlayer gana la partida!!! por " + porrasPlayer + " porras a " + porrasCPU + "\n");
                }
            }
        } while (opcion != 0);
        System.out.println("Hasta pronto!!");
        scanner.close();
    }
}

