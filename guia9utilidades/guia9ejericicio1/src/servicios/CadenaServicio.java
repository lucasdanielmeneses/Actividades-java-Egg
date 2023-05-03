/*
 * Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y 
 * su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor 
 * con frase como atributo debe setear la longitud de la frase de manera automática. Crear una clase CadenaServicio 
 * en el paquete servicios que implemente los siguientes métodos:
 * 
 * *Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
 *
 * *Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: 
 * "casa blanca", Salida: "acnalb asac".
 *
 * *Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces
 * se repite el carácter en la frase, por ejemplo:
 * Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
 *
 * *Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra 
 * nueva frase ingresada por el usuario.
 *
 * Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase 
 * ingresada por el usuario y mostrar la frase resultante.
 *
 * Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún 
 * otro carácter seleccionado por el usuario y mostrar la frase resultante.
 * 
 * Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve
 * verdadero si la contiene y falso si no.*
 *
 */
package servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Metodo crear cadena, para hacer el objeto en cuestion.
    public Cadena crearCadena() {

        Cadena cadena = new Cadena();
        System.out.println("Ingrese la frase , por favor: ");
        cadena.setFrase(leer.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        return cadena;
    }
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.

    public void mostrarVocales(Cadena cadena) {
        int contador = 0;
        String opc = cadena.getFrase().toLowerCase();

        for (int i = 0; i < cadena.getFrase().length(); i++) {
            switch (opc.substring(i, i + 1)) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    contador++;
            }
            
        }
         System.out.println("La cantidad de vocales que posee la frase es de: " + contador);
    }
 //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: 
 //"casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena cadena){
       //creamos el stringBuilder que adentro tiene el metodo para invertir un string (reverse)
       StringBuilder stringBuilder = new StringBuilder(cadena.getFrase()); //ponemos por parametro, la frase del objeto cadena.
       String fraseinv = stringBuilder.reverse().toString(); //aplicamos el metodo con reverse y con tostring lo pasamos a string para guardarlo en frase inv.
        System.out.println("La frase invertida es: "+ fraseinv);   
    }
  //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces
  //se repite el carácter en la frase, por ejemplo:
  //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    
    public void vecesRepetido(Cadena cadena,String letra){
        //en este el parametro letra lo voy a tener que poner desde el main. 
        System.out.println("Usted ingreso la letra: "+letra+" para ver cuantas veces se repite... (leyendo)..");
        int contadorletra=0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(cadena.getFrase().substring(i, i+1))) {
              contadorletra++;  
            }
        }
        System.out.println("La letra: "+letra+" Se ha repetido "+ contadorletra + " veces. ");
    }
    
 //Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra 
 //nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena cadena,String frase){
        System.out.println("Usted ingreso: "+ frase);
        System.out.println("Se comparará con la frase previamente ingresada: "+cadena.getFrase());
        if (frase.length()>cadena.getLongitud()) {
            System.out.println("La frase ingresada por parametro posee mas cantidad de caracteres:"+ (frase.length()-cadena.getLongitud())+ " caracteres de diferencia.");
        }else if (frase.length()==cadena.getLongitud()) {
            System.out.println("Ambas frases poseen la misma cantidad de caracteres ! ");
        } else{
            System.out.println("La frase previamente creada tiene mas caracteres que la ingresada por parametros: "+(cadena.getLongitud()-frase.length())+" caracteres de diferencia.");
        }
    }
 //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase 
 //ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena cadena, String frase){
        System.out.println("El resultado de la union de ambas frases es:");
        System.out.println(cadena.getFrase()+frase);
    }
 //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún 
 //otro carácter seleccionado por el usuario y mostrar la frase resultante.
    public void reemplazar(Cadena cadena, String letra){
        String cadenamod=cadena.getFrase();
        cadenamod = cadenamod.replace('a', letra.charAt(0));
        cadenamod = cadenamod.replace('A', letra.charAt(0));
        System.out.println("Frase original: "+cadena.getFrase());
        System.out.println("Frase modificada: "+cadenamod);
    }
 //Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve
 //verdadero si la contiene y falso si no.
     public boolean contiene(Cadena cadena,String letra){
        //en este el parametro letra lo voy a tener que poner desde el main. 
        
        System.out.println("Usted ingreso la letra: "+letra+" para ver si esta en la frase...  (leyendo)..");
        return cadena.getFrase().contains(letra);
     } 
}
