/*
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
 * (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay 
 * en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio
 * en el paquete Servicios con los siguiente:
 * Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
 * Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula 
 * la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar 
 * la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse 
 * llenado en cuanto quedó la taza.
 * Método vaciarCafetera(): pone la cantidad de café actual en cero. 
 * Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la 
 * cafetera la cantidad de café indicada.
 *
 */
package main;

import entidades.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicio;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera cafetera1 = cs.constriurCafetera();
        
        do {
         System.out.println("--------- Sistema de Cafetera ----------");
            System.out.println("Actualmente con: "+cafetera1.getCantidadActual()+" mls de cafe.");
        System.out.println("1. Llenar Cafetera. ");
        System.out.println("2. Servir taza.");
        System.out.println("3. Vaciar Cafetera.");
        System.out.println("4. Agregar Cafe.");
        System.out.println("5. Salir");
        System.out.println("----------------------------------------");
        opc = leer.nextInt();
        switch (opc){
            case 1:
                cs.llenarCafetera(cafetera1);
                break;
            case 2:
                cs.servirTaza(cafetera1);
                break;
            case 3:
                cs.vaciarCafetera(cafetera1);
                break;
            case 4:
                cs.agregarCafe(cafetera1);
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Debe ingresar una opcion valida... ");
        }   
        } while (opc!=5);
        
        
        
    }
    
}
