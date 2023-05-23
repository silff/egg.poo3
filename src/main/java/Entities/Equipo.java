/*Luego otra clase Equipo que contenga una colección 
de jugadores. Una vez hecho esto, desde el main recorreremos el equipo mostrando 
la información de cada jugador. 
 */
package Entities;

import java.util.ArrayList;
import java.util.Set;


public class Equipo {

    private ArrayList<Jugador> jugadores;

    public Equipo() {
        jugadores = new ArrayList<>();
    }

    public Equipo(Set<Jugador> jugadores) {
        this.jugadores = new ArrayList<>();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo" + "jugadores=" + jugadores;
    }

}
