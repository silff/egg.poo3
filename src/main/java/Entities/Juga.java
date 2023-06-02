/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
10
 */
package Entities;

import java.util.Scanner;

public class Juga {

    private int id;
    private String nombre;
    private boolean mojado;

    public Juga() {
    }

    public Juga(int id) {
        Scanner sc = new Scanner(System.in);
        this.id = id;
        System.out.println("nombre");
        String nom = sc.nextLine();
        this.nombre = id + " " + nom;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombra() {
        return nombre;
    }

    public void setNombra(String nombra) {
        this.nombre = nombra;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Juga{" + "id=" + id + ", nombra=" + nombre + ", mojado=" + mojado + '}';
    }

    /*• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
    public void disparo(Revolver revolver, Juga juga) {

        juga.setMojado(revolver.mojar());
        revolver.siguienteChorro();
    }

}
