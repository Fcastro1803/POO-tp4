package org.unrn.tp4.ejer1;

import java.util.ArrayList;
import java.util.List;

// Clase Hoja - Empleado Regular (no tiene subordinados)
public class EmpleadoRegular implements Empleado {
    private String nombre;
    private double salario;

    public EmpleadoRegular(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void addEmpleadoACargo(Empleado empleado) {
        // https://docs.oracle.com/javase/8/docs/api/java/lang/UnsupportedOperationException.html
        throw new UnsupportedOperationException("Los empleados regulares no pueden tener subordinados");
    }

    @Override
    public void removeEmpleadoACargo(Empleado empleado) {
        throw new UnsupportedOperationException("Los empleados regulares no pueden tener subordinados");
    }

    @Override
    public List<Empleado> getEmpleadoACargo() {
        return new ArrayList<>();
    }

    @Override
    public double getTotalSalario() {
        return getSalario();
    }

    public String getNombre() {
        return nombre;
    }
}
