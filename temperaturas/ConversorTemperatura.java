/*
package temperaturas;


public class ConversorTemperatura {

    public static double celsiusAFahrenheit(double celsius) {

        double resultado = (celsius * 9) / 5 + 32;
        return Math.round(resultado); 

    }

    public static double celsiusAKelvin(double celsius) {

        return celsius + 273;

    }
}

 */
package temperaturas;

public class ConversorTemperatura {

    public static double celsiusAFahrenheit(double celsius) {
        // Math.round() eliminaba los decimales requeridos.
        // SOLUCIÓN: Se quita el redondeo y se usa 5.0 para forzar división decimal.
        double resultado = (celsius * 9) / 5.0 + 32;
        return resultado;
    }

    public static double celsiusAKelvin(double celsius) {
        // Faltaba la constante .15 necesaria para la precisión.
        // SOLUCIÓN: Se suma 273.15 en lugar de 273.
        return celsius + 273.15;
    }
}