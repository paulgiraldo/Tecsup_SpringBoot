package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[5];

        // Llenando al empleado 01
        ArrayList<String> lenguajes1 = new ArrayList<>();
        lenguajes1.add("Java");
        lenguajes1.add("Phyton");
        lenguajes1.add("C++");
        empleados[0] = new Desarrollador(1,"Juan Garcia","TI Desarrollo",2500.00,lenguajes1);

        // Llenando al empleado 02
        ArrayList<String> equipo2 = new ArrayList<>();
        equipo2.add("Maria");
        equipo2.add("Juana");
        equipo2.add("Sofia");
        empleados[1] = new Gerente(2,"Mario Valencia","Gerente Comercial",7000.00,equipo2);

        // Llenando al empleado 03
        ArrayList<String> lenguajes3 = new ArrayList<>();
        lenguajes3.add("Java Script");
        lenguajes3.add("PHP");
        empleados[2] = new Desarrollador(3,"Lorena Guerra","TI Desarrollo",3500.00,lenguajes3);

        // Llenando al empleado 04
        ArrayList<String> equipo4 = new ArrayList<>();
        equipo4.add("Maria");
        equipo4.add("Juana");
        equipo4.add("Mariano");
        equipo4.add("Peter");
        equipo4.add("Ediogenes");
        empleados[3] = new Gerente(4,"Jorge Tejada","Gerente Finanzas",9000.00,equipo4);

        // Llenando al empleado 05
        ArrayList<String> lenguajes5 = new ArrayList<>();
        lenguajes5.add("Cobol");
        lenguajes5.add("PowerBuilder");
        lenguajes5.add("Abap");
        lenguajes5.add("HTML");
        empleados[4] = new Desarrollador(5,"Pablo Perez","TI Desarrollo",3000.00,lenguajes5);

        String empleDesempeno = "";
        double empleBono = 0.00;
        for (Empleado emple : empleados){
            emple.mostrarDetalles();
            empleDesempeno = emple.evaluarDesempeno();
            empleBono = emple.calcularBono(empleDesempeno);
            System.out.println("------- Bono ---------");
            System.out.println("   Desempeño: "+empleDesempeno);
            System.out.println("Importe Bono: "+empleBono);
        }


    }
}