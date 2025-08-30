/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuggyAtividadCorregido;

/**
 *
 * @author USER
 */
import java.util.*;

public class BuggyActividadCorregido {

    public static void main(String[] args) {

        // LISTA de nombres
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Ana");

        // Corregido: índice válido
        System.out.println("Elemento en posición 2: " + nombres.get(2));

        // Corregido: usar equals() para comparar cadenas
        String buscado = new String("Ana");
        if (buscado.equals("Ana")) {
            System.out.println("Encontrado");
        }

        // MAPA de teléfonos
        Map<String, String> telefonos = new HashMap<>();
        telefonos.put("Ana", "0991111111");
        telefonos.put("Luis", "0992222222");
        telefonos.put("Ana", "0993333333"); // sobrescribe, correcto en HashMap

        // Corregido: validar antes de acceder
        if (telefonos.containsKey("Bea")) {
            System.out.println("Bea: " + telefonos.get("Bea").toString());
        } else {
            System.out.println("Bea no existe en el mapa");
        }

        // SET de inscritos (ahora reconoce duplicados lógicos)
        Set<Alumno> inscritos = new HashSet<>();
        inscritos.add(new Alumno(1, "Ana"));
        inscritos.add(new Alumno(2, "Luis"));
        inscritos.add(new Alumno(1, "Ana")); // duplicado lógico

        System.out.println("Tamaño del Set: " + inscritos.size());
        System.out.println(inscritos);
    }
}

class Alumno {
    int id;
    String nombre;

    Alumno(int id, String nombre) { 
        this.id = id; 
        this.nombre = nombre; 
    }

    // Corregido: equals y hashCode para detectar duplicados
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return id == alumno.id && Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @Override
    public String toString() {
        return "Alumno{id=" + id + ", nombre='" + nombre + "'}";
    }
}