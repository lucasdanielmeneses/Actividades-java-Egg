/*
 *  Escribir un programa que pida una frase y la muestre toda en mayúsculas
 *  y después toda en minúsculas. 
 */
package guia2;

import java.util.Scanner; // importamos scanner
import static jdk.nashorn.internal.objects.NativeString.toLowerCase; //importamos para dejar todo en minusculas (esto se hace igual que el scanner)
import static jdk.nashorn.internal.objects.NativeString.toUpperCase; // importamos para dejar todo en mayuscula(esto se hace igual que el scanner)

/**
 *
 * @author Lucas
 */
public class ejercicio3guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              String frase; // creamos la variable frase
              Scanner leer = new Scanner(System.in); //creamos el scanner
              System.out.println("Ingrese la frase para convertir en mayuscula y minusculas !:"); //pedimos la frase
              frase = leer.nextLine(); //la guardamos, linea completa
             System.out.println(toUpperCase(frase)); // pedimos un sout(tab) que adentro tenga esa clase y que despues la dejamos importada 
             System.out.println(toLowerCase(frase)); // pedimos un sout(tab) que adentro tenga esa clase y que despues la dejamos importada
             
              
    
    }
    
}
