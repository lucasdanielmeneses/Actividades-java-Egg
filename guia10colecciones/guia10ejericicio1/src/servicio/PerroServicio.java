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
package servicio;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class PerroServicio {
 ArrayList<Perro> lista = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        Perro p1 = new Perro();
        System.out.println("Ingrese la raza del perro:");
        p1.setRaza(leer.next());
        return p1;
    }

    public void crearLista() {
        boolean cond = false;
        do {
            lista.add(this.crearPerro());
            cond = this.comprobacionSalir();
        } while (!cond);

    }

    public boolean comprobacionSalir() {
        boolean cond = false;
        int bucle = 0;
        String resp;
        do {
            System.out.println("Desea continuar? S/N");
            resp = leer.next();
            if ("S".equalsIgnoreCase(resp)) {
                System.out.println("Continuando...");
                cond = false;

            } else if ("N".equalsIgnoreCase(resp)) {
                System.out.println("Saliendo de esta parte... ");
                cond = true;
            } else {
                System.out.println("Debe ingresar un valor valido...");
                bucle = 99;
            }
        } while (bucle == 99);

        return cond;
    }

//    public void mostrarLista() {
//
//        lista.forEach((aux) -> {
//            System.out.println(aux);
//        });
    

    public void eliminarPerro() {
        System.out.println("Ingrese el perro que desea eliminar");
        String perro = leer.next();
        Iterator<Perro> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().getRaza().equals(perro)) {
                it.remove();
                System.out.println("Eliminado");
            }
        }
       // Iterator<Perro> it = lista.iterator();
//        System.out.println("Ingrese la raza del perro a eliminar : ");
//        //String razaelim = leer.next();
//        Perro pcomparacion= new Perro();
//        pcomparacion.setRaza(leer.next());
//        if(lista.contains(pcomparacion)){
//           lista.remove(pcomparacion);
//        }
//        //while (it.hasNext()) {
//           // Perro otroPerro = (Perro)it.next();
//            if (it.next().equals(pcomparacion)) {
//                it.remove();
//               // System.out.println("Se ENCONTRARON COINCIDENCIAS, OBJETO/S ELIMINADO/S...");
//                //System.out.println("---------------Lista de perros ordenada-----------");
//                Collections.sort(lista, (Perro objeto1, Perro objeto2) -> objeto1.getRaza().compareTo(objeto2.getRaza()));
//                lista.forEach((aux) -> {
//                    System.out.println("- " + aux.getRaza() + "- ");
//                });
//                break;
//            } else {
//                //System.out.println("No se encontraron coincidencias, mostrando la lista ordenada.... ");
//                //System.out.println("---------------Lista de perros ordenada-----------");
//                Collections.sort(lista, (Perro objeto1, Perro objeto2) -> objeto1.getRaza().compareTo(objeto2.getRaza()));
//                lista.forEach((aux) -> {
//                    System.out.println("- " + aux.getRaza() + "- ");
//                });
//            }
       // }

     }
    
    public void mostrarLista(){
        for (Perro perro : lista) {
            System.out.println("- " + perro.getRaza() + "- ");
        }
//             
    }
}

