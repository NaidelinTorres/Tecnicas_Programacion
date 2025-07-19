/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naidelin.proyecto.servicio;

import com.naidelin.proyecto.modelo.Cancion;
import java.util.ArrayList;
import java.util.List;

/**
 * Servicio para gestionar canciones.
 */
public class CancionServicio {
    private List<Cancion> canciones = new ArrayList<>();

    public void agregarCancion(String titulo, String artista, String genero) {
        canciones.add(new Cancion(titulo, artista, genero));
    }

    public List<Cancion> listarCanciones() {
        return canciones;
    }
}
