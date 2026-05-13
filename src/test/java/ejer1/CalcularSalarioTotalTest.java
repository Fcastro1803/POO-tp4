package ejer1;

import org.junit.jupiter.api.Test;
import org.unrn.tp4.ejer1.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcularSalarioTotalTest {
    @Test
    public void CalcularSalarioTest() {
        // Crear empleados regulares
        EmpleadoRegular emp1 = new EmpleadoRegular("Juan Pérez", 3000);
        EmpleadoRegular emp2 = new EmpleadoRegular("María García", 3200);
        EmpleadoRegular emp3 = new EmpleadoRegular("Carlos López", 3100);
        EmpleadoRegular emp4 = new EmpleadoRegular("Ana Martínez", 3300);
        EmpleadoRegular emp5 = new EmpleadoRegular("Luis Rodríguez", 2900);
        EmpleadoRegular emp6 = new EmpleadoRegular("Elena Torres", 3050);

        LiderProyecto lider1 = new LiderProyecto("Pedro Sánchez", 4500);
        LiderProyecto lider2 = new LiderProyecto("Laura Fernández", 4600);

        lider1.addEmpleadoACargo(emp1);
        lider1.addEmpleadoACargo(emp2);
        lider1.addEmpleadoACargo(emp3);
        lider2.addEmpleadoACargo(emp4);
        lider2.addEmpleadoACargo(emp5);
        lider2.addEmpleadoACargo(emp6);

        MandoMedio mando1 = new MandoMedio("Roberto Díaz", 6000);
        MandoMedio mando2 = new MandoMedio("Sofía Torres", 6200);

        mando1.addEmpleadoACargo(lider1);
        mando1.addEmpleadoACargo(lider2);

        Gerente gerente1 = new Gerente("Miguel Ángel", 8500);
        Gerente gerente2 = new Gerente("Isabel Romero", 8700);

        gerente1.addEmpleadoACargo(mando1);
        gerente2.addEmpleadoACargo(mando2);

        Director director1 = new Director("Javier Mendoza", 12000);
        Director director2 = new Director("Carmen Vega", 12500);

        director1.addEmpleadoACargo(gerente1);
        director2.addEmpleadoACargo(gerente2);

        assertEquals(81550.0, director1.getTotalSalario() + director2.getTotalSalario());
    }
}
