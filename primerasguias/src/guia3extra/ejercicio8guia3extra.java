/*
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener 
 * la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad 
 * de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
 * Nota: recordar el uso de la sentencia break.
 *
 */
package guia3extra;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio8guia3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int leidos = 0, pares = 0, impares = 0, num = 0, aux = 0;
        Scanner leer = new Scanner(System.in);

        do {
            do {
                System.out.println("Ingrese numero: (Solo numeros positivos, o se repetira el proceso...");
                num = leer.nextInt();
                aux = num % 2;
                switch (aux) {
                    case 0:
                        leidos++;
                        pares++;
                        break;
                    case 1:
                        leidos++;
                        impares++;
                        break;
                }
            } while (num <= 0);

        } while (num % 5 != 0);

        System.out.println("La cantidad de numeros totales leidos es de: " + leidos);
        System.out.println("La cantidad de numeros pares es de: " + pares);
        System.out.println("La cantidad de numeros impares es de: " + impares);

    }

}
