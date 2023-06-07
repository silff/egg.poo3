/*
 */

package egg.guia11ejercicio3;

import Entities.Cartas;
import Enum.Palo;

public class Guia11ejercicio3 {

    public static void main(String[] args) {
       
        
        Cartas carta = new Cartas(10, Palo.COPA);
       
        Cartas carta2 = new Cartas(12, Palo.BASTO);
         System.out.println(carta + " " + carta2);
    }
}
