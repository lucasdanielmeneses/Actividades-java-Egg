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
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class PersonaServicio {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona pers = new Persona();
        boolean condp;
        System.out.println("-------Creador de personas ------");
        System.out.println("Ingrese el nombre de la persona: ");
        pers.setNombre(leer.next());
        System.out.println("Ingrese la edad de " + pers.getNombre());
        pers.setEdad(leer.nextInt());
        do {
            System.out.println("Ingrese sexo (H para Hombre, M para Mujer, O para otro)");
            pers.setSexo(leer.next());
            if (pers.getSexo().equalsIgnoreCase("H") || pers.getSexo().equalsIgnoreCase("M") || pers.getSexo().equalsIgnoreCase("O")) {
                System.out.println("Dato de sexo cargado correctamente...(" + pers.getSexo() + ").");
                condp=false;
            } else {
                System.out.println("Debe cargar un valor valido (H=Hombre, M=Mujer, O=Otro).");
                condp=true;
            }
        } while (condp);
        System.out.println("Indique el peso de :" + pers.getNombre()+" (KGs.)");
        pers.setPeso(leer.nextDouble());
        System.out.println("Y por ultimo la altura: (Mts.)");
        pers.setAltura(leer.nextDouble());
        System.out.println("----------------------------------------------------------");
        System.out.println("Perfecto, la persona ya fue creada con todos sus atributos:");
        System.out.println("Nombre: " + pers.getNombre());
        System.out.println("Edad: " + pers.getEdad());
        System.out.println("Sexo: " + pers.getSexo());
        System.out.println("Peso: " + pers.getPeso());
        System.out.println("Altura: " + pers.getAltura());
        System.out.println("-----------------------------------------------------------");
        return pers;
    }

    public boolean esMayorDeEdad(Persona pers) {
        boolean cond;
        cond = pers.getEdad() >= 18;
        return cond;
    }
    
    public int calcularIMC(Persona pers){
        double imc;
        int result;
        //System.out.println("-------Calculador de IMC----------");
        imc = pers.getPeso()/(pers.getAltura()*pers.getAltura());
        //System.out.println("Para la persona: "+pers.getNombre()+" el IMC da como resultado: "+ imc);
        if (imc < 20 ) {
          //  System.out.println("El valor de IMC esta por debajo de lo normal");
            result=-1;
        }else if ((imc >= 20) && (imc <= 25) ) {
            //System.out.println("El valor de IMC esta dentro de los parametros normales.");
            result=0;
        }else{
           // System.out.println("El valor de IMC esta por encima de lo normal (sobrepeso)");
            result=1;
        }
        return result;
    }
    
    

}
