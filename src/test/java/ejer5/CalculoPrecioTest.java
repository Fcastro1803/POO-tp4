package ejer5;

import org.junit.jupiter.api.Test;
import org.unrn.tp4.ejer5.CalculadorPrecio;
import org.unrn.tp4.ejer5.RemeraImportada;
import org.unrn.tp4.ejer5.RemeraNacional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoPrecioTest {

    @Test
    public void testCalculoNacional() {
        CalculadorPrecio remeraNacional = new RemeraNacional();
        double precioUnitario = 100.0;
        assertEquals(93.38, remeraNacional.calcularPrecioFinal(precioUnitario));
    }

    @Test
    public void testCalculoImportado() {
        CalculadorPrecio remeraImportada = new RemeraImportada();
        double precioUnitario = 100.0;
        assertEquals(135, remeraImportada.calcularPrecioFinal(precioUnitario));
    }
}
