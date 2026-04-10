package reto.conversion.CalculadoraJava.conv;

import reto.conversion.CalculadoraJava.conv.calc.Calculadora;
import java.util.Scanner;

public class Convertir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = 0;
        boolean esValido = false;

        while (!esValido) {
            System.out.println("Ingrese su datos en grados Celsius: ");

            // //El metodo hasNextDouble funciona como semaforo para identificar si el dato que va a ingresar el usuario es de tipo double o entero
            if (sc.hasNextDouble()) {
                celsius = sc.nextDouble();
                esValido = true; // Salimos del bucle
            } else {
                System.out.println("Error: Por favor, ingrese un número válido (ejemplo: 25.5).");
                sc.next(); // Limpiamos el buffer para evitar un bucle infinito al volver a ingresar el dato si se equivoca el usuario
            }
        }
        Calculadora cal = new Calculadora();
        cal.CelsiusKelvin(celsius);
        cal.CelsiusFahrenheit(celsius);
    }
}
