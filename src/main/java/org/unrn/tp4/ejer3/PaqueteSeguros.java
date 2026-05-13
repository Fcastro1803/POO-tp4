package org.unrn.tp4.ejer3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguros extends Seguro {
    private final List<Seguro> componentes;

    public PaqueteSeguros() {
        this.componentes = new ArrayList<>();
    }

    public void addComponentes(Seguro seguro) {
        this.componentes.add(seguro);
    }

    public void quitarComponentes(Seguro seguro) {
        this.componentes.remove(seguro);
    }

    @Override
    public double calcularCosto() {
        double sumaCostosBase = 0;
        for (Seguro seguro : componentes) {
            sumaCostosBase += seguro.calcularCosto();
        }
        int cantidadSeguros = contarSeguros();
        double descuento = cantidadSeguros * 0.05;
        if (descuento > 1.0) descuento = 1.0;

        return sumaCostosBase * (1 - descuento);
    }

    @Override
    public int contarSeguros() {
        int contador = 0;
        for (Seguro seguro : componentes) {
            contador += seguro.contarSeguros();
        }
        return contador;
    }
}
