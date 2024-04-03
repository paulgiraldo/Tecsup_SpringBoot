package org.example;

import java.util.ArrayList;

public class Gerente extends Empleado {

    protected ArrayList<String> equipo = new ArrayList<>();

    public Gerente() {
    }

    public Gerente(Integer id, String nombre, String departamento, Double salario, ArrayList<String> equipo) {
        super(id, nombre, departamento, salario);
        this.equipo = equipo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("==================================");
        System.out.println("   Categoría: GERENTE");
        System.out.println("          Id: "+id);
        System.out.println("      Nombre: "+nombre);
        System.out.println("Departamento: "+departamento);
        System.out.println("      Equipo: "+equipo);
        System.out.println("     Salario: "+salario);
    }

    @Override
    public Double calcularBono(String resultadoEvaluacion) {
        double bono = 0.20 * salario * equipo.size();
        if (resultadoEvaluacion=="Malo"){
            bono = 0.00;
        } else if (resultadoEvaluacion=="Regular") {
            bono = bono * 0.50;
        }
        return bono;
    }

    @Override
    public String evaluarDesempeno() {
        // como no se tiene un proceso definido para retornar este valor, se realizará en forma aleatoria
        int valAleatorio = (int)(Math.random()*100);
        String respuesta = "Bueno";
        if (valAleatorio<=50){
            respuesta = "Regular";
        }
        return respuesta;
    }

}
