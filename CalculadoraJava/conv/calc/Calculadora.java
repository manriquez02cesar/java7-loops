package reto.conversion.CalculadoraJava.conv.calc;

public class Calculadora {
    double fahrenheit;
    double kelvin;


    public void CelsiusKelvin(double celsius){
        kelvin = celsius + 273.15;
        System.out.println("Grados Kelvin: " + kelvin);
    }

    public void CelsiusFahrenheit(double celsius){
        fahrenheit = (celsius * ((double) 9 / 5)) + 32;
        System.out.println("Grados Fahrenheit: " + fahrenheit);

    }
}
