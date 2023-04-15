/*
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método 
 * "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de 
 * el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class cuenta {

    private String titular;
    private double saldo;

    public cuenta() {
    }

    public cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirar_dinero() {
        boolean salir = false;
        boolean salirf = false;
        String opc;
        int sal = 0;
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        do {
            do {
                System.out.println("Bienvenido ! " + this.titular);
                System.out.println("-----------");
                System.out.println("Sistema para retirar dinero unicamente. ");
                System.out.println("Su saldo actual es de: " + this.saldo);
                System.out.println("-----------");
                System.out.println("Cuanto desea retirar? ");
                double retiro = leer.nextDouble();
                if (retiro > this.saldo) {
                    System.out.println("Fondos Insuficientes, pruebe con un monto menor...");
                    salirf = false;
                } else {
                    this.saldo = this.saldo - retiro;
                    System.out.println("usted retiro " + retiro + " de su caja de ahorros, su saldo es de " + this.saldo + ".");
                    salirf = true;
                }

            } while (salirf == false);

            do {
                System.out.println("Quiere retirar mas dinero? S/N");
                opc = leer2.nextLine();

                if (opc.equalsIgnoreCase("S") || opc.equalsIgnoreCase("N")) {
                    if (opc.equalsIgnoreCase("S")) {
                        sal = 0;
                        salir = false;
                        salirf = false;
                    } else if (opc.equalsIgnoreCase("n")) {
                        sal = 0;
                        salir = true;
                    }else{
                        
                    }
                    
                } else {
                    System.out.println("DEBE INGRESAR UNA OPCION CORRECTA (S/N)...");
                    sal = 1;
                }

            } while (sal == 1);

        } while (salir == false || sal == 1 || salirf == false);

    }
}
