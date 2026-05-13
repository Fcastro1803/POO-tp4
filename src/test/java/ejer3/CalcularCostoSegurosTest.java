package ejer3;

import org.junit.jupiter.api.Test;
import org.unrn.tp4.ejer3.PaqueteSeguros;
import org.unrn.tp4.ejer3.SeguroIndividual;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcularCostoSegurosTest {

    //      Test 1: Calcular el costo total de un proyecto completo (paquete de seguros)
//      con múltiples componentes y descuentos aplicados.
    @Test
    public void calcularCostoTotalPaqueteCompletoTest() {
        SeguroIndividual auto = new SeguroIndividual("Seguro de Auto", 100);
        SeguroIndividual casa = new SeguroIndividual("Seguro de Hogar", 200);
        SeguroIndividual vida = new SeguroIndividual("Seguro de Vida", 150);

        PaqueteSeguros p1 = new PaqueteSeguros();
        PaqueteSeguros p2 = new PaqueteSeguros();

        p1.addComponentes(auto);
        p1.addComponentes(casa);

        p2.addComponentes(vida);
        p2.addComponentes(p1);

        assertEquals(270.0, p1.calcularCosto());

        assertEquals(357.0, p2.calcularCosto());
    }

    //     Test 2: Calcular el costo de una parte del paquete (un seguro individual o sub-paquete)
//     Verifica que los componentes individuales se calculen correctamente.
    @Test
    public void calcularCostoBaseSeguroIndividualTest() {
        SeguroIndividual auto = new SeguroIndividual("Seguro de Auto", 100);
        SeguroIndividual casa = new SeguroIndividual("Seguro de Hogar", 200);

        assertEquals(100.0, auto.calcularCosto());
        assertEquals(200.0, casa.calcularCosto());

        // Creamos un paquete con un único seguro (sin descuento aplicable)
        PaqueteSeguros paqueteUnico = new PaqueteSeguros();
        paqueteUnico.addComponentes(auto);

        assertEquals(95.0, paqueteUnico.calcularCosto());
    }

    //Test adicional: Verificar conteo de seguros en un paquete completo
    @Test
    public void contarSegurosEnPaqueteTest() {
        SeguroIndividual auto = new SeguroIndividual("Seguro de Auto", 100);
        SeguroIndividual casa = new SeguroIndividual("Seguro de Hogar", 200);
        SeguroIndividual vida = new SeguroIndividual("Seguro de Vida", 150);

        PaqueteSeguros p1 = new PaqueteSeguros();
        PaqueteSeguros p2 = new PaqueteSeguros();

        p1.addComponentes(auto);
        p1.addComponentes(casa);
        p2.addComponentes(vida);
        p2.addComponentes(p1);

        assertEquals(2, p1.contarSeguros());
        assertEquals(3, p2.contarSeguros());
    }
}

