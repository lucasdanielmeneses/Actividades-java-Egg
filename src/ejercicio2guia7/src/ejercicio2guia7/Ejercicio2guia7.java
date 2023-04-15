/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A 
 * continuación, se deben crear los siguientes métodos:
 * Método constructor que inicialice el radio pasado como parámetro.
 * Métodos get y set para el atributo radio de la clase Circunferencia.
 * Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
 * Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
 * Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 *
 */
package ejercicio2guia7;

import Entidades.Circunferencia;

/**
 *
 * @author Lucas
 */
public class Ejercicio2guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circunf1 = new Circunferencia();
        circunf1.crearCircunferencia();
        circunf1.Area();
        circunf1.Perimetro();;
    }
    
}
