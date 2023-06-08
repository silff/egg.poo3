/*Las operaciones que podrá realizar la baraja son:
 */
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
    private final ArrayList<Cartas> cartasEntregadas;

    public BarajaServicio() {
        this.baraja = new Baraja();
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.carta = new Cartas();
        this.barajaCompleta = baraja.getC();
        this.cartasEntregadas = new ArrayList<>();
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

    /*• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se 
    saca una carta y luego se llama al método, este no mostrara esa primera carta.*/
    public void mostrarBaraja() {
        System.out.println(baraja.toString());
    }

    /*• barajar(): cambia de posición todas las cartas aleatoriamente.*/
    public void barajar() {
        Collections.shuffle(barajaCompleta);
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
        System.out.println("Cartas disponibles " + barajaCompleta.size());
    }

    /*• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
    número de cartas. En caso de que haya menos cartas que las pedidas, no
    devolveremos nada, pero debemos indicárselo al usuario.*/
    public void darCartas() {
        System.out.println("Cuantas cartas quiere?");
        int cantidad = sc.nextInt();
        int mazo = barajaCompleta.size();
        if (cantidad <= mazo) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Se entrega " + barajaCompleta.get(i).toString());
                cartasEntregadas.add(barajaCompleta.get(i));
            }

        } else {
            System.out.println("No hay suficientes cartas, quedan ");
            cartasDisponibles();
        }
        barajaCompleta.removeAll(cartasEntregadas);
    }

    /*• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha 
    salido ninguna indicárselo al usuario*/
    public void cartasMonton() {

        if (cartasEntregadas.isEmpty()) {
            System.out.println("Aun no se repartieron cartas");
        } else {
            System.out.println("Se repartieron " + cartasEntregadas.toString());
        }
    }

    public void salir() {

    }

    public void menu() {
        System.out.println("""
                           MENU                            
                           1 - Barajar
                           2 - Ver siguiente carta
                           3 - Pedir cartas
                           4 - Ver cartas repartidas
                           5 - Ver cartas en el mazo
                           6 - Mazo nuevo
                           7 - Salir
                           """);

        String opcion = sc.next();

        switch (opcion) {
            case "1" -> {
                barajar();
                menu();
            }
            case "2" -> {
                siguienteCarta();
                menu();
            }
            case "3" -> {
                darCartas();
                menu();
            }
            case "4" -> {
                cartasMonton();
                menu();
            }
            case "5" -> {
                mostrarBaraja();
                menu();
            }
            case "6" -> {
                crearBaraja();
                menu();
            }
            case "7" ->
                salir();
            default -> {
            }
        }
    }
}
