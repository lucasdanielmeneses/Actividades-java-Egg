/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
 * Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
 * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Lenght() en Java.
 */
package guia3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.length;

/**
 *
 * @author Lucas
 */
public class ejercicio3guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase; //creamos la variable frase como cadena
        Scanner leer = new Scanner(System.in); // creamos el scanner
        System.out.println("Ingrese la frase, debe tener solo 8 letras"); //pedimos la frase
        frase = leer.nextLine(); // guardamos lo que ingresamos en frase 
        if ( frase.length()== 8) { //condicional si la long de frase es igual a 8... (hay que importar la utilidad)
             System.out.println("la longitud es correcta ! ");
        } else { // sino 
            System.out.println("La longitud es incorrecta");
        }
    }

    
}
