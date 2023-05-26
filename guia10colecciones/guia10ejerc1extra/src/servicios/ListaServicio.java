/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package servicios;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Lucas
 */
public class ListaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
public ArrayList<Integer> crearLista(){
    int aux;
    ArrayList<Integer> lista= new ArrayList();
    do {
        System.out.println("Ingrese un numero para la lista (si ingresa -99 se cortara la peticion)");
    aux=leer.nextInt();
        if (aux != -99) {
           lista.add(aux); 
        } else {
            System.out.println("Saliendo...");
        }
    } while (aux != -99);
    return lista;
    }
public void mostrarLista(ArrayList<Integer> lista){
     for (Integer numero : lista) {
            System.out.println(numero);
        }
}
public void sumarLista(ArrayList<Integer> lista){
    int sumatoria=0;
    for (int numero : lista) {
            sumatoria += numero;
        }
    System.out.println("La suma de todos los numeros de la lista es:"+sumatoria);
}
public void promedioLista(ArrayList<Integer> lista){
    int sumatoria=0;
    int contador=0;
    for (int numero : lista) {
            sumatoria += numero;
            contador++;
        }
    double resultado=(double)sumatoria/(double)contador;
    System.out.println("El promedio de la lista es: "+(resultado));
}

  
    
}
