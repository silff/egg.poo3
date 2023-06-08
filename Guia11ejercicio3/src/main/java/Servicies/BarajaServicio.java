/*Las operaciones que podrá realizar la baraja son:
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta. */
package Servicies;

import Entities.Baraja;
import Entities.Cartas;
import Enum.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaServicio {

    private Cartas carta;
    private final Baraja baraja;
    private final Scanner sc;
    private final ArrayList<Cartas> barajaCompleta;

    public BarajaServicio() {
        this.baraja = new Baraja();
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.carta = carta;
        this.barajaCompleta = baraja.getC();
    }

    public void crearBaraja() {
        for (Palo p : Palo.values()) {
            for (int i = 0; i < 12; i++) {
                if (i == 7 || i == 8) {
                    continue;
                } else {
                    carta = new Cartas(i + 1, p);
                }
                barajaCompleta.add(carta);
            }
        }
    }

    public void mostrarBaraja() {
        System.out.println(baraja.toString());
    }

    /*• barajar(): cambia de posición todas las cartas aleatoriamente.*/
    public void barajar() {
        Collections.shuffle(barajaCompleta);
        mostrarBaraja();
    }

    /*• siguienteCarta(): devuelve la siguiente carta que está en la baraja,
    cuando no haya más o se haya llegado al final, se indica al usuario que no 
    hay más cartas.*/
    public void siguienteCarta() {
        barajaCompleta.get(0);
        System.out.println("La siguiente carta es : " + barajaCompleta.get(0).toString());
        //return c;
    }

    /*• cartasDisponibles(): indica el número de cartas que aún se puede repartir.*/
    public void cartasDisponibles() {
        barajaCompleta.size();
    }

    /*• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
    número de cartas. En caso de que haya menos cartas que las pedidas, no
    devolveremos nada, pero debemos indicárselo al usuario.*/
    public void darCartas() {
        System.out.println("Cuantas cartas quiere?");
        int cantidad = sc.nextInt();
        /*if (cantidad <= barajaCompleta.size()) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Se entrega " + mazoInicial.getCartas().get(i).toString());
            }
            for (int i = 0; i < cantidad; i++) {
                cartasEntregadas.getCartas().add(mazoInicial.getCartas().get(0));
                mazoInicial.getCartas().remove(0);
            }
        } else {
            System.out.println("No hay suficientes cartas");
            cartasDisponibles();
        }*/
    }
}
