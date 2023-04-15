/*
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que componen 
 * ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular 
 * la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: recordar que las 
 * variables de tipo entero truncan los números o resultados.
 */
package guia3extra;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio11guia3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont=1;
        int resu, num;
        System.out.println("Ingrese el numero, por favor: ");
        num = leer.nextInt();
        do {
            resu =num/10;
            cont++;
            num=resu;
                    
        } while (resu>10);
        System.out.println("El numero ingresado posee "+cont+" digitos.");
                
    }
    
}
