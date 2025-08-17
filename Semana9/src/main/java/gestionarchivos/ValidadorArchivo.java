/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase que valida si un archivo de texto tiene datos.
 */
public class ValidadorArchivo {

    /**
     * Verifica que un archivo no esté vacío.
     * @param nombreArchivo Nombre del archivo a verificar.
     * @throws ArchivoVacioException Si el archivo está vacío.
     */
    public void verificarNoVacio(String nombreArchivo) throws ArchivoVacioException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            if (reader.readLine() == null) {
                throw new ArchivoVacioException("El archivo está vacío: " + nombreArchivo);
            }
        } catch (IOException e) {
            System.err.println("Error al verificar el archivo: " + e.getMessage());
        }
    }
}