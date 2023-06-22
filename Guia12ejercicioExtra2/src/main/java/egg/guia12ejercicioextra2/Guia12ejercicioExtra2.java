/*• 
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package egg.guia12ejercicioextra2;

import entities.Edificio;
import java.util.ArrayList;
import java.util.Scanner;
import servicies.EdificioDeOficinasServicio;

public class Guia12ejercicioExtra2 {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ArrayList<Edificio> listaEdificios = new ArrayList();
        EdificioDeOficinasServicio eO = new EdificioDeOficinasServicio();
        Edificio edificio = new Edificio();

        do {
            edificio = eO.crearEdificioDeOficinas();
            System.out.println(edificio);
            listaEdificios.add(edificio);
            System.out.println("(S)Salir ");
            if (sc.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);

    }
}
