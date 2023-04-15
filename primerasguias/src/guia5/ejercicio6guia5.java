/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
 * sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado 
 * y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son 
 * correctos, es decir, están entre el 1 y el 9.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio6guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                do {
                    System.out.println("Ingrese el valor de la matriz en [" + i + "][" + j + "]...(Debe ser entre 1 y 9)");
                    num = leer.nextInt();
                    if (num > 9 || num < 1) {
                        System.out.println("Debe ingresar un valor entre 0 y 9...");

                    } else {
                        System.out.println("Valor correcto ingresado (" + num + ")");

                        matriz[i][j] = num;
                    }
                } while (num > 9 || num < 0);
            }
        }

        System.out.println("");
        System.out.println("Usted armo la siguiente matriz: ");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Analizando si el mismo es magico...");
        if (magic(matriz)==true) {
            System.out.println("La matriz es magica !! ");
        } else {
            System.out.println("La matriz no es magica... ");
        }

    }

    public static boolean magic(int[][] matriz) {
        boolean comp=true;
        int compf0 = 0, compf1 = 0, compf2 = 0, compd1 = 0, compd2 = 0, compc0 = 0, compc1 = 0, compc2 = 0;

        for (int i = 0; i < 3; i++) { //las filas van de arriba hacia abajo
            for (int j = 0; j < 3; j++) { //las columnas de izq a derecha
                if (i == j) { //primero vamos a analizar la diagonal principal...
                    compd1 = compd1 + matriz[i][j];  //vamos sumando esta diagonal y la guardamos en compd1 (comparador diagonal 1)
                }
            }
        }
        System.out.println("Resultado de la suma diagonal principal: "+compd1);
        for (int i = 0; i < 3; i++) { //las filas van de arriba hacia abajo
            for (int j = 0; j < 3; j++) { //las columnas de derecha a izquierda
                if ((j==2 && i==0)||(j==1 && i==1) ||(j==0&&i==2) ) { //primero vamos a analizar la diagonal secundaria...
                    compd2 = compd2 + matriz[i][j];  //vamos sumando esta diagonal y la guardamos en compd2 (comparador diagonal 2)
                }
            }
        }
        System.out.println("Resultado de la suma diagonal secunaria: "+compd2);
        for (int j = 0; j < 3; j++) { //este for suma la primer fila... (0)
            compf0 = compf0 + matriz[0][j];
        }
        System.out.println("Resultado de la suma fila 0 : "+compf0);
        for (int j = 0; j < 3; j++) { //este for suma la segunda fila... (1)
            compf1 = compf1 + matriz[1][j];
        }
        System.out.println("Resultado de la suma fila 1 : "+compf1);
        for (int j = 0; j < 3; j++) { //este for suma la tercer fila... (2)
            compf2 = compf2 + matriz[2][j];
        }
        System.out.println("Resultado de la suma fila 2 : "+compf2);
        for (int i = 0; i < 3; i++) { //este for suma la primer columna... (0)
            compc0 = compc0 + matriz[i][0];
        }
        System.out.println("Resultado de la suma columna 0 : "+compc0);
        for (int i = 0; i < 3; i++) { //este for suma la segunda columna... (1)
            compc1 = compc1 + matriz[i][1];
        }
        System.out.println("Resultado de la suma columna 1 : "+compc1);
        for (int i = 0; i < 3; i++) { //este for suma la tercer columna... (2)
            compc2 = compc2 + matriz[i][2];
        }
        System.out.println("Resultado de la suma columna 2 : "+compc2); // este if compara que todos los valores sean iguales y por lo tanto, sea una matriz magica
        if (compd1 == compd2 && compd2 == compf0 && compf0 == compf1 && compf1 == compf2 && compf2 == compc0 && compc0 == compc1 && compc1 == compc2) {
            

        } else {
            comp = false; // si no pasa que sean iguales, le asignamos false al return para que el subprograma nos indique que no es magica
        }
        return comp;
    }

} //El metodo es muy rudimentario, analizar con otros compañeros para obtener un resultado mas pulido.
