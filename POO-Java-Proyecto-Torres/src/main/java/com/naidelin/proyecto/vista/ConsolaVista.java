/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naidelin.proyecto.vista;

import java.util.Scanner;

/**
 * Clase que gestiona la interacción con el usuario en consola.
 */

public class ConsolaVista {
    private Scanner scanner = new Scanner(System.in);

    public String leerTexto(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}