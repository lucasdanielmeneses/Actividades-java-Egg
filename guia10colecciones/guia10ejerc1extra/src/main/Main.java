/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package main;


import java.util.ArrayList;
import servicios.ListaServicio;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ListaServicio ls=new ListaServicio();
      ArrayList<Integer> listaMain=ls.crearLista();
      ls.mostrarLista(listaMain);
      ls.sumarLista(listaMain);
      ls.promedioLista(listaMain);
      
    }
    
}
