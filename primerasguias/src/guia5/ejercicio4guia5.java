/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
 * La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;

import java.util.Random;

/**
 *
 * @author Lucas
 */
public class ejercicio4guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random numRam = new Random(); // pedimos la utilidad Random para generar numeros aleatorios (hay que importarla)
        int [][] vector= new int [4][4]; //creamos la matriz de 4x4
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                vector [i][j]= numRam.nextInt(9);
                System.out.print("["+vector [i][j]+"]"); //hacemos un for doble para recorrer la matriz e imprimirla en pantalla.
            }
            System.out.println("");
            
        }
        System.out.println("");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("["+vector [i][j]+"]"); //invertimos el for para mostrar la matriz de manera traspuesta. 
            }
            System.out.println("");
            
        }
        
    }
    
}
