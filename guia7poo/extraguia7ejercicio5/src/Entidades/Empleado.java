/*
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado
 * en función de su edad y salario actual. El aumento salarial debe ser del 10% si el 
 * empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcular_aumento() {
        Scanner leern = new Scanner(System.in);
        Scanner leers = new Scanner(System.in);
        Scanner leere = new Scanner(System.in);
        //boolean cond = false;
        do {
            System.out.println("Bienvenido al calculador de salarios: ");
            System.out.println("Ingrese el nombre del empleado: ");
            this.nombre = leern.nextLine();
            System.out.println("Ahora Ingrese la edad del mismo: ");
            this.edad = leere.nextInt();
            System.out.println("Por ultimo, ingrese el salario que percibe}: ");
            this.salario = leers.nextDouble();
            if (this.edad >= 30) {
                this.salario = this.salario * 1.1;
                System.out.println("El salario para el empleado " + this.nombre + " es: " + this.salario);

            } else if (this.edad < 30 && this.edad > 0) {
                this.salario = this.salario * 1.05;
                System.out.println("El salario para el empleado " + this.nombre + " es: " + this.salario);

            } else {
                System.out.println("Usted no ingreso un valor adecuado de edad");
                //cond=true;

            }
        } while (this.edad<0);

    }
}
