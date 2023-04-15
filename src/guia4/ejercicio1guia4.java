/*
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
 * restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
 * matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package guia4;

import java.util.Scanner;
public class ejercicio1guia4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
     int res=operacion();
        System.out.println("el resultado de su operacion es: "+res);
    }
    public static int operacion(){
        int resultado;
        int x1;
        int x2;
        int op;
        System.out.println("ingrese los valores de x1 y x2 ");
        x1=sc.nextInt();
        x2=sc.nextInt();
        System.out.println("elija la operacion:" + // /n para salto de linea con un solo sout
                "\n1.Suma" +
                "\n2.Resta" +
                "\n3.Multiplicacion" +
                "\n4.Dividir" +
                "\n5.Salir");
        op=sc.nextInt();
        switch (op){
                    case 1:
                       resultado=suma(x1,x2);
                        break;
                    case 2:
                        resultado=resta(x1,x2);
                        break;
                    case 3:
                       resultado=multiplicacion(x1,x2);
                        break;
                    case 4:
                        resultado=dividir(x1,x2);
                        break;
                     default:
                System.out.println("al no elejir una operacion le daremos un resultado cero");
                resultado=0;
        }
        return resultado;
    }
    public static int suma(int x1, int x2){
        int suma=x1+x2;
        return suma;
    }
    public static int resta(int x1, int x2){
        int resta=x1-x2;
        return resta;
    }
    public static int multiplicacion(int x1, int x2){
        int multiplicacion=x1*x2;
        return multiplicacion;
    }
    public static int dividir(int x1, int x2){
        int dividir=x1/x2;
        return dividir;
    }
} //ejercicio de Ari y Ale. 