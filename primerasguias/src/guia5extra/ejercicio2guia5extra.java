/*
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá 
 * detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package guia5extra;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio2guia5extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean condigual=false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores por favor: "); //pedimos el tamaño del vector 1 
        int numvec = leer.nextInt();
        int[] vector1 = new int[numvec];
        for (int i = 0; i < numvec; i++) { //este for recorre el vector 1 para que le carguemos los datos manualmente
            System.out.println("Ingrese el elemento para el vector 1 en [" + i + "]");
            vector1[i] = leer.nextInt();
        }
        System.out.println("Los valores Ingresados en el vector 1 son: "); // los mostramos en pantalla
        System.out.println("");
        for (int i = 0; i < numvec; i++) {
            System.out.print("[" + vector1[i] + "]");
        }
        System.out.println("");
        System.out.println("");
        int[] vector2 = new int[numvec];
        for (int i = 0; i < numvec; i++) { //este for recorre el vector 1 para que le carguemos los datos manualmente
            System.out.println(" Ahora Ingrese el elemento para el vector 2 en [" + i + "]");
            vector2[i] = leer.nextInt();
        }
        System.out.println("Los valores Ingresados en el vector 2 son: "); // los mostramos en pantalla
        System.out.println("");
        for (int i = 0; i < numvec; i++) {
            System.out.print("[" + vector2[i] + "]");
        }
        System.out.println("Comparando si los elementos son iguales...");
        System.out.println("");
       
         for (int i = 0; i < numvec; i++) { 
            System.out.println(" Comparando el elemento [" + i + "] de ambos vectores: [" + vector1[i] + "](vector 1) y [" + vector2[i] + "](vector 2)");
            if (vector1[i]==vector2[i]) {
                System.out.println("Este elemento es igual.. seguimos! ");
                condigual=false;
            } else {
                System.out.println("El elemento no coincide, cerrando programa... ");
                condigual=false;
                break;
            }
        }   
        
        System.out.println("Gracias por utilizar este programa. ");
        
    }
}
