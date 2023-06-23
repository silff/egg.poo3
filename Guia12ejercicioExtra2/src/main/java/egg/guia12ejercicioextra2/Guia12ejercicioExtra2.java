/*• 
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package egg.guia12ejercicioextra2;

import entities.Edificio;
import entities.EdificioDeOficinas;
import entities.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;
import servicies.EdificioDeOficinasServicio;
import servicies.PolideportivoServicio;

public class Guia12ejercicioExtra2 {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ArrayList<Edificio> listaEdificios = new ArrayList();
        EdificioDeOficinasServicio ofS = new EdificioDeOficinasServicio();
        EdificioDeOficinas ediOf;
        PolideportivoServicio poliS = new PolideportivoServicio();
        Polideportivo poli;

        int opcion;
        do {
            System.out.println("tipo de edificio 1 - Oficinas 2 - Polideportivo");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    ediOf = ofS.crearEdificioDeOficinas();
                    listaEdificios.add(ediOf);
                }
                case 2 -> {
                    poli = poliS.crearPolideportivo();
                    listaEdificios.add(poli);
                }
            }

            System.out.println("(S)Salir ");
            if (sc.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);

        System.out.println(listaEdificios);
        poliS.cantTechados(listaEdificios);
    }

}
