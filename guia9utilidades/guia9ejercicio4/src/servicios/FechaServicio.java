/*
 * Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que 
 * tenga los siguientes métodos:
 * Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a 
 * un nuevo objeto Date. El método debe retornar el objeto Date. 
 * Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
 * Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la 
 * clase Date. Ejemplo: Date fechaActual = new  Date();
 * El método debe retornar el objeto Date.
 * Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra 
 * (edad del usuario).
 *
 */
package servicios;

import entidades.Fecha;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Lucas
 */
public class FechaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Date fechaNacimiento(){
       Fecha fecha = new Fecha();
       System.out.println("Ingrese su año, mes y dia: ");
       fecha.setAnio(leer.nextInt());
       fecha.setMes(leer.nextInt());
       fecha.setDia(leer.nextInt());
       String fechaFormateada = String.format("%04d/%02d/%02d", fecha.getAnio(), fecha.getMes(), fecha.getDia());
       System.out.println("La fecha ingresada es: " + fechaFormateada);
       return new Date((fecha.getAnio()-1900),fecha.getMes(),fecha.getDia());
    }
    public Date fechaActual(){
        return new Date();
    }
    public void diferencia(Date ingreso,Date actual){
        System.out.println("este metodo va a restar la fecha ingresada por el usuario, menos la hora actual... ");
        System.out.println("la resta de las fechas, dan como resultado: "+ (actual.getYear()-ingreso.getYear()));
        
    }
    
}
