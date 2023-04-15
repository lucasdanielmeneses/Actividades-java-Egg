/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente 
 * en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 * 
 */
public class ejercicio4guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int F, C; // creamos las variables enteras
        Scanner leer = new Scanner(System.in); //el scanner para pedir los datos
        System.out.println("Ingrese el valor de grados CENTIGRADOS;");
        C = leer.nextInt(); //aca pedimos C
        F = 32 + (9 * C/5); // hacemos la formula...
        System.out.println("El equivalente en grados Farenheit es: "+ F); // la mostramos
        
    }
    
}
