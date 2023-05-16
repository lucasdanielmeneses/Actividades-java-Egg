/*
 * Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento 
 * (Tipo Date), constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete 
 * servicio, con los siguientes métodos:
 * Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto 
 * Persona creado.
 * Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha 
 * actual.
 * Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad 
 * consultada o false en caso contrario.
 * Método mostrarPersona que muestra la información de la persona deseada.
 *
 */
package servicios;


import entidades.Persona;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona, pro favor: ");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese el año de nacimiento de la persona:");
        int anio=leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento de la persona (en numeros):");
        int mes=leer.nextInt();
        System.out.println("Ingrese el dia de nacimiento de la persona:");
        int dia=leer.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes - 1, dia);
        persona.setFechaNac(calendar.getTime());
        return persona;
    }
    
}
