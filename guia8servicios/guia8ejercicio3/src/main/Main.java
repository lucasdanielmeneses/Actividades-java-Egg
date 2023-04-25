/*
 * Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad, 
 * sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, 
 * puede hacerlo. Agregar constructores, getters y setters.
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
 * Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le 
 * asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea 
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 *
 * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula 
 * da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función 
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está
 * en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 
 * significa que la persona tiene sobrepeso, y la función devuelve un 1.
 * A continuación, en la clase main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada 
 * objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal 
 * e indicar para cada objeto si la persona es mayor de edad.
 * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
 * para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso 
 * ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. 
 * Para esto, podemos crear unos métodos adicionales.
 *
 */
package main;

import entidades.Persona;
import servicios.PersonaServicio;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona[] vectorPersona = new Persona [4];
        int[] vectorImc = new int[4];
        boolean[] vectorEdad = new boolean[4];
        PersonaServicio ps = new PersonaServicio();

        for (int i = 0; i < 4; i++) {
            System.out.println("-----------PERSONA-------------"+(i+1));
            vectorPersona[i]=ps.crearPersona();
        }
        
        for (int i = 0; i < 4; i++) {
        System.out.println("ES MAYOR DE EDAD " + vectorPersona[i].getNombre() + " ?");
        System.out.println(ps.esMayorDeEdad(vectorPersona[i]));
        vectorEdad[i]=ps.esMayorDeEdad(vectorPersona[i]);
        }
        
        for (int i = 0; i < 4; i++) {
        System.out.println("Resultado de IMC para " + vectorPersona[i].getNombre() + " (-1 bajo de peso / 0 valores normales / 1 sobrepeso) ");
        System.out.println(ps.calcularIMC(vectorPersona[i]));
        vectorImc[i] = ps.calcularIMC(vectorPersona[i]);
        }

        int contadorEdadMayor = 0;
        int contadorEdadMenor = 0;
        int contadorIMCbajo = 0;
        int contadorIMCnormal = 0;
        int contadorIMCalto = 0;
        for (int i = 0; i < 4; i++) {

            if (vectorEdad[i]) {
                contadorEdadMayor++;
            } else {
                contadorEdadMenor++;
            }
        }
        System.out.println("Porcentaje de personas mayores de edad: " + (((double)contadorEdadMayor / 4) * 100) + " % (" + contadorEdadMayor + " Personas.");
        System.out.println("Porcentaje de personas menores de edad: " + (((double)contadorEdadMenor / 4) * 100) + " % (" + contadorEdadMenor + " Personas.");

        for (int i = 0; i < 4; i++) {
            if (vectorImc[i] == -1) {
                contadorIMCbajo++;
            } else if (vectorImc[i] == 0) {
                contadorIMCnormal++;
            } else {
                contadorIMCalto++;
            }

        }
        System.out.println("Porcentaje de personas con IMC BAJO: " + (((double)contadorIMCbajo / 4) * 100) + " % (" + contadorIMCbajo + " Personas.");
        System.out.println("Porcentaje de personas con IMC NORMAL: " + (((double)contadorIMCnormal / 4) * 100) + " % (" + contadorIMCnormal + " Personas.");
        System.out.println("Porcentaje de personas con IMC ALTO: " + (((double)contadorIMCalto / 4) * 100) + " % (" + contadorIMCalto + " Personas.");

    }
}
