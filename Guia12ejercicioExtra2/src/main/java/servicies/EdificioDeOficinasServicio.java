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
        edOf.setAncho(ancho);
        System.out.println("largo");
        double largo = sc.nextDouble();
        edOf.setLargo(largo);
        System.out.println("alto");
        double alto = sc.nextDouble();
        edOf.setAlto(alto);
        int cantOf = cantidadOficinas();
        System.out.println("cuantas personas entran por oficina");
        int cantPers = sc.nextInt();
        int cantPe = cantPersonas(cantPers);
        int cantPisos = cantidadPisos();

        return edOf = new EdificioDeOficinas(cantOf, cantPe,
                cantPisos, ancho, alto, largo);
    }

    //cantidad de personas por oficina(30 mt2 c/u) / total del edificio
    public int cantPersonas(int cantPersonas) {
        return (int) cantPersonas * cantidadOficinas() * cantidadPisos();
    }

    //altura minima techo 2.5 mts
    public int cantidadPisos() {
        return (int) (edOf.getAlto() / 2.5);
    }

    //oficinas x piso c/u 30 mts2
    public int cantidadOficinas() {
        return (int) edOf.calcularSuperficie() / 30;
    }

    @Override
    public String toString() {
        return """
               """ + edOf;
    }

}
