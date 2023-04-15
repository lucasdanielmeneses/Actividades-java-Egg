/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 
 * elementos por lado se deberá dibujar lo siguiente:
 *  * * * *
 *  *     *
 *  *     *
 *  * * * *

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio8guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int punto=0;
        System.out.println("Ingrese la cantidad de elementos para dibujar el cuadrado: ");
        punto = leer.nextInt();
        
        for (int x = 0; x < punto; x++) { //para x que comienza en 0 hasta punto con paso +1
            for (int y = 0; y < punto; y++) { //para y que comienza en 0 hasta punto con paso +1
                if (x==0 || x==punto-1 || y==0 || y==punto-1) { //marcara un asterisco siempre en cuanto estemos en los bordes del cuadrado
                   /*
                    *Son dos for anidados que hacen el barrido como el que usabamos en matrices:
                    *teniendo el valor de la cantidad de asteriscos (en este caso es la varible punto)
                    *tenemos el limite y lo que van a hacer los for pasar y si se cumple algunas de las condiciones
                    *del if en la linea 31, escribira un asterisco, caso contrario no. 
                    */ 
                    System.out.print("*"); // no se usa System.out.println() por que da salto de linea
                }else{
                    System.out.print(" "); //solo usamos System.out.print()
                }
            }
            System.out.println(); // Aca le metemos este sout, para que haga el salto de linea una vez recorrido cada renglon edl cuadrado. 
        } 
        
    }
    
}
