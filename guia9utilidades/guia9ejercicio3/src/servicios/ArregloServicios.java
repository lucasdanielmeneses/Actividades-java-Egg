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
package servicios;

import entidades.Arreglo;
import java.util.Arrays;




/**
 *
 * @author Lucas
 */
public class ArregloServicios {
  
   
    
   public void inicializarA(Arreglo objeto){
       double[] vector= new double[objeto.getA().length];
        for (int i = 0; i < objeto.getA().length; i++) {
         vector[i]=(double)Math.floor(Math.random() * (99)) + 1;
       }
        objeto.setA(vector);
   }
   
   public void mostrarA(Arreglo arreglo){
        System.out.println("Mostrando el objeto indicado.");
        System.out.println(Arrays.toString(arreglo.getA())) ;
       }
   public void mostrarB(Arreglo arreglo){
        System.out.println("Mostrando el objeto indicado.");
        System.out.println(Arrays.toString(arreglo.getB())) ;
       }
   
   public void ordenar(Arreglo arreglo){
       double[] vector = arreglo.getA();
       Arrays.sort(vector);
       System.out.println("El arreglo ordenado tiene la siguiente forma...");
       System.out.println(Arrays.toString(arreglo.getA())) ;
   }
   public void inicializarB(Arreglo arreglo){
       double[] objb =new double[arreglo.getB().length];
       System.arraycopy(arreglo.getA(), 0, objb, 0, 10);
       Arrays.fill(objb,10,20,0.5);
       arreglo.setB(objb);
   }
   
}
