package org.unrn.tp4.ejer2;

public class Tarea implements Item {
    private double horas;

    public Tarea(double horas) {
        this.horas = horas;
    }

    @Override
    public double getTotalHoras() {
        return horas;
    }

    @Override
    public void addItem(Item item) {
        throw new UnsupportedOperationException("No se pueden agregar items a una tarea.");
    }
}
