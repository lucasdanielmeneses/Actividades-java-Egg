/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de 
 * esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un 
 * mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
 * imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio4guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase; //creamos la variable frase como cadena
        Scanner leer = new Scanner(System.in); // creamos el scanner
        System.out.println("Ingrese la frase, si comienza con A, sera correcto"); //pedimos la frase
        frase = leer.nextLine(); // guardamos lo que ingresamos en frase 
        if ("A".equals(frase.substring(0, 1))) { //condicional del equal en la primer letra usando substring
             System.out.println("frase correcta ! ");
       } else { // sino 
            System.out.println("frase incorrecta");
        }
    }
    
}
