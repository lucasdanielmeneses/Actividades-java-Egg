/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class EstudianteServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Scanner leer2 = new Scanner(System.in).useDelimiter("\n");
   
    
    public Estudiante crearEstudiantes(){
        Estudiante est = new Estudiante();
        System.out.println("Ingrese el nombre del Estudiante:");
        est.setNombre(leer2.nextLine());
        System.out.println("Ingrese la nota :");
        est.setNota(leer.nextDouble());
        return est;
    }
    
    
    
    public double calculaPromedio(Estudiante[] est){
        double sumador=0;
        for (Estudiante est1 : est) {
            sumador = est1.getNota() + sumador;
        }
        double promedio = sumador/est.length;
        return promedio;
    }
    
    public String[] alumnosPromMY(Estudiante[] est){
        double promedio= this.calculaPromedio(est);
        String[] alumnosMy = new String[est.length]; 
        for (int i = 0; i < est.length; i++) {
            if (est[i].getNota()>=promedio) {
              alumnosMy[i]=est[i].getNombre();
            }
        }
        return alumnosMy;
    }
    public void mostrarAlumnos(String[] alumnosMy){
        ArrayList<String> nombresSinVacios = new ArrayList<>();

    for (String nombre : alumnosMy) {
      if (nombre != null && !nombre.isEmpty()) {
        nombresSinVacios.add(nombre);
      }
    }
    System.out.println(nombresSinVacios);
    }
}
