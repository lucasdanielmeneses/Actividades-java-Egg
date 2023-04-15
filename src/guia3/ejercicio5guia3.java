/*
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a 
 *continuación solicite números al usuario hasta que la suma de los 
 *números introducidos supere el límite inicial.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Lucas Meneses
 */
public class ejercicio5guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int lim, nump, numsum; //creamos las variables
        System.out.println("Ingrese el valor del numero limite: ");
        lim = leer.nextInt(); //le asignamos valor al limite
        numsum = 0;
        do { //hacer..
            
            System.out.println("Ahora ingrese numeros que se iran sumando hasta superar el limite: ");
            nump =leer.nextInt(); //empezamos a pedir los numeros que vamos a sumar 
            numsum = numsum + nump; //los valos acumulando... 
            System.out.println("Acumulado: "+numsum);
            //este ciclo se repite...
        } while (lim>=numsum); // mientras que el limite sea mayor o igual a la suma.
        
        System.out.println("Usted supero el limite de "+ lim + " cuando llego al numero "+ numsum);
    }

}
