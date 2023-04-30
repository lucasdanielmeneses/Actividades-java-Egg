/*
 * Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
 * fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
 * fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package servicio;

import entidades.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ServicioFraccion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Fraccion crearFraccion(){
        Fraccion objetoFraccion = new Fraccion();
        System.out.println("Fraccion 1:");
        System.out.println("Ingrese el denominador de la fraccion 1:");
        objetoFraccion.setDenf1(leer.nextDouble());
        System.out.println("Ingrese el numerador de la fraccion 1:");
        objetoFraccion.setNumf1(leer.nextDouble());
        System.out.println("Fraccion 2:");
        System.out.println("Ingrese el denominador de la fraccion 2:");
        objetoFraccion.setDenf2(leer.nextDouble());
        System.out.println("Ingrese el numerador de la fraccion 2:");
        objetoFraccion.setNumf2(leer.nextDouble());
        return objetoFraccion;
        
    }
    
    public void sumarFraccion(Fraccion objetoFraccion){
        double denominadorComun;
        double sumaCruzada1;
        double sumaCruzada2;
        denominadorComun=objetoFraccion.getDenf1()*objetoFraccion.getDenf1();
        sumaCruzada1=objetoFraccion.getNumf1()*objetoFraccion.getDenf2();
        sumaCruzada2=objetoFraccion.getDenf1()*objetoFraccion.getNumf2();
        System.out.println("El resultado de la suma de la Fraccion es:");
        System.out.println(sumaCruzada1+sumaCruzada2);
        System.out.println("--");
        System.out.println(denominadorComun);
    }
}
