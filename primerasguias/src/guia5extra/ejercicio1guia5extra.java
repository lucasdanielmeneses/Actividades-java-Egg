/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
 * con los valores ingresados por el usuario.
 */
package guia5extra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio1guia5extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int auxsum=0; //usado para albergar la suma de los elementos
        boolean condopc=true; //usado de bandera para cerrar el programa segun termine la opcion elegida
        Scanner leer = new Scanner(System.in);
        Random numRam = new Random();
        System.out.println("Ingrese el tamaño del vector por favor: "); //pedimos el tamaño
        int numvec = leer.nextInt();
        int [] vector = new int [numvec]; //creamos el vector de acuerdo a lo pedido
        do {
        
        
        
        System.out.println("Que desea hacer?");
        System.out.println("1. Ingresar los elementos manualmente.");
        System.out.println("2. Ingresarlos automaticamente.(del 0 al 99)");
        System.out.println("3. Salir");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                for (int i = 0; i < numvec; i++) { //este for recorre el vector para que le carguemos los datos manualmente
                    System.out.println("Ingrese el elemento para el vector en ["+i+"]");
                    vector[i]= leer.nextInt();
                }
                System.out.println("Los valores Ingresados en el vector son: "); // los mostramos en pantalla
                System.out.println("");
                for (int i = 0; i < numvec; i++) {
                    System.out.print("["+vector[i]+"]");
                }
                System.out.println("");
               for (int i = 0; i < numvec; i++) { //hacemos la suma
                    auxsum=auxsum+vector[i];
                }
                System.out.println("La suma de todos los elementos del vector cargado a mano es: "+auxsum); //mostramos el resultado de la suma
                condopc=false;
                break;
            case 2:
                System.out.println("Ingresando los datos de manera automatica... (del 0 al 99)");
                for (int i = 0; i < numvec; i++) {
                    vector[i]= numRam.nextInt(99); //generamos aleatoriamente los elementos del vector
                }
                System.out.println("Los valores cargados automaticamente en el vector son: "); // los mostramos en pantalla
                System.out.println("");
                for (int i = 0; i < numvec; i++) {
                    System.out.print("["+vector[i]+"]");
                }
                System.out.println("");
               for (int i = 0; i < numvec; i++) {
                    auxsum=auxsum+vector[i]; // los sumamos
                }
                System.out.println("La suma de todos los elementos del vector cargado automaticamente es: "+auxsum);
                condopc=false;
                break;
            case 3:
                System.out.println("Gracias por no usar el programa :P");
                condopc=false;
                break;
            default:
                System.out.println("Debe ingresar una opcion correcta (1,2 o 3).");
                condopc=true;
                break;
        }
        } while (condopc); //notese que cada case, termina en false para cerrar el programa, salvo el default que pide un dato correcto y repite el bucle
    }
    
}
