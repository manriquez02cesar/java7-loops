package reto.conversion.conv;

import reto.conversion.calc.Calculadora;
import java.util.Scanner;

public class Convertir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = 0;
        boolean esValido = false;

        while (!esValido) {//Si es falso se rompe
            System.out.println("Ingrese su datos en grados Celsius: ");

            // Verificamos si la entrada es un número decimal o entero
            if (sc.hasNextDouble()) {
                celsius = sc.nextDouble();
                esValido = true; // Salimos del bucle
            } else {
                System.out.println("Error: Por favor, ingrese un número válido (ejemplo: 25.5).");
                sc.next(); // IMPORTANTE: Limpia el buffer para evitar un bucle infinito
            }
        }
        Calculadora cal = new Calculadora();
        cal.CelsiusKelvin(celsius);
        cal.CelsiusFahrenheit(celsius);
    }
}
