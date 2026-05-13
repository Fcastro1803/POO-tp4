package org.unrn.tp4.ejer2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaUsuario implements Item {
    protected List<Item> items;

    public HistoriaUsuario() {
        this.items = new ArrayList<>();
    }

    @Override
    public double getTotalHoras() {
        double total = 0;
        for (Item item : items) {
            total += item.getTotalHoras();
        }
        return total;
    }

    @Override
    public void addItem(Item item) {
        this.items.add(item);
    }
}
