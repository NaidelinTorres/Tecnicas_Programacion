/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_orientada_a_objetos;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class SemanaClimatica {
    private String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    private double[] temperaturas = new double[7];

    public void registrarTemperaturas(Scanner scanner) {
        for (int i = 0; i < diasSemana.length; i++) {
            while (true) {
                try {
                    System.out.print("Ingrese la temperatura del " + diasSemana[i] + ": ");
                    double temp = Double.parseDouble(scanner.nextLine());
                    if (temp >= -50 && temp <= 60) {
                        temperaturas[i] = temp;
                        break;
                    } else {
                        System.out.println("Temperatura fuera de rango (-30 a 80 °C). Intente de nuevo.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingrese un valor numérico válido.");
                }
            }
        }
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        return suma / temperaturas.length;
    }

    public void mostrarResumen() {
        System.out.println("\nTemperaturas registradas por día:");
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i] + ": " + temperaturas[i] + " °C");
        }
        System.out.printf("\nPromedio semanal de temperatura: %.2f °C\n", calcularPromedio());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculo del promedio semanal del clima (POO)");
        SemanaClimatica semana = new SemanaClimatica();
        semana.registrarTemperaturas(scanner);
        semana.mostrarResumen();
        scanner.close(); // Aquí sí puedes cerrarlo al final, si quieres
    }
}


