/*
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
 * El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. Realice 
 * dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package guia3extra;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio7guia3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0, n = 0, max = 0, min = 0, aux = 0, suma = 0, cont = 0;
        double resu = 0;
        boolean cond = false;
        System.out.println("Ingrese el valor de n numero a cargar");
        n = leer.nextInt();
        do {
            System.out.println("Ingrese el numero: ");
            num = leer.nextInt();
            cont++;
            suma = suma + num;
            if (cond == false) {
                min = num;
                max = num;
                cond = true;
            }
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

        } while (cont != n);
        System.out.println("El numero minimo es " + min);
        System.out.println("El numero maximo es " + max);
        resu = (double) suma / n;
        System.out.println("El resultado del promedio es " + resu);

    }

}
