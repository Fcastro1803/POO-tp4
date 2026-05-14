package org.unrn.tp4.ejer4;

public class CalculadorNoJubilado extends CalculadorTemplate {
    public CalculadorNoJubilado(LogTransaction log) {
        super(log);
    }

    @Override
    protected double getIvaRate(boolean isInPromotion) {
        return isInPromotion ? 0.15 : 0.21;
    }
}