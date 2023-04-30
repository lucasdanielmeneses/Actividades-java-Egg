/*
 * Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
 * fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
 * fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package main;

import entidades.Fraccion;
import servicio.ServicioFraccion;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioFraccion sf = new ServicioFraccion();
   
        Fraccion f1=sf.crearFraccion();
        sf.sumarFraccion(f1);
    }
    
}
