/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

/*
 * Programa: Tienda de Teléfonos
 * Descripción: Este programa permite gestionar una tienda de teléfonos. 
 * El usuario puede agregar teléfonos, visualizar la lista completa y eliminar un teléfono ingresando su nombre.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class tienda_telefonos {

    // Lista para almacenar los teléfonos registrados
    private static ArrayList<Telefono> lista_telefonos = new ArrayList<>();

    // Clase interna para representar un teléfono
    static class Telefono {
        private String nombre_telefono;
        private int precio_telefono;
        private float pantalla_telefono;
        private String marca_telefono;
        private boolean disponible_telefono;

        // Constructor para inicializar un teléfono
        public Telefono(String nombre, int precio, float pantalla, String marca, boolean disponible) {
            this.nombre_telefono = nombre;
            this.precio_telefono = precio;
            this.pantalla_telefono = pantalla;
            this.marca_telefono = marca;
            this.disponible_telefono = disponible;
        }

        // Métodos para obtener los datos del teléfono
        public String getNombreTelefono() {
            return nombre_telefono;
        }

        public int getPrecioTelefono() {
            return precio_telefono;
        }

        public float getPantallaTelefono() {
            return pantalla_telefono;
        }

        public String getMarcaTelefono() {
            return marca_telefono;
        }

        public boolean isDisponibleTelefono() {
            return disponible_telefono;
        }
    }

    // Método para ingresar un nuevo teléfono
    private static void ingresar_telefono() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del telefono: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del telefono: ");
        int precio = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Ingrese el tamaño de la pantalla (en pulgadas): ");
        float pantalla = scanner.nextFloat();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Ingrese la marca del telefono: ");
        String marca = scanner.nextLine();

        System.out.print("¿El telefono esta disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();
        scanner.nextLine(); // Limpiar buffer

        // Crear objeto y agregar a la lista
        Telefono nuevo_telefono = new Telefono(nombre, precio, pantalla, marca, disponible);
        lista_telefonos.add(nuevo_telefono);

        System.out.println("El telefono ha sido agregado con exito.\n");
    }

    // Método para mostrar todos los teléfonos
    private static void mostrar_telefonos() {
        if (lista_telefonos.isEmpty()) {
            System.out.println("No hay telefonos registrados.\n");
        } else {
            for (int i = 0; i < lista_telefonos.size(); i++) {
                Telefono tel = lista_telefonos.get(i);
                System.out.println("Telefono #" + (i + 1));
                System.out.println("Nombre: " + tel.getNombreTelefono());
                System.out.println("Precio: $" + tel.getPrecioTelefono());
                System.out.println("Tamaño de pantalla: " + tel.getPantallaTelefono() + " pulgadas");
                System.out.println("Marca: " + tel.getMarcaTelefono());
                System.out.println("Disponible: " + (tel.isDisponibleTelefono() ? "Sí" : "No"));
                System.out.println();
            }
        }
    }

    // Método para eliminar un teléfono por nombre
    private static void eliminar_telefono() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del telefono que desea eliminar: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < lista_telefonos.size(); i++) {
            if (lista_telefonos.get(i).getNombreTelefono().equalsIgnoreCase(nombre)) {
                lista_telefonos.remove(i);
                System.out.println("El telefono fue eliminado con éxito.\n");
                return;
            }
        }

        System.out.println("No se encontro un telefono con ese nombre.\n");
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Tienda de Telefonos\n");

        while (true) {
            // Menú principal
            System.out.println("Menu:");
            System.out.println("1. Ingresar telefono");
            System.out.println("2. Mostrar telefonos");
            System.out.println("3. Eliminar telefono");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            // Control de opciones del menú
            switch (opcion) {
                case 1:
                    ingresar_telefono();
                    break;
                case 2:
                    mostrar_telefonos();
                    break;
                case 3:
                    eliminar_telefono();
                    break;
                case 4:
                    System.out.println("Gracias por visitar la Tienda de Telefonos.");
                    return;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.\n");
            }
        }
    }
}
