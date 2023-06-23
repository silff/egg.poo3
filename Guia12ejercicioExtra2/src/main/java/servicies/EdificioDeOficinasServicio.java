/*De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package servicies;

import entities.EdificioDeOficinas;
import java.util.Scanner;

public class EdificioDeOficinasServicio {

    private final Scanner sc;
    private EdificioDeOficinas edOf;

    public EdificioDeOficinasServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.edOf = new EdificioDeOficinas();
    }

    public EdificioDeOficinas crearEdificioDeOficinas() {
        System.out.println("ancho");
        double ancho = sc.nextDouble();
        System.out.println("largo");
        double largo = sc.nextDouble();
        System.out.println("alto");
        double alto = sc.nextDouble();
        int cantPisos = cantidadPisos();
        int cantOf = cantidadOficinas();
        int cantPers = cantPersonas();
        edOf.setCantidadPersonas(cantPersonas());

        return edOf = new EdificioDeOficinas(cantOf, cantPers,
                cantPisos, ancho, alto, largo);
    }

    //cantidad de personas por oficina(30 mt2 c/u) / 
    public int cantPersonas() {
        System.out.println("cuantas personas entran por oficina");
        int cantPersonas = sc.nextInt();
        int calculoPersonas = (int) cantPersonas * cantidadOficinas();
        return calculoPersonas * cantidadPisos();
    }

    //altura minima techo 2.5 mts
    public int cantidadPisos() {
        int cantPisos = (int) (edOf.getAlto() / 2.5);
        return cantPisos;
    }

    //oficinas x piso c/u 30 mts2
    public int cantidadOficinas() {
        int cantOfic = (int) edOf.calcularSuperficie() / 30;
        return cantOfic;
    }

    @Override
    public String toString() {
        return """
               EdificioDeOficinasServicio
               """ + edOf;
    }

}
