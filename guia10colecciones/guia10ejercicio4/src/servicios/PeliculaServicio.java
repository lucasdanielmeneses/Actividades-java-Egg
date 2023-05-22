/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicios;

import entidades.Pelicula;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {
        Pelicula peli = new Pelicula();
        System.out.println("Ingrese el nombre de la pelicula, por favor:");
        peli.setTitulo(leer.next());
        System.out.println("Ahora ingrese el nombre del director de esta pelicula:");
        peli.setDirector(leer.next());
        System.out.println("Ahora indique la cantidad de horas de duracion:");
        int horas = leer.nextInt();
        // peli.setDuracion(Duration.ofHours(leer.nextInt()));
        System.out.println("Por ultimo, indique la cantidad de minutos:");
        int min = leer.nextInt();
        peli.setDuracion(Duration.ofHours(horas).plusMinutes(min));
        return peli;
    }

    public ArrayList<Pelicula> crearListaPelicula(ArrayList<Pelicula> list) {
        boolean salir;
        do {
            list.add(crearPelicula());
            salir = comprobacionSalir();
        } while (!salir);

        return list;
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

    public void mostrarPeliculas(ArrayList<Pelicula> list) {

        list.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    public void peliculas1hora(ArrayList<Pelicula> list) {
        Duration durAux=Duration.ofHours(1);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Mostrando la lista de peliculas con una duracion mayor a una hora...");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pelicula auxPeli = (Pelicula) it.next();
            if (auxPeli.getDuracion().getSeconds() >= durAux.getSeconds()) {
                System.out.println(auxPeli);
            }
        }
        System.out.println("---------------------------------------------------------------------");
    }
    
    public void ordenDurMeaMa(ArrayList<Pelicula> list){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Mostrando la lista de peliculas ORDENADAS POR TIEMPO (MENOR A MAYOR)");
                Collections.sort(list, Comparator.comparing(Pelicula::getDuracion));
                list.forEach((aux) -> {
            System.out.println(aux);
        });
                System.out.println("---------------------------------------------------------------------");
    }
    
    public void ordenDurMaaMe(ArrayList<Pelicula> list){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Mostrando la lista de peliculas ORDENADAS POR TIEMPO  (MAYOR A MENOR) ");
                Collections.sort(list, Comparator.comparing(Pelicula::getDuracion).reversed());
                list.forEach((aux) -> {
            System.out.println(aux);
        });
                System.out.println("---------------------------------------------------------------------");
    }
     public void ordenTitulo(ArrayList<Pelicula> list){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Mostrando la lista de peliculas ORDENADAS POR TITULO ");
                Collections.sort(list, Comparator.comparing(Pelicula::getTitulo));
                list.forEach((aux) -> {
            System.out.println(aux);
        });
                System.out.println("---------------------------------------------------------------------");
    }
    
     public void ordenDirector(ArrayList<Pelicula> list){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Mostrando la lista de peliculas ORDENADAS POR DIRECTOR ");
                Collections.sort(list, Comparator.comparing(Pelicula::getDirector));
                list.forEach((aux) -> {
            System.out.println(aux);
        });
                System.out.println("---------------------------------------------------------------------");
    }
}
