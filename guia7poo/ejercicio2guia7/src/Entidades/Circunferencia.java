/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A 
 * continuación, se deben crear los siguientes métodos:
 * Método constructor que inicialice el radio pasado como parámetro.
 * Métodos get y set para el atributo radio de la clase Circunferencia.
 * Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
 * Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
 * Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 *
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Circunferencia {
    private double radio;
    
    //metodo constructor
    public Circunferencia() {
    }
    
    //metodo constructor con parametro radio

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    //metodo get

    public double getRadio() {
        return radio;
    }
    //metodo set

    public void setRadio(double radio) {
        this.radio = radio;
    }
    //metodo crearCircunferencia
    
    public void crearCircunferencia(){
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el valor del radio: ");
            this.radio=leer.nextDouble();
}
    //metodo area
    public void Area(){
        double areamet;
        //areamet = (Math.PI*this.radio)*(Math.PI*this.radio); metodo igual al de abajo
        areamet = Math.pow(Math.PI*this.radio,2);
        System.out.println("El area de la circunferencia es: "+ areamet);
}
    
    public void Perimetro(){
        System.out.println("El area de la circunferencia es: "+ (2*Math.PI*this.radio));
}
    
    
}
