package org.unrn.tp4.ejer1;

import java.util.List;

interface Empleado {
    double getSalario();

    void addEmpleadoACargo(Empleado empleado);

    void removeEmpleadoACargo(Empleado empleado);

    List<Empleado> getEmpleadoACargo();

    double getTotalSalario();
}
