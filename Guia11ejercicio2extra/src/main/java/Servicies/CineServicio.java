/*Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package Servicies;

import Entities.Asientos;
import Entities.Sala;
import java.util.Scanner;

public class CineServicio {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearSala() {

        System.out.println("crear una sala");

        int filas = 8;
        int columnas = 6;
        Sala sala = new Sala(filas, columnas);

        Asientos[][] asientos = sala.getSala();
        System.out.println(sala.getFilas() + " " + sala.getColumnas());

        for (int i = 0; i < sala.getFilas(); i++) {
            for (int j = 0; j < sala.getColumnas(); j++) {
                asientos[i][j] = new Asientos(i + 1, (char) ('A' + j));
            }
        }

        System.out.println(sala.toString());
    }
}
