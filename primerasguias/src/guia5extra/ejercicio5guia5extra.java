/*
 * Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios 
 * y muestre la suma de sus elementos.
 */
package guia5extra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio5guia5extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        Random ran= new Random();
      int n;
      int m;
      int suma=0;
        System.out.println("digite las filas de la matriz");
        n= sc.nextInt();
        System.out.println("digite las columnas de la matriz");
        m= sc.nextInt();
      int matriz[][]=new int[n][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= ran.nextInt(10);
                suma+=matriz[i][j]; //suma+ acumula los resultados en la misma variable.
            }
        }
          for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        System.out.println("la suma de tolos los valores de la matriz es: "+suma);
    }
} //Ale y ARI
