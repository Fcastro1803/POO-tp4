package org.unrn.tp4.ejer2;

public class Main {
    public static void main(String[] args) {
        //Creamos proyecto
        Proyecto p1 = new Proyecto("composite");

        //Creamos HU's
        HistoriaUsuario hu1 = new HistoriaUsuario();
        HistoriaUsuario hu2 = new HistoriaUsuario();
        HistoriaUsuario hu3 = new HistoriaUsuario();

        //Creamos tareas
        Tarea t1 = new Tarea(3);
        Spike s1 = new Spike(1);
        Tarea t2 = new Tarea(4);
        Spike s2 = new Spike(2);
        Tarea t3 = new Tarea(5);
        Tarea t4 = new Tarea(6);
        Spike s4 = new Spike(4);

        //Agregamos las tareas a las historias
        hu1.addItem(t1);
        hu1.addItem(s1);
        hu1.addItem(t2);
        hu1.addItem(s2);
        hu2.addItem(t3);
        hu3.addItem(t4);
        hu2.addItem(s4);

        //agregamos las HU's al proyecto
        p1.addItem(hu1);
        p1.addItem(hu2);
        p1.addItem(hu3);
        System.out.println("Al proyecto, " + p1.getNombre() + " necesita: " + p1.getTotalHoras() + " horas");
    }
}
