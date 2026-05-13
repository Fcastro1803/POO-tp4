package org.unrn.tp4.ejer3;

public class SeguroIndividual extends Seguro {
    private String name;
    private double costoBase;

    public SeguroIndividual(String name, double costo) {
        this.name = name;
        this.costoBase = costo;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calcularCosto() {
        return costoBase;
    }

    public double getCostoBase() {
        return costoBase;
    }

    @Override
    public int contarSeguros() {
        return 1;
    }
}
