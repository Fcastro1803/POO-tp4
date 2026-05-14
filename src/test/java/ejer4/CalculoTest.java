package ejer4;

import org.junit.jupiter.api.Test;
import org.unrn.tp4.ejer4.Calculador;
import org.unrn.tp4.ejer4.CalculadorJubilado;
import org.unrn.tp4.ejer4.CalculadorNoJubilado;
import org.unrn.tp4.ejer4.LogTransaction;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoTest {
    @Test
    public void testCalculoJubilado() {
        LogTransaction log = new LogTransaction();
        Calculador calculadorJubilado = new CalculadorJubilado(log);
        double precioProducto = 100.0;
        assertEquals(100, calculadorJubilado.calcularPrecio(precioProducto));
    }

    @Test
    public void testCalculoNoJubilado() {
        LogTransaction log = new LogTransaction();
        Calculador calculadorNoJubilado = new CalculadorNoJubilado(log);
        double precioProducto = 100.0;
        assertEquals(115, calculadorNoJubilado.calcularPrecio(precioProducto));
    }
}
