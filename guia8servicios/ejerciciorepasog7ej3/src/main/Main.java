/*
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, 
*se deben crear los siguientes métodos:
*Método constructor con todos los atributos pasados por parámetro.
*Método constructor sin los atributos pasados por parámetro.
*Métodos get y set.
*Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
*Método sumar(): calcular la suma de los números y devolver el resultado al main.
*Método restar(): calcular la resta de los números y devolver el resultado al main
*Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el 
resultado al main
*Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y 
se devuelve el resultado al main.

 */
package main;

import entidades.Operacion;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Operacion op1 = new Operacion(); // en este objeto que creamos en entidades, los atributos para n1 =5 y para n2 =4
       Operacion op2 = new Operacion();
       op2.crearOperacion();
       op1.setNumero1(0);
       op1.setNumero2(4);
        System.out.println("el valor ingresado en numero 1 de op1 es: "+op1.getNumero1());
       op1.sumar();
       op2.sumar();
       op1.restar();
       op2.restar();
       
       op1.multiplicar();
       op1.dividir();
       op2.multiplicar();
       op2.dividir();
    }
    
}
