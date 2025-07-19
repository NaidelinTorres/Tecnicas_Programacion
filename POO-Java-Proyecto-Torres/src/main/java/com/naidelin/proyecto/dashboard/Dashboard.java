/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naidelin.proyecto.dashboard;

import com.naidelin.proyecto.servicio.CancionServicio;
import com.naidelin.proyecto.vista.ConsolaVista;

/**
 * Dashboard para gestionar canciones.
 */
public class Dashboard {
    private CancionServicio cancionServicio = new CancionServicio();
    private ConsolaVista vista = new ConsolaVista();

    /**
     * Inicia el menú del dashboard.
     */
    public void iniciar() {
        vista.mostrarMensaje("Bienvenido al Dashboard de Musica");

        boolean salir = false;
        while (!salir) {
            vista.mostrarMensaje("\n=== Menu Principal ===");
            vista.mostrarMensaje("1. Registrar cancion");
            vista.mostrarMensaje("2. Listar canciones");
            vista.mostrarMensaje("3. Salir");

            String opcion = vista.leerTexto("Selecciona una opcion:");

            switch (opcion) {
                case "1":
                    registrarCancion();
                    break;
                case "2":
                    listarCanciones();
                    break;
                case "3":
                    salir = true;
                    vista.mostrarMensaje("¡Gracias por usar el Dashboard de Música!");
                    break;
                default:
                    vista.mostrarMensaje("Opcion invalida.");
            }
        }
    }

    private void registrarCancion() {
        String titulo = vista.leerTexto("Titulo de la cancion:");
        String artista = vista.leerTexto("Nombre del artista:");
        String genero = vista.leerTexto("Genero musical:");
        cancionServicio.agregarCancion(titulo, artista, genero);
        vista.mostrarMensaje("Cancion registrada.");
    }

    private void listarCanciones() {
        vista.mostrarMensaje("Canciones Registradas:");
        cancionServicio.listarCanciones().forEach(cancion -> vista.mostrarMensaje(cancion.toString()));
    }
}

