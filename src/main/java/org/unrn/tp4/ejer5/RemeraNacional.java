package org.unrn.tp4.ejer5;

public class RemeraNacional extends CalculadorPrecio {
    @Override
    protected double aplicarRecargosEImpuestos(double precio) {
        return precio * 1.015;
    }

    @Override
    protected double aplicarBonificaciones(double precio) {
        return precio * 0.80;
    }

    @Override
    protected double aplicarMargenComercial(double precio) {
        return precio * 1.15;
    }
}
