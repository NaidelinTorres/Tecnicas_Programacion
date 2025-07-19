/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naidelin.proyecto.modelo;

/**
 * Clase que representa una canción musical.
 * @author USER
 */
public class Cancion {
    private String titulo;
    private String artista;
    private String genero;

    public Cancion(String titulo, String artista, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return " musica " + titulo + " - " + artista + " (" + genero + ")";
    }
}
