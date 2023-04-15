/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado 
 * a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros 
 * y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
 * (void).
 * El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package guia4;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;
public class ejercicio3guia4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double euro;
        System.out.println("digite cuantos euro quiere convertir");
        euro=sc.nextDouble();
        conversor(euro); // se llama al subprograma conversor para que haga el calculo.
    }
    public static void conversor(double euro){
             int op; // esta variable es para las opciones
        System.out.println("digite a que moneda quiere convertir" +
                "\n1.libra" +
                "\n2.dolar" +
                "\n3.yenes" +
                "\n4.salir");
        op= sc.nextInt(); // se elige la opcion
        switch (op){
            case 1:
                euro=0.86*euro;
                System.out.println("los euros pasados a libras son: "+euro);
                break;
            case 2:
                euro=1.28611*euro;
                System.out.println("los euros pasados a dolar son: "+euro);
                break;
            case 3:
                euro=euro*129.852;
                System.out.println("los euros pasados ayenes son: "+euro);
                break;
            default:
                System.out.println("hasta luego");
        }
    }
}