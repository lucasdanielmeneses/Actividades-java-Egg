/*
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
 * que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
 * 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que será 
 * seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene 
 * los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla 
 * la sopa de letras creada.
 * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
 * funciones de Java substring(), Length() y Math.random().
 */
package guia5extra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio6guia5extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        Random numRam = new Random();
        String palabra="";
        String  palabras [] = new String [5]; //este vector va a albergar las palabras
        String  matriz [][]= new String [20][20]; //matriz generada
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz [i][j]= Integer.toString(numRam.nextInt(9)); //Aca llenamos la matriz con numeros aleatorios
                //System.out.print("["+matriz[i][j]+"]");
            }
           // System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            do {
        System.out.println("Por favor, ingrese la palabra: (Entre 3 y cinco caracteres): PALABRA NUM "+(i+1)+" )");
        palabra = leer.nextLine();
        if (palabra.length()>=3 && palabra.length()<=5) {
            palabras[i]=palabra;
            
        }else{
            System.out.println("Debe ingresar una palabra entre 3 y 5 caracteres.");
        }  
        } while (palabra.length()<3 || palabra.length()>=6); //Ingreso de palabra en el vector palabra, siempre en cuanto se cumpla la condicion
        }
        
        for (int i = 0; i < 5; i++) {
            palabras [i] = palabra;
           
           // for (int j = 0; j < 20; j++) {
           //     for (int k = 0; k < 20; k++) {
           //         matriz[j][k]= //aca tengo que buscar la forma de asignar letra x letra la palabra, de manera aleatoria... 
           //     }
           // } sacar comentarios para trabajar aca.. 
        }
        
        
        
    }
    
}
