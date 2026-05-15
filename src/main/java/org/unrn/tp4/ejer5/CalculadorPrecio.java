package org.unrn.tp4.ejer5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class CalculadorPrecio {

    public final double calcularPrecioFinal(double precioUnitario) {
        double acumulado = precioUnitario;
        acumulado = aplicarRecargosEImpuestos(acumulado);
        acumulado = aplicarBonificaciones(acumulado);
        acumulado = aplicarMargenComercial(acumulado);
        BigDecimal bd = new BigDecimal(acumulado);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    protected abstract double aplicarRecargosEImpuestos(double precio);
    protected abstract double aplicarBonificaciones(double precio);
    protected abstract double aplicarMargenComercial(double precio);
}
