/*Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta. */
package Servicies;

import Entities.Baraja;
import Entities.Cartas;
import Enum.Palo;
import java.util.Scanner;

public class BarajaServicio {

    private Cartas carta;
    private final Baraja baraja;
    private final Scanner sc;

    public BarajaServicio() {
        this.baraja = new Baraja();
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.carta = carta;
    }

    public void crearBaraja() {
        for (Palo p : Palo.values()) {
            for (int i = 0; i < baraja.getMazo(); i++) {
                if (i == 7 || i == 8) {
                } else {
                    baraja.getC()[i] = new Cartas(i + 1, p);
                }

            }
        }
    }

    public void mostrarBaraja() {
        System.out.println(baraja.toString());
    }
}
