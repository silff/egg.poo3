/*
 */
package egg.guia11ejercicio3;

import Entities.Baraja;
import Entities.Cartas;
import Enum.Palo;
import Servicies.BarajaServicio;

public class Guia11ejercicio3 {

    public static void main(String[] args) {

        BarajaServicio b = new BarajaServicio();
        b.crearBaraja();
        //b.mostrarBaraja();
        b.barajar();
        b.siguienteCarta();
        b.cartasDisponibles();
    }
}
