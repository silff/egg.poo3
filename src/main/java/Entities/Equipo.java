/*Luego otra clase Equipo que contenga una colección 
de jugadores. Una vez hecho esto, desde el main recorreremos el equipo mostrando 
la información de cada jugador. 
 */
package Entities;

import java.util.ArrayList;
import java.util.Set;

public class Equipo {

    private Jugador jugador;
    private ArrayList<Jugador> jugadores;

    public Equipo() {
        this.jugador = jugador;
        this.jugadores = new ArrayList<>();
    }

    public Equipo(Jugador jugador, Set<Jugador> jugadores) {
        this.jugador = jugador;
        this.jugadores = new ArrayList<>();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        System.out.println("EQUIPO");
        System.out.println("-------------");
        for (Jugador j : jugadores) {
            System.out.println(j);
        }
        return "-------------";
    }

}
