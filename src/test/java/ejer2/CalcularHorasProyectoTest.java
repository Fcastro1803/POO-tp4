package ejer2;

import org.junit.jupiter.api.Test;
import org.unrn.tp4.ejer2.HistoriaUsuario;
import org.unrn.tp4.ejer2.Proyecto;
import org.unrn.tp4.ejer2.Spike;
import org.unrn.tp4.ejer2.Tarea;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcularHorasProyectoTest {
    @Test
    public void calcularHorasProyectoTest() {
        Proyecto p1 = new Proyecto("p1");
        HistoriaUsuario hu1 = new HistoriaUsuario();
        HistoriaUsuario hu2 = new HistoriaUsuario();
        p1.addHu(hu1);
        p1.addHu(hu2);
        hu1.addItem(new Tarea(12));
        hu1.addItem(new Spike(3));
        hu2.addItem(new Tarea(6));
        hu2.addItem(new Tarea(4));
        assertEquals(25, p1.horasParaCompletar());
    }

    //Este test prueba que no se puedan agregar items a spike's o tareas
    @Test
    public void calcularAddItemTest() {
        Proyecto p1 = new Proyecto("p1");
        Tarea t1 = new Tarea(12);
        Spike sp1 = new Spike(3);
        UnsupportedOperationException exception = assertThrows(
                UnsupportedOperationException.class,
                () -> {
                    t1.addItem(sp1);
                }
        );

        UnsupportedOperationException exception2 = assertThrows(
                UnsupportedOperationException.class,
                () -> {
                    sp1.addItem(t1);
                }
        );
        assertEquals("No se pueden agregar items a una tarea.", exception.getMessage());
        assertEquals("No se pueden agregar items a un Spike", exception2.getMessage());
    }
}
