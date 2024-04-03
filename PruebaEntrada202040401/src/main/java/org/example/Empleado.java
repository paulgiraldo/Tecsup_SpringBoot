package org.example;

import lombok.Getter;
import lombok.Setter;

import java.sql.SQLOutput;
@Setter
@Getter
public abstract class Empleado implements EvaluacionDesempeno {
    protected Integer id;
    protected String nombre;
    protected String departamento;
    protected Double salario;

    public Empleado() {
    }

    public Empleado(Integer id, String nombre, String departamento, Double salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("==================================");
        System.out.println("   Categoría: EMPLEADO");
        System.out.println("          Id: "+id);
        System.out.println("      Nombre: "+nombre);
        System.out.println("Departamento: "+departamento);
        System.out.println("     Salario: "+salario);
    }


    public abstract Double calcularBono(String resultadoEvaluacion);

    @Override
    public String evaluarDesempeno() {
        // como no se tiene un proceso definido para retornar este valor, se realizará en forma aleatoria
        int valAleatorio = (int)(Math.random()*100);
        String respuesta = "Regular";
        if (valAleatorio<=33){
            respuesta = "Malo";
        } else if (valAleatorio>=67) {
            respuesta = "Bueno";
        }
        return respuesta;
    }

}
