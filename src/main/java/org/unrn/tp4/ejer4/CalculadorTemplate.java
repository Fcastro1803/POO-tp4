package org.unrn.tp4.ejer4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class CalculadorTemplate implements Calculador {
    protected LogTransaction log;
    protected int mesEnPromocion;

    public CalculadorTemplate(LogTransaction log) {
        this.log = log;
        this.mesEnPromocion = 5; // Mes de promoción por defecto (Mayo)
    }

    @Override
    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        boolean isInPromotion = of(mesEnPromocion).equals(now().getMonth());
        double iva = precioProducto * getIvaRate(isInPromotion);
        precioTotal += iva;
        log.log(getClass().getName());
        return precioTotal;
    }

    protected abstract double getIvaRate(boolean isInPromotion);
}
