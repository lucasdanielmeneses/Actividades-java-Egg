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
package servicios;

import entidades.Cafetera;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera constriurCafetera() {
        Cafetera caf = new Cafetera();
        System.out.println("Este modelo de cafetera admite una capacidad maxima de...(ml)");
        caf.setCapacidadMaxima(leer.nextDouble());
        do {
            System.out.println("Saldra de aqui con una cantidad de cafe de...(ml)");
            caf.setCantidadActual(leer.nextDouble());
            if (caf.getCantidadActual() > caf.getCapacidadMaxima()) {
                System.out.println("La capacidad de ingreso de cafe, excede el limite maximo de la cafetera, coloque un valor correcto. ");
            }
        } while (caf.getCantidadActual() > caf.getCapacidadMaxima());

        return caf;
    }

    public void llenarCafetera(Cafetera caf) {
        System.out.println("----------------------------------");
        System.out.println("La capacidad maxima de esta cafetera es de: " + caf.getCapacidadMaxima() + " mls.");
        System.out.println("Actualmente posee una cantidad de: " + caf.getCantidadActual() + " mls.");
        System.out.println("Llenando la cafetera....");
        caf.setCantidadActual(caf.getCapacidadMaxima());
        System.out.println("Cafetera llena ! (" + caf.getCantidadActual() + " mls.).");
    }

    public void servirTaza(Cafetera caf) {
        double capTaza;
        System.out.println("Podria indicarme la capacidad de la taza ?( mls.)");
        capTaza = leer.nextDouble();
        System.out.println("Primero chequearemos si hay cafe en la Cafetera...");
        if (caf.getCantidadActual() > 0) {
            System.out.println("Hay cafe !");
            System.out.println("Sirviendo taza de cafe...");
            caf.setCantidadActual(caf.getCantidadActual() - capTaza);

            if (caf.getCantidadActual() >= 0) {
                System.out.println("Excelente, la taza pudo llenarse y queda en la cafetera " + caf.getCantidadActual() + " mls de cafe.");
            } else {
                System.out.println("No alcanzo a llenarse la taza, pero la misma posee " + (capTaza + caf.getCantidadActual())+ " mls. de cafe");
                caf.setCantidadActual(0);
            }
        } else {
            System.out.println("No hay cafe :( ");
        }

    }

    public void vaciarCafetera(Cafetera caf) {
        System.out.println("Vaciando la cafetera...");
        caf.setCantidadActual(0);
        System.out.println("Cafetera Vacia !(capacidad alctual: " + caf.getCantidadActual() + " mls.).");

    }

    public void agregarCafe(Cafetera caf) {
        double agregar=0;
        do {
            System.out.println("Actualmente la cafetera posee " + caf.getCantidadActual() + " mls de cafe.");
            System.out.println("Cuanto desea agregar?(mls)");
            agregar = leer.nextDouble();
            if ((agregar + caf.getCantidadActual()) > caf.getCapacidadMaxima()) {
                System.out.println("No se puede agregar esa cantidad de cafe ya que rebalsaria la cafetera. Ingrese un valor menor");
            } else {
                caf.setCantidadActual(caf.getCantidadActual() + agregar);
                System.out.println("Cafe agregado correctamente, capacidad actual de la cafetera: " + caf.getCantidadActual());
            }
        } while (caf.getCapacidadMaxima() < caf.getCantidadActual());
    }
    
    
}
