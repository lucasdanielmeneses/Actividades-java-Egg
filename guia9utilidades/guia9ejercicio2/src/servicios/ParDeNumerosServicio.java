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
package servicios;

import entidades.ParDeNumeros;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ParDeNumerosServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Random numAleatorios = new Random();
    public ParDeNumeros crearParNum(){
        
        ParDeNumeros par = new ParDeNumeros();
        System.out.println("---------------------metodo crearParNum-----------------------");
        System.out.println("Asignando valores aleatorios a numero 1 ");
        par.setNumero1(numAleatorios.nextDouble()*10);
        System.out.println("Asignando valores aleatorios a numero 2");
        par.setNumero2(numAleatorios.nextDouble()*10);
        System.out.println("-------------fin del metodo crearParNum ----------------------");
        
        return par;
    }
    public void mostrarValores(ParDeNumeros par){
        System.out.println("---------------------metodo mostrarValores-----------------------");
        System.out.println("El valor generado en numero 1 es: "+ par.getNumero1());
        System.out.println("El valor generado en numero 2 es: "+ par.getNumero2());
        System.out.println("-------------fin del metodo mostrarValores ----------------------");
    }
    
    public double devolverMayor(ParDeNumeros par){
        // System.out.println("---------------------metodo devolverMayor-----------------------");
        double numeroMayor=0;
       //vamos a usar el metodo Double.compare para determinar cual es el mayor de los dos atributos:
       // compara los dos doubles y si es cero, so iguales, si es mayor a cero el primer parametro es mayor
        if (Double.compare(par.getNumero1(), par.getNumero2())==0) {
        //    System.out.println("Los numeros son iguales !");
        } else if (Double.compare(par.getNumero1(), par.getNumero2())>0) {
        //     System.out.println("El atributo numero 1 ("+par.getNumero1()+"), es mayor que el numero 2 ("+par.getNumero2()+").");
             numeroMayor=par.getNumero1();
        } else{
        //    System.out.println("El atributo numero 2 ("+par.getNumero2()+"), es mayor que el numero 1 ("+par.getNumero1()+").");
            numeroMayor=par.getNumero2();
        }
        //System.out.println("-------------fin del metodo devolverMayor ----------------------");
        //----------------forma analoga------------------------------
        //if (par.getNumero1()>par.getNumero2()) {
        //    System.out.println("El atributo numero 1 ("+par.getNumero1()+"), es mayor que el numero 2 ("+par.getNumero2()+").");
        //} else if (par.getNumero2()>par.getNumero1()) {
        //     System.out.println("El atributo numero 2 ("+par.getNumero2()+"), es mayor que el numero 1 ("+par.getNumero1()+").");
        //} else{
        //    System.out.println("Ambos numero son iguales ! ");
       return numeroMayor;
     }
       //de paso creo este metodo para integrarlo con el proximo metodo....
    public double devolverMenor(ParDeNumeros par){
       // System.out.println("---------------------metodo devolverMenor-----------------------");
       // System.out.println("Aplicando el metodo para ver cual es el menor de los numeros...");
        double numeroMenor=0;
         if (Double.compare(par.getNumero1(), par.getNumero2())==0) {
        //    System.out.println("Los numeros son iguales !");
        } else if (Double.compare(par.getNumero1(), par.getNumero2())<0) {
         //    System.out.println("El atributo numero 1 ("+par.getNumero1()+"), es menor que el numero 2 ("+par.getNumero2()+").");
             numeroMenor=par.getNumero1();
        } else{
         //   System.out.println("El atributo numero 2 ("+par.getNumero2()+"), es menor que el numero 1 ("+par.getNumero1()+").");
            numeroMenor=par.getNumero2();
        }
        //System.out.println("-------------fin del metodo devolverMenor ----------------------");
        return numeroMenor;
    }
    
    public void calcularPotencia(ParDeNumeros par){
        System.out.println("---------------------metodo calcularPotencia-----------------------");
        double resultado = Math.pow(this.devolverMayor(par), this.devolverMenor(par));
        System.out.println("Mostramos el Resultado redondeado a dos decimales: "+ (Math.round(resultado*100)/100));
        System.out.println("-------------fin del metodo calcularPotencia ----------------------");
     }
    public void calcularRaiz(ParDeNumeros par){
        System.out.println("---------------------metodo calcularRaiz-----------------------");
        double raiz=Math.sqrt(this.devolverMenor(par));
        System.out.println("La raiz del menor de los numeros es: "+Math.abs(raiz));
        System.out.println("-------------fin del metodo calcularRaiz ----------------------");
    }
}
