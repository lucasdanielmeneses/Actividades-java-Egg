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
package main;

import entidades.Pais;

import java.util.Scanner;
import java.util.TreeSet;
import servicios.ServicioPais;

/**
 *
 * @author Lucas
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       int opcion=0;
        ServicioPais sp = new ServicioPais();
        TreeSet<Pais> listaPais = new TreeSet();
        while (opcion != 5) {
            System.out.println("------------------MENU DE PAISES---------------------");
            System.out.println("1. - Agregar paises a la lista.");
            System.out.println("2. - Mostrar la lista de paises en pantalla.");
            System.out.println("3. - Ordenar la lista de paises por orden alfabetico.");
            System.out.println("4. - Eliminar un pais de la lista.");
            System.out.println("5. - Salir del programa.");
            System.out.println("------------------------------------------------------");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    listaPais=sp.crearListaPaises();
                    break;
                case 2:
                    sp.mostrarListaPaises(listaPais);
                    break;
                case 3:
                   sp.ordenTitulo(listaPais);
                    break;
                case 4:
                    sp.eliminarPais(listaPais);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            }
        }
        leer.close();
    }
}
