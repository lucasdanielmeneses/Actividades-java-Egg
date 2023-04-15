/*
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
* adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
* Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos 
* evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
* Primer trabajo práctico evaluativo 10%
* Segundo trabajo práctico evaluativo 15%
* Primer Integrador 25%
* Segundo integrador 50%
* Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
* programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
* desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual 
* al 7 de sus notas del curso.*
*
 */
package guia5extra;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ejercicio4guia5extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        double ptpe;
        double stpe;
        double pint;
        double sint;
        double vector[]=new double[3];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Primer trabajo práctico evaluativo "+(i+1));
            ptpe=sc.nextDouble();
            System.out.println("Segundo trabajo práctico evaluativo "+(i+1));
            stpe=sc.nextDouble();
            System.out.println("Primer Integrador");
            pint= sc.nextDouble();
            System.out.println("Segundo Integrador");
            sint= sc.nextDouble();
            vector[i]=(ptpe/10)+(stpe/100*15)+(pint/4)+(sint/2);
        }
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]>=7){
                System.out.println("el alumno "+(i+1)+" esta aprobado con "+vector[i]);
            }else {
                System.out.println("el alumno "+(i+1)+" esta desaprobado con "+vector[i]);
            }
        }
    }
} //hecho por Ale y Ari