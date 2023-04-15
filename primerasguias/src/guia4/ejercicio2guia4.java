/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;
public class ejercicio2guia4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      int edad;
      String validacion;
      int c=1; // contador arranca en 1 para la primer persona
      String nombre;
      do {
          System.out.println("cargue el nombre de la persona "+c);
          nombre=sc.next();
          System.out.println("cargue la edad de la persona "+c);
          edad=sc.nextInt();
          mayorEdad(nombre, edad); //se llama al subprograma.
          System.out.println("desea cargar mas personas?  S/N");
          validacion= sc.next();
          c++; // aca suma el contador para la persona siguiente
      }while(validacion.equalsIgnoreCase("s"));
    }
    public static void mayorEdad(String nombre, int edad){ // subprograma que compara la edad, si es mayor de 17 , te tira un sout
        if (edad>17){
            System.out.println(nombre+" tiene "+edad+" es mayor de edad ");
        }else { // sino 
            System.out.println(nombre+" tiene "+edad+" no es mayor de edad ");
        }
    }
}