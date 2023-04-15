/*
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
 * dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su 
 * respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario 
 * ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función
 * Math.random() de Java.
 *
 */
package guia3extra;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio10guia3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean cond=false;
        do {
        System.out.println("Ese programa genera dos numeros aleatorios y los multiplica. Adivina el resultado...");
        System.out.println("Su resultado: ");
        int numingr = leer.nextInt();
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int resu = num1*num2;if (numingr==resu) {
            System.out.println("Su numero elegido es: "+numingr);
            System.out.println("Los numeros generados aleatoriamente son: "+num1+" y "+num2+".");
            System.out.println("El resultado de la multiplicacion es: "+resu);
            System.out.println("Felicidades, acerto la respuesta! ");
            cond=true;
        }else{
            System.out.println("Su numero elegido es: "+numingr);
            System.out.println("Los numeros generados aleatoriamente son: "+num1+" y "+num2+".");
            System.out.println("El resultado de la multiplicacion es: "+resu);
            System.out.println("Respuesta incorrecta! Volviendo al principio... ");
            cond=false;   
        }
        } while (cond==false);
        
        
        
    }
    
}
