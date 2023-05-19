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
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class AlumnoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alumno crearAlumno(){
        ArrayList<Integer> estnotas = new ArrayList();
        Alumno est = new Alumno();
        System.out.println("Ingrese el nombre del alumno:");
        est.setNombre(leer.next());
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota Nro "+(i+1));
            Integer notasc = leer.nextInt();
            estnotas.add(notasc);          
        }
        est.setNotas(estnotas);
        return est;
    }
    public ArrayList<Alumno> listaAlumno(){
        ArrayList<Alumno> lista = new ArrayList();
        String conf;
        do {
            System.out.println("Vamos a crear los alumnos de la lista:");
            Alumno Al = this.crearAlumno();
            lista.add(Al);
            System.out.println("Quiere ingresar otro alumno? S/N");
            conf=leer.next();
        } while (!"N".equalsIgnoreCase(conf));
        return lista;
    }
    
    public double notaFinal(ArrayList<Alumno>lista,String nombre ){
        int val=0;
        double promedio, nFinal = 0;
                Iterator it = lista.iterator();
        while (it.hasNext()){
            Alumno auxAlumno = (Alumno) it.next();
            if (nombre.equals(auxAlumno.getNombre())) {
                for (Integer nota : auxAlumno.getNotas()) {
                    nFinal += nota;
                }
                val=1;
            }
            
            }
        if (val==0) {
            System.out.println("El alumno ingresado no existe en la lista...");
        }
        
        promedio=nFinal/3;
        return promedio;
    }
}
