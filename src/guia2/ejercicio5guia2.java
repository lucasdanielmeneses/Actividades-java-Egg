/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla 
 * el doble, el triple y la raíz cuadrada de ese número.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 *  
 */
public class ejercicio5guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, resu; //creamos las variables enteras 
        double resuraiz; //creamos la variable de tipo real (double=real en pseint)
        Scanner leer = new Scanner(System.in); //hacemos el scanner para tomar los datos
        
        System.out.println("Ingrese el numeo a trabajar;");
        num = leer.nextInt();//el next tiene que albergar enteros, por eso es leer.nextInt
        resu = num * 2; // hacemos el doble
        System.out.println("El doble del numero ingresado es: "+ resu);
        resu = num * 3; // ahora el triple
          System.out.println("El triple del numero ingresado es: "+ resu);
    resuraiz = Math.sqrt(num); //la variable resuraiz SE OBTIENE usando este recurso
        System.out.println("La raiz del numero ingresado es: "+ resuraiz);
    }
    
}
