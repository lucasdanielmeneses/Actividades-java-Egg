/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es 
 * antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica 
 * si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas 
 * (o viceversa).
 */
package guia5;

import java.util.Random;

/**
 *
 * @author Lucas
 */
public class ejercicio5guia5 {

    /**
     * @param args the command line arguments
     */
    //vamos a usar el ejemplo de la guia para comprobar...
    //pero la idea es generar dos vectores A y B y compararlos
    public static void main(String[] args) {
        Random numRam = new Random();
        int[][] vectorA = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] vectorB = {{0, 2, -4}, {-2, 0, -2}, {3, 2, 0}};
        System.out.println("Imprimimos VECTOR A ...");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + vectorA[i][j] + "]"); //primero mostramos la matriz que tenemos
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Imprimimos el vector B ...(que tiene los valores del vector A, pero acomodado de manera traspuesta... ");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vectorB[i][j] = vectorA[j][i];
                System.out.print("[" + vectorB[i][j] + "]"); //asignamos los valores de la matriz A en B ya traspuestos y los mostramos en pantalla
            }
            System.out.println("");
        }
        boolean comparador = comp(vectorA, vectorB);
        if (comparador) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz No es antisimetrica");
        }
    }

    public static boolean comp(int[][] vectorA, int[][]  vectorB) {
        boolean comp = false;
        int compf=0, compd=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) { //por definicion, la diagonal de una matriz antisimetrica siempre debe ser cero. 
                    if (vectorA[i][j] == 0) {
                       compd=compd;
                    } else {
                       compd++;
                    }
                }
                if (i != j) {
                    if (vectorA[i][j] == -(vectorB[i][j]))   {
                        compf=compf;
                    } else {
                        compf++;
                    }
                }

            }
        }
        if (compf==0 && compd==0) {
            comp=true;
        }else{
            comp=false;
        }

        return comp;
    }

}
