/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */
package guia3extra;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio4guia3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num;
        System.out.println("Ingrese el numero a convertir por notacion Romana: ");
        num = leer.nextInt();
        switch(num){
                case 1:
                    System.out.println("El equivalente en Romano es I");
                break;
                case 2:
                    System.out.println("El equivalente en Romano es II");
                break;
                case 3:
                    System.out.println("El equivalente en Romano es III");
                break;
                case 4:
                    System.out.println("El equivalente en Romano es IV");
                break;
                case 5:
                    System.out.println("El equivalente en Romano es V");
                break;
                case 6:
                    System.out.println("El equivalente en Romano es VI");
                break;
                case 7:
                    System.out.println("El equivalente en Romano es VII");
                break;
                case 8:
                    System.out.println("El equivalente en Romano es VIII");
                break;
                case 9:
                    System.out.println("El equivalente en Romano es XI");
                break;
                case 10:
                    System.out.println("El equivalente en Romano es X");
                break;
                default:
                    System.out.println("Debe ingresar una opcion valida");
        }
    }
    
}
