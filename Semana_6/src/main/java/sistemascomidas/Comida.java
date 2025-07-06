/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemascomidas;

/**
 *
 * @author USER
 */
// Clase base Comida: representa una comida genérica
public class Comida {
    // Atributos privados: nombre de la comida y cantidad de calorías
    private String nombre;
    private int calorias;

    // Constructor: inicializa los atributos con los valores recibidos como parámetros
    public Comida(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    // Método getter para obtener el nombre de la comida
    public String getNombre() {
        return nombre;
    }

    // Método getter para obtener la cantidad de calorías
    public int getCalorias() {
        return calorias;
    }

    // Método que muestra la información básica de la comida
    public void mostrarInformacion() {
        System.out.println("Comida: " + nombre + ", Calorias: " + calorias);
    }
}
