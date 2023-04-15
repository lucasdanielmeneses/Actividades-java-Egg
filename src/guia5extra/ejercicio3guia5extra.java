/*
 * Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
 * por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package guia5extra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio3guia5extra {

    /**
     * @param args the command line arguments
     */
    
static Random ran=new Random();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("digite el tamaño del vector");
        n=sc.nextInt();
       int vector[]=new int[n];
       cargarVector(vector);
       mostrarVector(vector);
    }
    public static void cargarVector(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= ran.nextInt(100);
        }
    }
public static void mostrarVector(int vector[]){
    for (int i = 0; i < vector.length; i++) {
        System.out.print("["+vector[i]+"]");
    }
}
} // Hecho por Ale y Ari