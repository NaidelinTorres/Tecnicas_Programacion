/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7;

/**
 *Clase Cancion que representa una cancion musical
 * @author USER
 */
public class Cancion {
    //Atributos privados para encapsulamiento
    private String titulo;
    private String artista;
    private int duracion; // en segundos

    // Constructor por defecto
    // Inicializacion de una cancion generica con valores predeterminados 
    public Cancion() {
        this.titulo = "Desconocido";
        this.artista = "Desconocido";
        this.duracion = 180;
    }

    // Constructor parametrizado
    // Permite establecer todos los atributos desde la creacion del objeto 
    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    // Sobrecarga del constructor
    // Solo se proporciona titulo y artista ,la duracion se asigna por defecto
    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = 200; // duracion por defecto
    }

    // Metodo para mostrar la informacion de la cancion 
    public void mostrarInfo() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Duracion: " + this.duracion + " segundos");
        System.out.println("-------------------------");
    }
}
