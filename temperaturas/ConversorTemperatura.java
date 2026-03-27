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