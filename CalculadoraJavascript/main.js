// Definición de la clase (Como la tenías en Java)
class Calculadora {
    celsiusKelvin(celsius) {
        const kelvin = celsius + 273.15;
        console.log("Resultado Kelvin: " + kelvin.toFixed(2));
        return kelvin;
    }

    celsiusFahrenheit(celsius) {
        const fahrenheit = (celsius * (9 / 5)) + 32;
        console.log("Resultado Fahrenheit: " + fahrenheit.toFixed(2));
        return fahrenheit;
    }
}

// Instanciamos la clase
const miCalculadora = new Calculadora();

// Esta función será llamada desde el botón del HTML
function realizarCalculo() {
    const input = document.getElementById("datoCelsius").value;
    const celsius = parseFloat(input);

    // Validación similar al hasNextDouble()
    if (isNaN(celsius)) {
        console.error("Error: Entrada no válida");
        alert("Por favor, ingresa un número");
        return;
    }

    console.log("--- Procesando " + celsius + "°C ---");
    
    // Llamada a los métodos
    const k = miCalculadora.celsiusKelvin(celsius);
    const f = miCalculadora.celsiusFahrenheit(celsius);

    // Mostrar en el DOM con tres decimales
    document.getElementById("resultado").innerHTML = `
        <p>Kelvin: ${k.toFixed(3)}</p>
        <p>Fahrenheit: ${f.toFixed(3)}</p>
    `;
}