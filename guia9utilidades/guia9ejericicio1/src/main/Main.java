/*
 * Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y 
 * su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor 
 * con frase como atributo debe setear la longitud de la frase de manera automática. Crear una clase CadenaServicio 
 * en el paquete servicios que implemente los siguientes métodos:
 * 
 * *Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
 *
 * *Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: 
 * "casa blanca", Salida: "acnalb asac".
 *
 * *Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces
 * se repite el carácter en la frase, por ejemplo:
 * Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
 *
 * *Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra 
 * nueva frase ingresada por el usuario.
 *
 * Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase 
 * ingresada por el usuario y mostrar la frase resultante.
 *
 * Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún 
 * otro carácter seleccionado por el usuario y mostrar la frase resultante.
 * 
 * Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve
 * verdadero si la contiene y falso si no.*
 *
 */
package main;

import entidades.Cadena;
import java.util.Scanner;
import servicios.CadenaServicio;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CadenaServicio cs = new CadenaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("----------------------------------------------------------------");
        System.out.println("paso 1, crear el objeto cadena:");
        Cadena cad1 = cs.crearCadena();
        System.out.println("----------------------------------------------------------------");
        System.out.println("paso 2, contar la cantidad de vocales:");
        cs.mostrarVocales(cad1);
        System.out.println("----------------------------------------------------------------");
        System.out.println("paso 3, invertir la frase! ");
        cs.invertirFrase(cad1);
        System.out.println("----------------------------------------------------------------");
        System.out.println("paso 4, contar la letra ingresada:");
        System.out.println("Ingrese el caracter que desea contar cuantas veces se repite:");
        String letra1=leer.nextLine();
        cs.vecesRepetido(cad1, letra1);
        System.out.println("----------------------------------------------------------------");
        System.out.println("paso 5, Comparar la frase del objeto con una ingresada por el usuario:");
        System.out.println("Ingrese la frase para compararla con el objeto frase creado previamente: ");
        String frase1 = leer.nextLine();
        cs.compararLongitud(cad1,frase1);
        System.out.println("----------------------------------------------------------------");
        System.out.println("paso 6, Unir la frase del objeto con una ingresada por el usuario:");
        System.out.println("Ingrese la frase para unirla con el objeto frase creado previamente: ");
        String frase2 = leer.nextLine();
        cs.unirFrases(cad1,frase2);
        System.out.println("----------------------------------------------------------------");
        System.out.println("paso 7, Reemplazar la letra 'a' del objeto con una ingresada por el usuario:");
        System.out.println("Ingrese la letra para reemplazarla en el objeto frase creado previamente: ");
        String letra2 = leer.nextLine();
        cs.reemplazar(cad1, letra2);
        System.out.println("----------------------------------------------------------------");
        System.out.println("paso 8, Comprobar si la frase contiene una letra ingresada por el usuario (retorna booleano):");
        System.out.println("Ingrese la letra para ver si esta en la frase : ");
        letra2 = leer.nextLine();
        System.out.println("Resultado del metodo ("+cs.contiene(cad1, letra2)+").");
        
        
        
        
        
        
    }
}
