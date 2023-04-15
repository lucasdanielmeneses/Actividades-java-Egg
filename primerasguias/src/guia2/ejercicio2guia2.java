/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio2guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Hola, por favor escribe tu nombre");//poniendo sout+(tab) atajo : ESCRIBIR DE PSEINT
        nombre = leer.nextLine();//llenamos la variable nombre con lo que se escriba en la linea completa en el Scanner leer
        System.out.println("Bueno, te llamas "+ nombre + " y estas aprendiendo JAVA"); // sacamos otro sout concatenando. 
    }
    
}
