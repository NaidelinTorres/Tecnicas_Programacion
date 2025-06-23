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

public class SistemaMusical {

    // Clase interna Cancion
    static class Cancion {
        private String titulo;
        private String artista;
        private double duracion;

        public Cancion(String titulo, String artista, double duracion) {
            this.titulo = titulo;
            this.artista = artista;
            this.duracion = duracion;
        }

        public void reproducir() {
            System.out.println("Reproduciendo: " + titulo + " - " + artista + " (" + duracion + " min)");
        }

        public String getTitulo() {
            return titulo;
        }

        @Override
        public String toString() {
            return titulo + " - " + artista + " (" + duracion + " min)";
        }
    }

    // Clase interna Usuario
    static class Usuario {
        private String nombre;
        private ArrayList<Cancion> favoritos = new ArrayList<>();

        public Usuario(String nombre) {
            this.nombre = nombre;
        }

        public void agregarAFavoritos(Cancion cancion) {
            if (!favoritos.contains(cancion)) {
                favoritos.add(cancion);
                System.out.println(nombre + " agrego a favoritos: " + cancion.getTitulo());
            } else {
                System.out.println("La cancion ya esta en favoritos.");
            }
        }

        public void reproducirFavoritos() {
            if (favoritos.isEmpty()) {
                System.out.println(nombre + " no tiene canciones en favoritos.");
            } else {
                System.out.println(nombre + " esta reproduciendo su lista de favoritos:");
                for (Cancion c : favoritos) {
                    c.reproducir();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Crear canciones
        Cancion c1 = new Cancion("I got you", "Twice", 3.52);
        Cancion c2 = new Cancion("Someone Like You", "Adele", 4.45);
        Cancion c3 = new Cancion("Sabes", "Reik", 3.42);

        // Crear usuario
        Usuario usuario = new Usuario("Crisber");

        // Usuario agrega canciones a favoritos
        usuario.agregarAFavoritos(c1);
        usuario.agregarAFavoritos(c3);
        usuario.agregarAFavoritos(c1); // Intenta agregar duplicado

        // Usuario reproduce sus favoritos
        usuario.reproducirFavoritos();
    }
}