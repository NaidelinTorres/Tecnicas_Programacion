/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase que permite guardar y leer informacion en un archivo de texto.
 */
public class GestorDeArchivo {

    /**
     * Guarda el contenido en un archivo de texto.
     * @param nombreArchivo Nombre del archivo (ej. "calificaciones.txt")
     * @param contenido Contenido que se escribirá (nombres y notas).
     */
    public void guardar(String nombreArchivo, String contenido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
            System.out.println("Contenido guardado correctamente en: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    /**
     * Lee el contenido de un archivo línea por línea.
     * @param nombreArchivo Nombre del archivo a leer.
     * @return Cadena con el contenido del archivo.
     */
    public String leer(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return contenido.toString();
    }
}