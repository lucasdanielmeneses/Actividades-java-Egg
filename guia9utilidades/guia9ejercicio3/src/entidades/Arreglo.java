/*
* Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
* Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
* -Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
* -Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
* -Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
* -Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 
* 10 posiciones del arreglo B con 0.5.
* En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
*/
package entidades;

/**
 *
 * @author Lucas
 */
public class Arreglo {
 private double[] a=new double[50];
 private double[] b=new double[20];

    public Arreglo() {
    }

    public Arreglo(double[] a, double[] b) {
        this.a = a;
        this.b = b;
    }

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public double[] getB() {
        return b;
    }

    public void setB(double[] b) {
        this.b = b;
    }
 
}
