/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class PerroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        Perro perroMet = new Perro();
        System.out.println("Ingrese el tipo de raza:");
        perroMet.setRaza(leer.nextLine());
        System.out.println("Ingrese el nombre del perro:");
        perroMet.setNombre(leer.nextLine());
        return perroMet;
    }

    public ArrayList cargarPerros() {
        ArrayList<Perro> listaPerros;
        listaPerros = new ArrayList();
        int bucle1 = 0;
        do {

            Perro perroCP = this.crearPerro();
            listaPerros.add(perroCP);
            do {
            System.out.println("Desea Salir? (S/N)");
            String resp = leer.nextLine();
            if (resp.equalsIgnoreCase("S")) {
                System.out.println("---------------Lista de perros agregados-----------");
                listaPerros.forEach((aux) -> {
                    System.out.println(" - " + aux.getRaza() + " - " + aux.getNombre());
                });
                bucle1 = 100;
            } else if (resp.equalsIgnoreCase("N")) {
                bucle1 = 0;
            } else {
                System.out.println("Debe ingresar una opcion valida. (S/N).... volviendo.....");
                bucle1=50;
            }
    
            } while (bucle1==50);
            
            
        } while (bucle1==0);
        
        System.out.println("Lista de perros terminada con exito !  ");
        return listaPerros;
    }
    
    public void eliminarPerro(){
        
        ArrayList<Perro> listaPerros;
        listaPerros = this.cargarPerros();
        Iterator<Perro> it = listaPerros.iterator();
        System.out.println("Ahora vamos a comparar la lista que se creo para eliminar un perro en caso de que exista una igualdad:");
        System.out.println("Ahora ingrese la raza del mismo: ");
        String razaP=leer.nextLine();
        System.out.println("Ingrese el nombre del perro :");
        String nombreP=leer.nextLine();
        Perro p1= new Perro(razaP, nombreP);
        System.out.println("Comparando para ver si hay coincidencias y posterior borrado del objeto... ");
        while (it.hasNext()){
            if (p1.getRaza().equals(it.next().getRaza())) {
                it.remove();
                System.out.println("Se ENCONTRARON COINCIDENCIAS, OBJETO/S ELIMINADO/S...");
                 System.out.println("---------------Lista de perros ordenada-----------");
                listaPerros.forEach((aux) -> {
                    System.out.println("Nombre: " + aux.getNombre() + ", RAZA: " + aux.getRaza());
                });
            } else{
                System.out.println("No se encontraron coincidencias, mostrando la lista ordenada.... ");
                System.out.println("---------------Lista de perros ordenada-----------");
                listaPerros.forEach((aux) -> {
                    System.out.println("Nombre: " + aux.getNombre() + ", RAZA: " + aux.getRaza());
                });
            }
        }
        
    }
    
}
