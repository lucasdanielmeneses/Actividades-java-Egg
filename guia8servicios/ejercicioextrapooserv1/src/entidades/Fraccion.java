/*
 * Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
 * fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
 * fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package entidades;

/**
 *
 * @author Lucas
 */
public class Fraccion {
    double denf1, denf2, numf1,numf2;

    public Fraccion() {
    }

    public Fraccion(double denf1, double denf2, double numf1, double numf2) {
        this.denf1 = denf1;
        this.denf2 = denf2;
        this.numf1 = numf1;
        this.numf2 = numf2;
    }

    public double getDenf1() {
        return denf1;
    }

    public void setDenf1(double denf1) {
        this.denf1 = denf1;
    }

    public double getDenf2() {
        return denf2;
    }

    public void setDenf2(double denf2) {
        this.denf2 = denf2;
    }

    public double getNumf1() {
        return numf1;
    }

    public void setNumf1(double numf1) {
        this.numf1 = numf1;
    }

    public double getNumf2() {
        return numf2;
    }

    public void setNumf2(double numf2) {
        this.numf2 = numf2;
    }
    
    
    
}
