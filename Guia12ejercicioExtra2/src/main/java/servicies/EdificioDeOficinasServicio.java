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
    private final EdificioDeOficinas edOf;

    public EdificioDeOficinasServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.edOf = new EdificioDeOficinas();
    }

    public EdificioDeOficinas crearEdificioDeOficinas() {
        System.out.println("ancho");
        edOf.setAncho(sc.nextDouble());
        System.out.println("largo");
        edOf.setLargo(sc.nextDouble());
        System.out.println("alto");
        edOf.setAlto(sc.nextDouble());
        System.out.println("cantidad de pisos");
        //int cantidad = sc.nextInt();
        edOf.setPisos(cantidadPisos());
        edOf.setNumeroOficinas(cantidadPisos());
        edOf.setCantidadPersonas(cantPersonas());
        return edOf;
    }

    //cantidad de personas por metro cuadrado
    public int cantPersonas() {
        System.out.println("cuantas personas entran por metro caudrado");
        int cantPersonas = sc.nextInt();
        int calculoPersonas = (int) edOf.calcularSuperficie() / cantPersonas;
        return calculoPersonas * cantidadPisos();
    }

    public int cantidadPisos() {
        int cantPisos = (int) edOf.getAlto() / 3;
        return cantPisos;
    }

    @Override
    public String toString() {
        return """
               EdificioDeOficinasServicio
               """ + ", edOf " + edOf;
    }

}
