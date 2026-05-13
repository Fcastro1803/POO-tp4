package org.unrn.tp4.ejer1;

public class Main {
    static void main() {
        // Crear empleados regulares
        EmpleadoRegular emp1 = new EmpleadoRegular("Juan Pérez", 3000);
        EmpleadoRegular emp2 = new EmpleadoRegular("María García", 3200);
        EmpleadoRegular emp3 = new EmpleadoRegular("Carlos López", 3100);
        EmpleadoRegular emp4 = new EmpleadoRegular("Ana Martínez", 3300);
        EmpleadoRegular emp5 = new EmpleadoRegular("Luis Rodríguez", 2900);
        EmpleadoRegular emp6 = new EmpleadoRegular("Elena Torres", 3050);
        EmpleadoRegular emp7 = new EmpleadoRegular("Roberto Díaz", 3150);

        // Crear líderes de proyecto
        LiderProyecto lider1 = new LiderProyecto("Pedro Sánchez", 4500);
        LiderProyecto lider2 = new LiderProyecto("Laura Fernández", 4600);
        LiderProyecto lider3 = new LiderProyecto("Carlos Méndez", 4400);

        // Agregar empleados regulares a los líderes de proyecto
        lider1.addEmpleadoACargo(emp1);
        lider1.addEmpleadoACargo(emp2);
        lider2.addEmpleadoACargo(emp3);
        lider2.addEmpleadoACargo(emp4);
        lider3.addEmpleadoACargo(emp5);
        lider3.addEmpleadoACargo(emp6);
        lider3.addEmpleadoACargo(emp7);

        // Crear mandos medios
        MandoMedio mando1 = new MandoMedio("Roberto Díaz", 6000);
        MandoMedio mando2 = new MandoMedio("Sofía Torres", 6200);

        // Agregar líderes de proyecto a los mandos medios
        mando1.addEmpleadoACargo(lider1);
        mando1.addEmpleadoACargo(lider2);
        mando2.addEmpleadoACargo(lider3);

        // Crear gerentes
        Gerente gerente1 = new Gerente("Miguel Ángel", 8500);
        Gerente gerente2 = new Gerente("Isabel Romero", 8700);

        // Agregar mandos medios a los gerentes
        gerente1.addEmpleadoACargo(mando1);
        gerente2.addEmpleadoACargo(mando2);

        // Crear directores
        Director director1 = new Director("Javier Mendoza", 12000);
        Director director2 = new Director("Carmen Vega", 12500);

        // Agregar gerentes a los directores
        director1.addEmpleadoACargo(gerente1);
        director2.addEmpleadoACargo(gerente2);

        // Calcular salario total de la empresa
        double salarioTotal = director1.getTotalSalario() + director2.getTotalSalario();

        System.out.println("=== ESTRUCTURA SALARIAL DE EMPRESA LASER X ===");
        System.out.println("\nDirector 1: " + director1.getNombre());
        System.out.println("Salario total bajo " + director1.getNombre() + ": $" + director1.getTotalSalario());

        System.out.println("\nDirector 2: " + director2.getNombre());
        System.out.println("Salario total bajo " + director2.getNombre() + ": $" + director2.getTotalSalario());

        System.out.println("\n=== SALARIO TOTAL DE LA EMPRESA: $" + salarioTotal + " ===");
    }
}
