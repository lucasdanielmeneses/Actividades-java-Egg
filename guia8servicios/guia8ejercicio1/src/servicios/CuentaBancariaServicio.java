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
package servicios;

import entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Ingrese el numero de cuenta, por favor: ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ahora ingrese el DNI: ");
        cuenta.setDniCliente(leer.nextLong());
        System.out.println("Por ultimo, ingrese el Saldo actual de la cuenta: ");
        cuenta.setSaldoActual(leer.nextDouble());
        return cuenta;
    }

    public void ingresar(CuentaBancaria cuenta) {
        double importe;
        System.out.println("Usted acutualmente posee " + cuenta.getSaldoActual() + " Ingrese el monto de deposito, por favor: ");
        importe = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + importe);
        System.out.println("Importe agregado correctamente, actualmente posee en su caja: " + cuenta.getSaldoActual() + " pesos.");
    }

    public void retirar(CuentaBancaria cuenta) {
        double retiro;
        System.out.println("Usted acutualmente posee " + cuenta.getSaldoActual() + " Ingrese el monto de retiro, por favor: ");
        retiro = leer.nextDouble();
        if (retiro > cuenta.getSaldoActual()) {
            System.out.println("El monto de retiro supera a su saldo actual (Usted retira " + retiro + " pero posee " + cuenta.getSaldoActual() + ".");
            retiro=cuenta.getSaldoActual();
            System.out.println("Retirando la totalidad del saldo...");
            cuenta.setSaldoActual(0);
            System.out.println("Monto retirado: "+retiro);

        } else {
            System.out.println("Retirando el importe deseado (" + retiro + ").");
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        System.out.println("Importe retirado correctamente, actualmente posee en su caja: " + cuenta.getSaldoActual() + " pesos.");
            System.out.println("Monto retirado: "+retiro);
        }
        
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        double retiroRap;
        System.out.println("Usted acutualmente posee " + cuenta.getSaldoActual() + " Seleccionó Extraccion Rapida ! (%20 del saldo) ");
        retiroRap = cuenta.getSaldoActual() * 0.2;
        cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
        System.out.println("Importe debitado correctamente, actualmente posee en su caja: " + cuenta.getSaldoActual() + " pesos.");
         System.out.println("Monto retirado: "+retiroRap);
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su saldo actual es: "+ cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("------DATOS DEL USUARIO--------");
        System.out.println("Numero de Cuenta: "+ cuenta.getNumeroCuenta());
        System.out.println("Numero de DNI: "+ cuenta.getDniCliente());
        System.out.println("Saldo actual de la cuenta: "+cuenta.getSaldoActual());
        System.out.println("--------------------------------");
    }

}
