/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemascomidas;

/**
 *
 * @author USER
 */
// Clase Pizza que hereda de la clase Comida
public class Pizza extends Comida {
    // Atributo propio de la clase Pizza: tamaño de la pizza 
    private String tamaño;

    // Constructor de la clase Pizza
    public Pizza(String nombre, int calorias, String tamaño) {
        // Llama al constructor de la clase padre (Comida) para inicializar nombre y calorías
        super(nombre, calorias);
        // Inicializa el atributo específico de la pizza
        this.tamaño = tamaño;
    }

    // Sobrescribe el método mostrarInformacion() de la clase Comida
    @Override
    public void mostrarInformacion() {
        // Muestra información específica de la pizza, incluyendo el tamaño
        System.out.println(" Pizza: " + getNombre() + "  Tamaño: " + tamaño +
                           "  Calorias: " + getCalorias());
    }
}
