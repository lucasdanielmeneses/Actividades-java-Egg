/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package servicios;

import entidades.Pais;
import java.util.HashSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Lucas
 */
public class ServicioPais {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public TreeSet<Pais> crearListaPaises(){
        TreeSet<Pais> listaPais=new TreeSet();
        boolean cond;
        do {
        System.out.println("Ingrese el nombre del pais, por favor:");
        Pais p1 = new Pais();
        p1.setNombre(leer.next());
        listaPais.add(p1);
        cond= this.comprobacionSalir();
        } while (!cond);
        
        
        
        return listaPais;
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
    public void mostrarListaPaises(TreeSet<Pais> list){
        HashSet<Pais> listaux = new HashSet(list);
        listaux.forEach((aux) -> {
            System.out.println(aux);
        });
  
    }
     public void ordenTitulo(TreeSet<Pais> list){
         System.out.println("................ORDENANDO LOS PAISES.......");
         
         list.forEach((nombre) -> {
             System.out.println(nombre);
        });
    }   
     public void eliminarPais(TreeSet<Pais> list) {
        System.out.println("Ingrese el pais que desea eliminar");
        String pais = leer.next();
        Iterator<Pais> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(pais)) {
                it.remove();
                System.out.println("Eliminado");
            } else{
                System.out.println("El pais no se encuentra en la lista. ");
            }
        }
  }
}

