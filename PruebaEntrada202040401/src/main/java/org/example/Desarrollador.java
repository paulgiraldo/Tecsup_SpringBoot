package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Desarrollador extends Empleado {

    protected ArrayList<String> lenguajes = new ArrayList<>();

    public Desarrollador() {
    }

    public Desarrollador(Integer id, String nombre, String departamento, Double salario, ArrayList<String> lenguajes) {
        super(id, nombre, departamento, salario);
        this.lenguajes = lenguajes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("==================================");
        System.out.println("   Categoría: DESARROLLADOR");
        System.out.println("          Id: "+id);
        System.out.println("      Nombre: "+nombre);
        System.out.println("Departamento: "+departamento);
        System.out.println("   Lenguajes: "+lenguajes);
        System.out.println("     Salario: "+salario);
    }

    @Override
    public Double calcularBono(String resultadoEvaluacion) {
        double bono = 0.10 * salario * lenguajes.size();
        if (resultadoEvaluacion=="Malo"){
            bono = 0.00;
        } else if (resultadoEvaluacion=="Regular") {
            bono = bono * 0.50;
        }
        return bono;
    }

}
