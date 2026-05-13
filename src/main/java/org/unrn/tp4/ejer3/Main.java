package org.unrn.tp4.ejer3;

public class Main {
    public static void main(String[] args) {
        //creamos 3 seguros
        SeguroIndividual auto = new SeguroIndividual("Seguro de Auto", 100);
        SeguroIndividual casa = new SeguroIndividual("Seguro de Hogar", 200);
        SeguroIndividual vida = new SeguroIndividual("Seguro de Hogar", 150);

        //creamos 2 paquetes
        PaqueteSeguros p1 = new PaqueteSeguros();
        PaqueteSeguros p2 = new PaqueteSeguros();

        //agregamos 2 seguros al primer paquete y el otro al segundo paquete
        p1.addComponentes(auto);
        p1.addComponentes(casa);
        p2.addComponentes(vida);
        p2.addComponentes(p1);

        System.out.println("El costo total del paquete 1 es: " + p1.calcularCosto()); //270
        System.out.println("El costo total del paquete 2 es: " + p2.calcularCosto()); //357
        System.out.println("El número total de seguros en el paquete 1 es: " + p1.contarSeguros()); //2
        System.out.println("El número total de seguros en el paquete 2 es: " + p2.contarSeguros()); //3

    }
}
