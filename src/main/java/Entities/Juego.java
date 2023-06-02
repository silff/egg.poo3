/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
 */
package Entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Juga> jugadores;
    private Revolver revolver;

    public Juego() {
    }

//    public Juego(ArrayList<Juga> jugadores, Revolver revolver) {
//        this.jugadores = jugadores;
//        this.revolver = revolver;
//    }
    public ArrayList<Juga> getJugadores() {
        return jugadores;
    }

    /*• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
    y el revolver para guardarlos en los atributos del juego.*/
    public void llenarJuego() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Juga> jugadores = new ArrayList();
        int cantidad;
        System.out.println("cuantos jugadores desean participar (max 6)");
        cantidad = sc.nextInt();
        if (cantidad > 6) {
            cantidad = 6;
        }
        int id = 1;
        for (int i = 0; i < cantidad; i++) {
            Juga jugador = new Juga(id);
            jugadores.add(jugador);
            id++;
        }
        this.jugadores = jugadores;
        this.revolver = new Revolver();

        revolver.llenarRevolver();
    }

    /*• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
    public void ronda() {

        for (Juga jugadore : jugadores) {
            jugadore.disparo(revolver, jugadore);
            System.out.println(jugadore.getNombra() + " tu turno");
            if (jugadore.isMojado()) {
                System.out.println(jugadore.getNombra() + "MOJADO");

                break;
            } else {
                System.out.println("sigue");
            }
        }
    }
}
