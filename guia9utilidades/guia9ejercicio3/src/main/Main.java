/*
* Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
* Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
* -Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
* -Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
* -Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
* -Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 
* 10 posiciones del arreglo B con 0.5.
* En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
*/
package main;

import entidades.Arreglo;
import servicios.ArregloServicios;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Arreglo ar = new Arreglo();
        System.out.println("ya estan creados los arreglos, aplicamos los metodos: ");
    ArregloServicios arrServ = new ArregloServicios();
        System.out.println("Inicializamos A...");
    arrServ.inicializarA(ar);
        System.out.println("Inicializamos B...");
    arrServ.inicializarB(ar);
        System.out.println("Mostramos A ! ");
    arrServ.mostrarA(ar);
    System.out.println("Ordenamos A ! ");
    arrServ.ordenar(ar);
        System.out.println("Mostramos B ! ");
    arrServ.mostrarB(ar);
    }
    
}
