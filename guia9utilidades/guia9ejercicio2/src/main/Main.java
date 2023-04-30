/*
 * Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán 
 * diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.  En el constructor
 * vacío se usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService, en el paquete 
 * Servicios, que deberá además implementar los siguientes métodos:
 * Método mostrarValores que muestra cuáles son los dos números guardados.
 * Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
 * Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
 * Previamente se deben redondear ambos valores.
 * Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz 
 * cuadrada se debe obtener el valor absoluto del número.*
 *
 */
package main;

import entidades.ParDeNumeros;
import servicios.ParDeNumerosServicio;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosServicio ps1 = new ParDeNumerosServicio();
        ParDeNumeros parnum1 = ps1.crearParNum();
        ps1.mostrarValores(parnum1);
        System.out.println("El numero mayor es: "+ps1.devolverMayor(parnum1));
        System.out.println("El numero menor es: "+ps1.devolverMenor(parnum1));
        ps1.calcularPotencia(parnum1);
        ps1.calcularRaiz(parnum1);
    }
    
}
