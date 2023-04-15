/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo
 * lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo 
 * de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final 
 * de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
 * Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio7guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String ingresos="";
        int correctos=0;
        int incorrectos=0;
        
        System.out.println("Bienvenidos al simulador RS232 ! Ingrese cadenas con 5 caracteres comenzando por X y terminando con O.");
        do {
                ingresos=leer.nextLine();  // pedimos la frase
                ingresos=ingresos.toUpperCase(); // la pasamos a mayuscula
                System.out.println("Usted ingreso: "+ingresos); //mostramos en pantalla
                if (ingresos.length()==5 && !"&&&&&".equals(ingresos)) { // si la longitud es igual a 5 y distinta de &&&&&, entonces...
                System.out.println("Usted ingreso una cadena con la cantidad de numeros requeridos");
                if ((ingresos.substring(0, 1)).equals("X") && (ingresos.substring(4, 5)).equals("O") ) { //si la primer letra es X y la ultima es O
                    System.out.println("cadena correcta.. sumando...");
                    correctos++; //sumamos uno al contador correctos
                }else{ //Si no cumple la funcion del condicional XyO, entonces... 
                    System.out.println("cadena incorrecta.. sumando...");
                   incorrectos++;  // Sumamos uno al contador de incorrecto.
                }
                   
            }else if(!"&&&&&".equals(ingresos)){ // este else viene de la linea 34. Si no tiene 5 caracteres exactos y ademas no es la secuencia &&&&& para cerrar
                System.out.println("Usted no ingreso la cantidad de caracteres requeridos, esta secuencia no se sumara... "); // muestra que no son los carcteres requeridos...
            }
        } while (!"&&&&&".equals(ingresos)); //este while sigue mientras ingresos sea distinto a &&&&&
        System.out.println("Usted finalizo el muestreo de cadenas, arrojando el siguiente resultado: "); //mostramos el resultado por pantalla
        System.out.println("Ingresos CORRECTOS: "+correctos);
        System.out.println("Ingresos INCORRECTOS: "+incorrectos);
    }
    
}
