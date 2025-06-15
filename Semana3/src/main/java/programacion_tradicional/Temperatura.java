/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_tradicional;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Temperatura {

    public static double[] ingresarTemperaturas(Scanner scanner) {
        double[] temperaturas = new double[7];
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        for (int i = 0; i < diasSemana.length; i++) {
            while (true) {
                try {
                    System.out.print("Ingrese la temperatura de " + diasSemana[i] + ": ");
                    double temp = Double.parseDouble(scanner.nextLine());

                    if (temp >= -50 && temp <= 60) {
                        temperaturas[i] = temp;
                        break;
                    } else {
                        System.out.println("Temperatura fuera de rango (-50 a 60 °C). Intente de nuevo.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingrese un valor numerico valido.");
                }
            }
        }

        return temperaturas;
    }

    public static double calcularPromedio(double[] temperaturas) {
        double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        return suma / temperaturas.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculo del promedio semanal del clima");
        double[] temperaturas = ingresarTemperaturas(scanner);
        double promedio = calcularPromedio(temperaturas);
        System.out.printf("El promedio semanal de temperaturas es: %.2f °C%n", promedio);
        scanner.close();
    }
}
