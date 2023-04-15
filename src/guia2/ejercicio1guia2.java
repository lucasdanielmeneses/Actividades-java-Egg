/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma
 */
public class ejercicio1guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3; // creamos las variables enteras
        Scanner leernum = new Scanner(System.in); //creamos el scanner
        System.out.print("Ingrese los dos numeros a sumar, por favor"); //pedimos los numeros sout+tab
        num1 = leernum.nextInt(); //cargamos num1
        num2 = leernum.nextInt(); //cargamos num2
        num3 = num1 + num2; //los sumamos
        System.out.println("El valor de la suma de los numeros ingresados es " + num3);//mostramos en pantalla
                
    }
    
}
