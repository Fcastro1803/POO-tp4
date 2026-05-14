package org.unrn.tp4.ejer4;

public class CalculadorJubilado extends CalculadorTemplate {
    public CalculadorJubilado(LogTransaction log) {
        super(log);
    }

    @Override
    protected double getIvaRate(boolean isInPromotion) {
        return isInPromotion ? 0 : 0.1;
    }
}
