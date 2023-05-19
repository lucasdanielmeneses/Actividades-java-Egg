/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package main;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.AlumnoServicio;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicio as = new AlumnoServicio();
        ArrayList<Alumno> listamain = as.listaAlumno();
        for (Alumno aux : listamain){
            System.out.println(aux.toString());
        }
        System.out.println("Ingrese el nombre del alumno para obtener el promedio de sus notas:");
        String nom_est=leer.next();
        double promedioAl=as.notaFinal(listamain, nom_est);
        if (promedioAl==0.0) {
            System.out.println("Como no existe el alumno, no hay promedio :(");
        } else {
          System.out.println("el promedio final del alumno seleccionado es"+ promedioAl);  
        }
        
    }
    
}
