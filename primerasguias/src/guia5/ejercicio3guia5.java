/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, 
 * etcétera (hasta 5 dígitos).
 */
package guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio3guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        Random Aletorio = new Random();
        
        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = Aletorio.nextInt(99999);
            System.out.println(vector[i]);
        }
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        for (int i = 0; i < N; i++) {
            String numero = Integer.toString(vector[i]);
            int digitos = numero.length();
            if (digitos == 1) {
                uno++;
            } else if (digitos == 2) {
                dos++;
            } else if (digitos == 3) {
                tres++;
            } else if (digitos == 4) {
                cuatro++;
            } else if (digitos == 5) {
                cinco++;                
            System.out.println(" - " + vector[i] + " - ");
            }
        }
        System.out.println("Números de 1 dígito:  " + uno);
        System.out.println("Números de 2 dígitos: " + dos);
        System.out.println("Números de 3 dígitos: " + tres);
        System.out.println("Números de 4 dígitos: " + cuatro);
        System.out.println("Números de 5 dígitos: " + cinco);
    }

}