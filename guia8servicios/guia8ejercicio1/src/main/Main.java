/*
 * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta
 * (entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
 * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
 * Método para crear cuenta pidiéndole los datos al usuario.
 * Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
 * Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta 
 * no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
 * Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
 * Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
 * Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package main;


import entidades.CuentaBancaria;
import java.util.Scanner;
import servicios.CuentaBancariaServicio;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria c1 = cbs.crearCuenta();
        do {
         System.out.println("Bienvenido al cajero ------- OPCIONES");
        System.out.println("1. Ingresar dinero a la cuenta.");
        System.out.println("2. Retirar dinero de la cuenta.");
        System.out.println("3. Extraccion Rapida (solo %20).");
        System.out.println("4. Consultar saldo.");
        System.out.println("5. Consultar Datos de la cuenta.");
        System.out.println("6. Salir del sistema.");
        System.out.println("-----------------------------------");
        opc=leer.nextInt();
        switch (opc){
            case 1:
                cbs.ingresar(c1);
                break;
            case 2:
                cbs.retirar(c1);
                break;
            case 3:
                cbs.extraccionRapida(c1);
                break;
            case 4:
                cbs.consultarSaldo(c1);
                break;
            case 5:
                cbs.consultarDatos(c1);
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Debe ingresar una opcion valida");
        }   
        } while (opc!=6);
          
        
        System.out.println("Gracias por utilizar nuestro sistema.");
    }
    
}
