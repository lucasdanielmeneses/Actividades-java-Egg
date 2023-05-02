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

import java.util.Arrays;




/**
 *
 * @author Lucas
 */
public class ArregloServicios {
  
    
   public void inicializarA(double[] objetoa){
        for (int i = 0; i < objetoa.length; i++) {
         objetoa[i]=(double)Math.floor(Math.random() * (99)) + 1;
       }
   }
   public void mostrar(double[] arreglo){
       System.out.println("Mostrando el objeto indicado.");
       for (int i = 0; i < arreglo.length; i++) {
           System.out.print("["+arreglo[i]+"]");
       }
       System.out.println("");
   }
   public void ordenar(double[] arreglo){
       Arrays.sort(arreglo);
       System.out.println("El arreglo ordenado tiene la siguiente forma...");
       for (int i = 0; i < arreglo.length; i++) {
           System.out.print("["+arreglo[i]+"]");
       }
       System.out.println("");
   }
   public void inicializarB(double[] objetob, double[] objetoa){
       System.arraycopy(objetoa, 0, objetob, 0, 10);
        for (int i = 10; i < objetob.length; i++) {
         objetob[i]=(double)Math.floor(Math.random() * (99)) + 1;
       }
   }
   
}
