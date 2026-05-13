package org.unrn.tp4.ejer2;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private List<HistoriaUsuario> hus;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.hus = new ArrayList<>();
    }

    public void addHu(HistoriaUsuario hus) {
        this.hus.add(hus);
    }

    public double horasParaCompletar() {
        double total = 0;
        for (Item hu : hus) {
            total += hu.getTotalHoras();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }
}
