/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemascomidas;

/**
 *
 * @author USER
 */
// Clase principal donde comienza la ejecución del programa
public class Main {
    public static void main(String[] args) {
        Comida comida1 = new Pizza("Pizza Hawaiana", 800, "Grande");
        Comida comida2 = new Ensalada("Ensalada ", 350, true);

        comida1.mostrarInformacion();  // Polimorfismo
        comida2.mostrarInformacion();  // Polimorfismo
    }
}