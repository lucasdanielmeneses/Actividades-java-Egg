/*
 * Una obra social tiene tres clases de socios:
 * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
 * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los 
 * socios del tipo A.
 * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
 * Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el 
 * costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
 *
 */
package guia3extra;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio5guia3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerprecios = new Scanner(System.in);
        String socio;
        double tratamiento, costo;
        boolean opc = false;

        

        do {
            System.out.println("Ingrese el tipo de socio, por favor (A,B,C)");
        socio = leer.nextLine();
        socio = socio.toLowerCase();
            switch (socio) {
                case "a":
                    System.out.println("Usted selecciono: Socios -A-(Beneficios del %50 en el costo del tratamiento).");
                    System.out.println("Ingrese el monto del tratamiento: ");
                    tratamiento = leerprecios.nextDouble();
                    costo = tratamiento * 0.5;
                    System.out.println("El costo del tratamiento para este afiliado es de " + costo + " pesos.");
                    opc=true;
                    break;
                case "b":
                    System.out.println("Usted selecciono: Socios -B-(Beneficios del %35 en el costo del tratamiento).");
                    System.out.println("Ingrese el monto del tratamiento: ");
                    tratamiento = leerprecios.nextDouble();
                    costo = tratamiento * 0.35;
                    System.out.println("El costo del tratamiento para este afiliado es de " + costo + " pesos.");
                    opc=true;
                    break;
                case "c":
                    System.out.println("Usted selecciono: Socios -C-(Sin beneficios en el costo del tratamiento).");
                    System.out.println("Ingrese el monto del tratamiento: ");
                    tratamiento = leerprecios.nextDouble();
                    costo = tratamiento;
                    System.out.println("El costo del tratamiento para este afiliado es de " + costo + " pesos.");
                    opc=true;
                    break;
                default:
                    System.out.println("Debe seleccionar una opcion correcta...");
                    opc = false;
                    break;
            }
        } while (opc == false);

    }

   }