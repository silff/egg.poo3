/*
 */
package Main;

import Entities.Juego;

public class RuletaRusa {

    public static void main(String[] args) {
       
        Juego ruleta = new Juego();
        ruleta.llenarJuego();
        ruleta.ronda();
    }
    
}
