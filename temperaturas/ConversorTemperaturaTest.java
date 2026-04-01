package temperaturas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConversorTemperaturaTest {

    private final double DELTA = 0.01; // Margen de error aceptable para decimales

    @Test
    public void testConversionesRequeridas() {
        // Validación de datos de prueba según la tabla proporcionada
        // Caso 2 Celsius
        assertEquals(35.6, ConversorTemperatura.celsiusAFahrenheit(2), DELTA);
        assertEquals(275.15, ConversorTemperatura.celsiusAKelvin(2), DELTA);

        // Caso 3 Celsius
        assertEquals(37.4, ConversorTemperatura.celsiusAFahrenheit(3), DELTA);
        assertEquals(276.15, ConversorTemperatura.celsiusAKelvin(3), DELTA);

        // Caso 4 Celsius
        assertEquals(39.2, ConversorTemperatura.celsiusAFahrenheit(4), DELTA);
        assertEquals(277.15, ConversorTemperatura.celsiusAKelvin(4), DELTA);
    }

    @Test
    public void testCasosLimitesYNegativos() {
        // Caso negativo
        assertTrue(ConversorTemperatura.celsiusAFahrenheit(-10) == 14.0);
        // Caso límite: Cero absoluto
        assertEquals(0, ConversorTemperatura.celsiusAKelvin(-273.15), DELTA);
    }
}