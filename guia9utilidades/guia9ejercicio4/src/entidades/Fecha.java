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
package entidades;

import java.util.Date;

/**
 *
 * @author Lucas
 */
public class Fecha {
    private Date dia;
    private Date mes;
    private Date anio;

    public Fecha() {
    }

    public Fecha(Date dia, Date mes, Date anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Date getMes() {
        return mes;
    }

    public void setMes(Date mes) {
        this.mes = mes;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }
    
    
}
