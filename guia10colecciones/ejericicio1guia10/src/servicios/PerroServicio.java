/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class PerroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        Perro perroMet = new Perro();
        System.out.println("Ingrese el nombre del perro:");
        perroMet.setNombre(leer.nextLine());
        System.out.println("Ingrese el tipo de raza:");
        perroMet.setRaza(leer.nextLine());
        return perroMet;
    }

    public void cargarPerros() {
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
                    System.out.println("Nombre: " + aux.getNombre() + ", RAZA: " + aux.getRaza());
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
        
        System.out.println("Gracias por utilizar este programa! ");

    }
}
