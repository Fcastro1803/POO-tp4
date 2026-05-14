package org.unrn.tp4.ejer4;

public class Main {
    public static void main(String[] args) {
        LogTransaction log = new LogTransaction();
        Calculador calculadorJubilado = new CalculadorJubilado(log);
        Calculador calculadorNoJubilado = new CalculadorNoJubilado(log);
        double precioProducto = 100.0;
        System.out.println("Precio para jubilado: " + calculadorJubilado.calcularPrecio(precioProducto));
        System.out.println("Precio para no jubilado: " + calculadorNoJubilado.calcularPrecio(precioProducto));
    }
}