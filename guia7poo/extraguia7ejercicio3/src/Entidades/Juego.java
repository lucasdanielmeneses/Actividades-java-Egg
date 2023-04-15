 /*
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de 
 * adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo 
 * jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada 
 * intento. El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. Registra el 
 * número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Juego {
    private int jugador1;
    private int jugador2;

    public Juego() {
    }

    public Juego(int jugador1, int jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public int getJugador1() {
        return jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }
    public void iniciar_juego(){
        int cont=5;
        boolean adivino=false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenidos al juego de la adivinanza ! ");
        System.out.println("Jugador 1 ! elige tu numero secreto. (jugador 2, cerra los ojos ;) ).");
        this.jugador1=leer.nextInt();
        System.out.println("Perfecto ! Ahora, jugador 2... Trata de adivinar e ingresa el numero de tu rival ! (Solo dispones de 5 INTENTOS).)");
        
        do {
            this.jugador2=leer.nextInt();
        if (this.jugador1==this.jugador2) {
            System.out.println("EXCELENTE ! ADIVINASTE EL NUMERO ! ");
            cont=0;
            adivino=true;
        }else{
            if (this.jugador1>this.jugador2) {
                System.out.println("El numero esta mas alto ! ");
                cont--;
                System.out.println("Quedan solo "+cont+" Intentos. ");
            }
            if (this.jugador1<this.jugador2) {
                System.out.println("El numero esta mas abajo ! ");
                cont--;
                System.out.println("Quedan solo "+cont+" Intentos. ");
            }
        }    
        } while (cont!=0);
        if (adivino) {
            System.out.println("Gano el jugador 2 ! ");
        }else{
            System.out.println("Gano el jugador 1 ! ");
        }
        
        
        
        
    }
}
