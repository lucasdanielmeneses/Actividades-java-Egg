/*
* Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la
* palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
* Definir los siguientes métodos en AhorcadoService:
* Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone 
* la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, 
* quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el 
* valor que ingresó el usuario.
* Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.
* length.
* Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de 
* la palabra o no. También informará si la letra estaba o no.
* Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido 
* encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra 
* no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
* Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
* Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará 
* cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
* Un ejemplo de salida puede ser así:
* Ingrese una letra:
* a
* Longitud de la palabra: 6
* Mensaje: La letra pertenece a la palabra
* Número de letras (encontradas, faltantes): (3,4)
* Número de oportunidades restantes: 4
* ----------------------------------------------
*
*/
package servicios;


import entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class AhorcadoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public Ahorcado crearJuego(){
    Ahorcado juego = new Ahorcado();
    System.out.println("Ingrese la palabra secreta del Ahorcado:");
    juego.setPalabraIngresada(leer.nextLine());
    System.out.println("Ingrese la cantidad de intentos para el juego:");
    juego.setCantidadIntentos(leer.nextInt());
    juego.setLetrasEncontradas(0);
    juego.setNoEncontradas(0);
    juego.setPalabra(juego.getPalabraIngresada().toCharArray());
    Arrays.sort(juego.getPalabra());
    return juego;
}
    
    public int longitud(Ahorcado juego){
        int longitud = juego.getPalabra().length;
        return longitud;
    }
   
    public boolean buscar(Ahorcado juego, String letra){
        boolean encontro=false;
        
        if (new String(juego.getPalabra()).contains(letra)) {
            System.out.println("Letra encontrada ! ("+letra+").");
            encontro=true;
    //juego.setLetrasEncontradas(juego.getLetrasEncontradas()+1);
} else {
    System.out.println("La letra buscada no se encuentra en el Ahorcado... ");
    //juego.setNoEncontradas(juego.getNoEncontradas()+1);
}
        return encontro;
    }
   
    public void encontradas(Ahorcado juego, String letra){
        char[] encontradas= new char[juego.getPalabraIngresada().length()];
        Arrays.fill(encontradas, "-".charAt(0));
        System.out.println(encontradas);
        System.out.println(juego.getPalabra());
    }
}
