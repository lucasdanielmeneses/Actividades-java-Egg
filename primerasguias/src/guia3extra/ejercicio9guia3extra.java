/*
 * Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
 * Por ejemplo: 50 / 13:
 * 50 – 13 = 37     una resta realizada
 * 37 – 13 = 24     dos restas realizadas
 * 24 – 13 = 11     tres restas realizadas
 * dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 * ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 *
 */
package guia3extra;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio9guia3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resu=0, resto;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero a Dividir: ");
        int num=leer.nextInt();
        System.out.println("Ingrese el numero divisor: ");
        int div=leer.nextInt();
        
        do {
           resto=num-div;
           resu++;
           num=resto;
        } while (div<=resto);
        System.out.println("El resultado de la division es: "+ resu+ " y el resto es: "+ resto);
    }
    
}
