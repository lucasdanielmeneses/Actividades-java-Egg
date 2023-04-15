/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio6guia5extraAle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
        Random rand = new Random();
        int c=0;
        int vector[]=new int[5]; //en este vector saca la fila aleatoria
        int vectorc[]=new int[5];
        String palabras[]=new String[5]; // en este guarda las palabras
        String matriz[][]=new String[20][20]; 
        String palabra;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j]=Integer.toString(rand.nextInt(10));//este for llena la matriz con numeros aleatorios
            }
        }
        for (int i = 0; i < vector.length; i++) {
            vector[i]=rand.nextInt(20); //este for llena el vector con numeros aleatorios
        }
        for (int i = 0; i < vectorc.length; i++) {
            vector[i]=rand.nextInt(15); //este for llena el vector con numeros aleatorios
        }
        for (int i = 0; i < palabras.length; i++) {
                do {
                    System.out.println("cargue un palabra de longitud de 3 a 5 caracteres "+(c+1));
                    palabra=sc.next(); 
                }while(palabra.length()>5 || palabra.length()<3);
                palabras[i]=palabra; //aca pide la palabra y la carga dentro del vector palabra... 
                c++;
        }
        for (int i = 0; i < 5; i++) {
            palabra=palabras[i];
            
            for (int j = 0; j < palabra.length(); j++) {
               
                matriz[vector[i]][j]=palabra.substring(j,j+1);
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    }
}