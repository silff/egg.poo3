/*Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto 
de asientos (8 filas por 6 columnas). De Cine nos interesa conocer la película 
que se está reproduciendo, la sala con los espectadores y el precio de la entrada. 
 */
package Entities;

import java.util.ArrayList;

public class Cine {
    
    private ArrayList<Espectador> espectadores;
    private Pelicula pelicula;
    private Sala sala;
    private double precioEntrada;

    public Cine() {
    }

    public Cine(ArrayList<Espectador> espectadores, Pelicula pelicula, Sala sala, double precioEntrada) {
        this.espectadores = espectadores;
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "espectadores=" + espectadores + ", pelicula=" + pelicula + ", sala=" + sala + ", precioEntrada=" + precioEntrada + '}';
    }
    
    
    
}
