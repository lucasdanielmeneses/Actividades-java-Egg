/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número 
 * a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio2guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random numRam = new Random();
        System.out.println("Ingrese el tamaño del vector: ");
        int tam = leer.nextInt();
        int[] vector = new int[tam];
        for (int i = 0; i < tam; i++) {
            vector[i] = numRam.nextInt(9);
            System.out.println("[" + vector[i] + "]");
        }
        System.out.println("Ahora ingrese un numero a buscar dentro del vector: ");
        int numBusc = leer.nextInt();
        int contf = 0;
        int cont = 0;
        for (int i = 0; i < tam; i++) {
            cont++;
            if (vector[i] == numBusc) {
                contf=cont;
            }
        }
        if (cont!=0) {
            System.out.println("El numero se repite, encontrandose en "+ contf);
        }else{  
            System.out.println("El numero no se encuentra dentro del vector.");
        }
    }

}
