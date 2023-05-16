/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Estudiante;
import java.util.Arrays;
import servicios.EstudianteServicio;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        EstudianteServicio es = new EstudianteServicio();
        Estudiante[] vectorEst = new Estudiante[8];
        for (int i = 0; i < 8; i++) {
            vectorEst[i]= es.crearEstudiantes();
        }
        
        double prom = es.calculaPromedio(vectorEst);
        System.out.println("el promedio de los alumnos es de :"+ prom);
        System.out.println(".....");
        System.out.println(".....");
        System.out.println("Lista de alumnos con notas mayor al promedio:");
        String[] myProm= es.alumnosPromMY(vectorEst);
        es.mostrarAlumnos(myProm);
        

        }
    }
    

