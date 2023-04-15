/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por 
 * debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package guia3extra;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio6guia3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double altura;
        double prom160=0.0;
        double promtotal=0.0;
        int conteo160 = 0, conteototal = 0;
        String sn;
        Scanner leer = new Scanner(System.in);
        Scanner preg = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("Ingrese la altura por favor: ");
            altura = leer.nextDouble();
            if ( altura<1.6 ) {
                conteo160++;
                prom160 = prom160 + altura;
            } else {
                conteototal++;
                promtotal = promtotal + altura;
            }
            System.out.println("¿Desea agregar otra estatura mas?(S/N)");
            sn = preg.nextLine();
            if ("s".equalsIgnoreCase(sn)) {
                System.out.println("Volviendo al principio...");
                salir = true;

            } else if ("n".equalsIgnoreCase(sn)) {
                System.out.println("Calculando los datos ingresados...");
                double resu160 = (double) prom160/conteo160;
                double resutotal = (double) promtotal/conteototal;
                System.out.println("El promedio de la estatura de aquellos con menos de 1.60 mts es: " + resu160);
                System.out.println("El promedio de la estatura todos los datos ingresados es: " + resutotal);
                salir = false;
                } else {
                System.out.println("Debe ingresar un valor adecuado (S/N)...");
                salir = true;
                }
        }while (salir == true);
        //Si el programa presenta error al ejecutarse, es por que los datos double se soportan a travez de la coma y no del punto.
    }

}
