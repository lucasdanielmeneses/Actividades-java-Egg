/*
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método 
 * "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de 
 * el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package extraguia7ejercicio4;

import Entidades.cuenta;

/**
 *
1500 */
public class Extraguia7ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cuenta c1 = new cuenta("Amalia Java", 20000); //Asignamos los atributos por este modo
        cuenta c2 = new cuenta();
        
        c2.setTitular("Pepito Cuevas"); //y con los set 
        c2.setSaldo(15000);
        //Ahora usamos el metodo reirar_dinero para ambos casos...
        c1.retirar_dinero();
        c2.retirar_dinero();
    }
    
}
