package org.unrn.tp4;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoConSubordinados implements Empleado {
    protected String nombre;
    protected double salario;
    protected List<Empleado> empleados;

    public EmpleadoConSubordinados(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.empleados = new ArrayList<>();
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void addEmpleadoACargo(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public void removeEmpleadoACargo(Empleado empleado) {
        empleados.remove(empleado);
    }

    @Override
    public List<Empleado> getEmpleadoACargo() {
        return empleados;
    }

    @Override
    public double getTotalSalario() {
        double total = getSalario();
        for (Empleado empleado : empleados) {
            total += empleado.getTotalSalario();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }
}
