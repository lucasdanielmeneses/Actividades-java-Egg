/*
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. 
 * Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores para construir 
 * el objeto a través de un método constructor. Luego, en RaicesServicio las operaciones que se podrán realizar son 
 * las siguientes:
 * Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente 
 * fórmula: (b^2)-4*a*c
 * Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el 
 * discriminante debe ser mayor o igual que 0.
 * Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el 
 * discriminante debe ser igual que 0.
 * Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
 * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se 
 * tenga una única solución posible.
 * Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles
 * soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan 
 * nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
 * Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 *
 */
package servicio;

import entidades.Raiz;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class RaizServicio {

    Scanner leer = new Scanner(System.in);

    public Raiz cargarValoresRaiz() {
        Raiz raiz = new Raiz();
        System.out.println("Ingrese el valor correspondiente a : A.");
        raiz.setA(leer.nextDouble());
        System.out.println("Ingrese el valor correspondiente a : B.");
        raiz.setB(leer.nextDouble());
        System.out.println("Ingrese el valor correspondiente a : C.");
        raiz.setC(leer.nextDouble());
        return raiz;
    }

    //(b^2)-4*a*c devuelve el discriminante.
    public double getDiscriminante(Raiz raiz) {
        double discriminante;
        discriminante = (Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC();
        return discriminante;
    }

    public boolean tieneRaices(Raiz raiz) {
        boolean condicion;
        condicion = this.getDiscriminante(raiz) > 0; //this. para llamar al metodo dentro del servicio. 
        return condicion;
    }

    public boolean tieneRaiz(Raiz raiz) {
        boolean cond = false;
        if (this.getDiscriminante(raiz) == 0) {
            cond = true;
        }
        return cond;

    }

    public void obtenerRaices(Raiz raiz) {

        boolean cond = this.tieneRaices(raiz);
        if (cond) {
            double ecumas = ((-raiz.getB()) + Math.sqrt((raiz.getB() * raiz.getB()) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA());
            double ecumenos = ((-raiz.getB()) - Math.sqrt((raiz.getB() * raiz.getB()) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA());
            System.out.println("El resultado de las raices es:" + ecumas + " y " + ecumenos + " .");
        } else {
            System.out.println("No se pueden obtener 2 raices en esta ecuacion.");
        }
    }

    public void obtenerRaiz(Raiz raiz) {
        boolean cond = this.tieneRaiz(raiz);
        if (cond) {
            double ecu = (raiz.getB() * -1) + Math.sqrt(((raiz.getB() * raiz.getB()) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA());

            System.out.println("El resultado de la raiz es:" + ecu + " .");
        } else {
            System.out.println("La ecuacion no tiene una sola solucion.");
        }
    }

}
