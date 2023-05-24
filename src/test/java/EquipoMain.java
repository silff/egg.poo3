
import Entities.Equipo;
import Entities.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class EquipoMain {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Jugador jugador;
        Equipo eq = new Equipo();
        ArrayList<Jugador> jugadores = eq.getJugadores();
        System.out.println("cargar datos");
        do {
            jugador = new Jugador();
            System.out.println("nombre");
            jugador.setNombre(sc.next());
            System.out.println("apellido");
            jugador.setApellido(sc.next());
            System.out.println("posicion");
            jugador.setPosicion(sc.next());
            System.out.println("numero");
            jugador.setNumero(sc.nextInt());
            jugadores.add(jugador);
            System.out.println("cargar otro?");
            if (sc.next().equalsIgnoreCase("N")) {
                break;
            }

        } while (true);
        System.out.println(eq.toString());

    }
}
