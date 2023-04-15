/*
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir además dos 
 * constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como parámetros 
 * el título y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
 */
package ejercicio1extraguia7;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ejercicio1extraguia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion musica1 = new Cancion();
        Cancion musica2 =new Cancion("La chica del bikini azul","Luis Miguel");
                System.out.println("El tema que vas a escuchar es: "+ musica2.getTitulo()+ " de "+ musica2.getAutor());
                System.out.println("---");
                System.out.println("Ingrese el autor y el tema de la cancion 1");
                musica1.setAutor(leer.nextLine());
                musica1.setTitulo(leer.nextLine());
                System.out.println("El tema de la cancion 1 es: "+ musica1.getTitulo()+ " de "+ musica1.getAutor());
    }
    
}
