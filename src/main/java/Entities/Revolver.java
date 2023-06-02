/*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
 */
package Entities;

import java.util.Random;

public class Revolver {
    
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    /*• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.*/
    
    public void llenarRevolver() {
        Random rdm = new Random();
        this.posicionActual = rdm.nextInt(6);
        this.posicionAgua = rdm.nextInt(6);
    }
    /*• mojar(): devuelve true si la posición del agua coincide con la posición actual*/
    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;
                
    }
    /*• siguienteChorro(): cambia a la siguiente posición del tambor*/
    public void siguienteChorro() {
        if(this.posicionActual == 5){
            this.posicionActual = 0;
        }else {
            this.posicionActual++;
        }
    }
    /*• toString(): muestra información del revolver (posición actual y donde está el agua)*/
}
