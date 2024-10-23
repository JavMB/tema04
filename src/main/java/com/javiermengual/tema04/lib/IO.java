package com.javiermengual.tema04.lib;

import java.util.Scanner;

public class IO {
    /**
     * @param mensaje        Mensaje que le mostramos al usuario
     * @param longitudMinima Numero minimo de caracteres de String que queremos
     * @param longitudMaxima Numero maximo de caracteres de String que quiero
     * @return
     */
    public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima) {
        Scanner sc = new Scanner(System.in);
        String mensajeLeido;
        boolean validado;
        do {
            System.out.println(mensaje);
            mensajeLeido = sc.nextLine();

            validado = mensajeLeido.length() >= longitudMinima && mensajeLeido.length() <= longitudMaxima;
            if (!validado) {
                System.err.printf("La longitud debe estar comprendida entre [%d - %d]\n", longitudMinima, longitudMaxima);
            }


        } while (!validado);
        sc.close();
        System.out.println("String validado correctamente");
        return mensajeLeido;

    }

    /**
     *
     * @param mensaje       Mensaje que le mostramos al usuario
     * @param numeroMinimo  Numero minimo que queremos
     * @param numeroMaximo  Numero maximo que queremos
     * @return
     */
    public static int solicitarInt(String mensaje, int numeroMinimo, int numeroMaximo) {
        Scanner sc = new Scanner(System.in);
        int numeroLeido;
        boolean validado;
        do {
            System.out.println(mensaje);
            numeroLeido = sc.nextInt();

            validado = numeroLeido >= numeroMinimo && numeroLeido <= numeroMaximo;
        } while (!validado);
        sc.close();
        System.out.println("Integer validado correctamente");
        return numeroLeido;
    }
}
