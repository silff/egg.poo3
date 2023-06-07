/*
 */
package egg.guia11ejercicio3;

import Entities.Baraja;
import Entities.Cartas;
import Enum.Palo;
import Servicies.BarajaServicio;

public class Guia11ejercicio3 {

    public static void main(String[] args) {

//        
//        Cartas carta = new Cartas(10, Palo.COPA);
//       
//        Cartas carta2 = new Cartas(12, Palo.BASTO);
//         System.out.println(carta + " " + carta2);
        BarajaServicio b = new BarajaServicio();
        b.crearBaraja();
        b.mostrarBaraja();
    }
}
