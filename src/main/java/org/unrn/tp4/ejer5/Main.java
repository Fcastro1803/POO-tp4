package org.unrn.tp4.ejer5;

public class Main {
    public static void main(String[] args) {
        CalculadorPrecio remeraNacional = new RemeraNacional();
        CalculadorPrecio remeraImportada = new RemeraImportada();

        double precioUnitario = 100.0;

        System.out.println("Precio final remera nacional: " + remeraNacional.calcularPrecioFinal(precioUnitario));
        System.out.println("Precio final remera importada: " + remeraImportada.calcularPrecioFinal(precioUnitario));
    }
}
