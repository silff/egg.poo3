
import Entities.Equipo;
import Entities.Jugador;
import java.util.ArrayList;


public class EquipoMain {

    public static void main(String[] args) {

        Jugador jugador = new Jugador();
        jugador.setNombre("enzo");
        jugador.setApellido("fernandez");
        jugador.setPosicion("delantero");
        jugador.setNumero(13);
        
        ArrayList <Jugador> jugadores;
        jugadores = new ArrayList<>();
        jugadores.add(jugador);
        
        Equipo eq = new Equipo();

        System.out.println(eq.toString());
    }
}
