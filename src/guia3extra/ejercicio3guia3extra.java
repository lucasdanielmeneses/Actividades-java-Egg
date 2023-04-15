/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
 * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package guia3extra;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio3guia3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letra, opcion;
        Scanner leer = new Scanner(System.in);
        Scanner opcionleer = new Scanner(System.in);
        boolean condsalida = false, salida = false;
        do {
            do {
                System.out.println("Ingrese la letra a analizar, debe ingresar solo un caracter, caso contrario se repetira el pedido. ");
                letra = leer.next();
            } while (letra.length() > 1);
            if ("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra)) {
                System.out.println("La letra ingresada es una vocal ! ");
            } else {
                System.out.println("La letra ingresada NO es una vocal");
            }
            do {
                System.out.println("¿Quiere seguir? S/N");
                opcion = opcionleer.nextLine();
                
                if ("s".equalsIgnoreCase(opcion)) {
                    System.out.println("Volviendo al inicio...");
                    condsalida = true;

                } else if ("n".equalsIgnoreCase(opcion)) {
                    System.out.println("Gracias por usar el programa...");
                    condsalida = true;
                    salida = true;
                    } else {
                    System.out.println("debe ingresar una opcion valida (S/N)...");
                    condsalida = false;
                    }
            } while (condsalida == false);

        } while (salida == false);

    }

}
