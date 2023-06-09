/*
 * * Realizar un programa que pida dos números enteros positivos por
 * teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
 * una opción y el programa deberá mostrar el resultado por pantalla y
 * luego volver al menú. El programa deberá ejecutarse hasta que se elija la
 * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
 * vez de salir del programa directamente, se debe mostrar el siguiente
 * mensaje de confirmación: ¿Está seguro que desea salir del programa
  * S/N ? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
 * contrario se vuelve a mostrar el menú.
 */
package guia3;

import java.util.Scanner;

/**
 * @author lucas
 */
public class ejercicio6guia3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int num1, num2, opcion, resu;
        double resudiv;
        Scanner leer = new Scanner(System.in);
        Scanner leerstr = new Scanner(System.in); //creo dos scanner, por que me tira error si uso uno solo para int y string.. consultar
        String salida;
        boolean cond = false;

        System.out.println("Ingrese el valor del primer numero");
        num1 = leer.nextInt();
        System.out.println("Ahora ingrese el valor del segundo numero");
        num2 = leer.nextInt();
        do { //este do es para que haga todo, siempre en cuanto el valor sea de 1 a 5
            do { //hacemos todo esto.... 
                System.out.println("----MENU----");
                System.out.println("------------");
                System.out.println("1.Sumar");
                System.out.println("2.Restar");
                System.out.println("3.Multiplicar");
                System.out.println("4.Dividir");
                System.out.println("5.Salir");
                System.out.println("------------");
                System.out.println("Elija Opcion");
                opcion = leer.nextInt(); //le vamos a asignar una opcion al switch para que trabaje segun el numero
                switch (opcion) {
                    case 1:
                        resu = num1 + num2;
                        System.out.println("La suma de los numeros ingresados es: " + resu);
                        cond = true; //en todos los casos vamos a asignar una variable booleana que se llame cond y que este en true
                        break;
                    case 2:
                        resu = num1 - num2;
                        System.out.println("La resta de los numeros ingresados es: " + resu);
                        cond = true;
                        break;
                    case 3:
                        resu = num1 * num2;
                        System.out.println("La multiplicacion de los numeros ingresados es: " + resu);
                        cond = true;
                        break;
                    case 4:
                        resudiv = (double) num1 / num2;
                        System.out.println("La division de los numeros ingresados es: " + resudiv);
                        cond = true;
                        break;
                    case 5:
                        do {
                            System.out.println("Seguro que desea salir del programa?(S/N)");
                            salida = leerstr.nextLine();

                            if ("s".equalsIgnoreCase(salida)) { //condicional en caso de apretar s
                                System.out.println("Gracias por utilizar esta calculadora simple.");
                                cond = false; //se pone cond en falso aqui, para que no cumpla el while del ciclo menu
                                break;
                            } else if ("n".equalsIgnoreCase(salida)) { //condicional en caso de presionar n
                                System.out.println("Volviendo al sistema...");
                                cond = true; //cond en true para que se repita el ciclo
                                break;
                            }
                        } while (!salida.equalsIgnoreCase("n") || !salida.equalsIgnoreCase("s")); //la pregunta de la linea 72 se va a repetir todas las veces salvo que se presione "n" o "s"

                }

            } while (cond == true); 
        } while (opcion > 6 || opcion < 0); //este while se usa para que repita el ingreso de la opcion y solo cierre del 1 al 5

    }

}
