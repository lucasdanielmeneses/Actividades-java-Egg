/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author Lucas
 */
public class ejercicio1guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int vector[]=new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i]=i+1;
        }
        for (int i =99; i > -1 ; i--) {
            System.out.println("["+vector[i]+"]");
        }
    }
}