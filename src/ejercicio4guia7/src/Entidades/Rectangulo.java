/*
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
 * privado base y un atributo privado altura. La clase incluirá un método para 
 * crear el rectángulo con los datos del Rectángulo dados por el usuario. También 
 * incluirá un método para calcular la superficie del rectángulo y un método para 
 * calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará 
 * el rectángulo mediante asteriscos usando la base y la altura. Se deberán además 
 * definir los métodos getters, setters y constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Rectangulo {
    private int base;
    private int altura;
//constructores
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //metodo get

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    //metodo set

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base: ");
        this.base=leer.nextInt();
        System.out.println("Ahora ingrese la altura: ");
        this.altura=leer.nextInt();
    }
    public void superficieRectangulo(){
        int sup;
        sup = this.altura*this.base;
        System.out.println("La superficie del rectangulo es: "+sup);
    }
    public void perimetroRectangulo(){
        int per;
        per = (this.altura*2)+(this.base*2);
        System.out.println("El perimetro del rectangulo es: "+per);
    }
    
    public void dibujaRectangulo(){
        for (int x = 0; x < this.altura; x++) { //para x que comienza en 0 hasta punto con paso +1
            for (int y = 0; y < this.base; y++) { //para y que comienza en 0 hasta punto con paso +1
                if (x==0 || x==this.altura-1 || y==0 || y==this.base-1) { //marcara un asterisco siempre en cuanto estemos en los bordes del cuadrado
                   /*
                    *Son dos for anidados que hacen el barrido como el que usabamos en matrices:
                    *teniendo el valor de la cantidad de asteriscos (en este caso es la varible punto)
                    *tenemos el limite y lo que van a hacer los for pasar y si se cumple algunas de las condiciones
                    *del if en la linea 31, escribira un asterisco, caso contrario no. 
                    */ 
                    System.out.print("*"); // no se usa System.out.println() por que da salto de linea
                }else{
                    System.out.print(" "); //solo usamos System.out.print()
                }
            }
            System.out.println(); // Aca le metemos este sout, para que haga el salto de linea una vez recorrido cada renglon edl cuadrado. 
        } 
    }
}
