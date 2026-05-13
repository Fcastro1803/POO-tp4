package org.unrn.tp4.ejer2;

import java.util.ArrayList;
import java.util.List;

public class Proyecto implements Item {
    private String nombre;
    private List<Item> hus;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.hus = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double getTotalHoras() {
        double total = 0;
        for (Item hu : hus) {
            total += hu.getTotalHoras();
        }
        return total;
    }

    @Override
    public void addItem(Item item) {
        this.hus.add(item);
    }
}
