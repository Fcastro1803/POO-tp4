package org.unrn.tp4.ejer5;

public class RemeraImportada extends CalculadorPrecio {
    @Override
    protected double aplicarRecargosEImpuestos(double precio) {
        return precio * 1.08;
    }

    @Override
    protected double aplicarBonificaciones(double precio) {
        return precio;
    }

    @Override
    protected double aplicarMargenComercial(double precio) {
        return precio * 1.25;
    }
}