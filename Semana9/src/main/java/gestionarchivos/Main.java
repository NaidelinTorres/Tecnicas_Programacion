/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarchivos;

/**
 * Clase principal que gestiona el flujo de guardar, leer y validar un archivo de texto.
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        GestorDeArchivo gestor = new GestorDeArchivo();
        ValidadorArchivo validador = new ValidadorArchivo();

        String nombreArchivo = "archivo.txt";

        // Contenido de ejemplo (puedes modificarlo)
        String contenido = """
                Naidelin Torres - 7.5
                Alicia Coquinche - 8.7
                Justin Ponce - 9.9
                Camila Cabello - 10          
                """;

        // Guardar calificaciones
        gestor.guardar(nombreArchivo, contenido);

        // Leer y mostrar calificaciones
        String contenidoLeido = gestor.leer(nombreArchivo);
        System.out.println("Contenido del archivo:\n" + contenidoLeido);

        // Verificar si el archivo está vacío
        try {
            validador.verificarNoVacio(nombreArchivo);
            System.out.println("El archivo tiene datos.");
        } catch (ArchivoVacioException ave) {
            System.err.println("Excepción: " + ave.getMessage());
        }
    }
}