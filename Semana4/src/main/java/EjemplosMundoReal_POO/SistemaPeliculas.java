/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosMundoReal_POO;

/**
 *
 * @author USER
 */
import java.util.ArrayList;

public class SistemaPeliculas {

    // Clase que representa una película
    static class Pelicula {
        private String titulo;
        private String director;
        private int anio;

        public Pelicula(String titulo, String director, int anio) {
            this.titulo = titulo;
            this.director = director;
            this.anio = anio;
        }

        // Muestra la información de la película
        public void mostrarInfo() {
            System.out.println(titulo + " (Dirigida por " + director + ", " + anio + ")");
        }

        public String getTitulo() {
            return titulo;
        }

        @Override
        public String toString() {
            return titulo + " (" + anio + "), Dirigida por " + director;
        }
    }

    // Clase que representa un usuario del sistema
    static class Usuario {
        private String nombre;
        private ArrayList<Pelicula> favoritas = new ArrayList<>();

        public Usuario(String nombre) {
            this.nombre = nombre;
        }

        // Agrega una película a la lista de favoritas si no está repetida
        public void agregarAFavoritas(Pelicula pelicula) {
            if (!favoritas.contains(pelicula)) {
                favoritas.add(pelicula);
                System.out.println(nombre + " agrego a favoritas: " + pelicula.getTitulo());
            } else {
                System.out.println("La pelicula ya esta en la lista de favoritas.");
            }
        }

        // Muestra todas las películas favoritas del usuario
        public void verFavoritas() {
            if (favoritas.isEmpty()) {
                System.out.println(nombre + " no tiene peliculas en favoritas.");
            } else {
                System.out.println(nombre + " esta viendo su lista de peliculas favoritas:");
                for (Pelicula p : favoritas) {
                    p.mostrarInfo();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Crear películas
        Pelicula p1 = new Pelicula("Wonder Woman", "Patty Jenkins", 2017);
        Pelicula p2 = new Pelicula("En las profundidas del Sena", "Xavier Gens", 2024);
        Pelicula p3 = new Pelicula("Anaconda 2", "Dwight H.Little", 2004);

        // Crear un usuario
        Usuario usuario = new Usuario("Naidelin");

        // Agregar películas a favoritas
        usuario.agregarAFavoritas(p1);
        usuario.agregarAFavoritas(p2);
        usuario.agregarAFavoritas(p1); // Intento duplicado

        // Ver las películas favoritas
        usuario.verFavoritas();
    }
}