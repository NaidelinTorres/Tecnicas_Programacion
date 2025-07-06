/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemascomidas;

/**
 *
 * @author USER
 */
// Clase Ensalada que hereda de la clase Comida
public class Ensalada extends Comida {
    // Atributo específico de la ensalada: indica si tiene aderezo o no
    private boolean tieneAderezo;

    // Constructor de la clase Ensalada
    public Ensalada(String nombre, int calorias, boolean tieneAderezo) {
        // Llama al constructor de la clase base (Comida) para inicializar nombre y calorías
        super(nombre, calorias);
        // Inicializa el atributo propio de la ensalada
        this.tieneAderezo = tieneAderezo;
    }

    // Sobrescribe el método mostrarInformacion() de la clase Comida
    @Override
    public void mostrarInformacion() {
        // Usa operador ternario para mostrar si tiene o no aderezo
        String aderezo = tieneAderezo ? "con aderezo" : "sin aderezo";
        // Muestra la información detallada de la ensalada
        System.out.println(" Ensalada: " + getNombre() + aderezo +
                           "  Calorias: " + getCalorias());
    }
}
