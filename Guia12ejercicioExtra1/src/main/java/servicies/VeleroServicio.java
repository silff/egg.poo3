/*

 */
package servicies;

import entities.Barco;
import entities.Velero;
import java.util.Scanner;

public class VeleroServicio extends BarcoServicio {

    private final Barco barco;
    private Velero velero;
    private final Scanner sc;

    public VeleroServicio() {
        this.barco = new Barco();
        this.velero = new Velero();
        this.sc = new Scanner(System.in).useDelimiter("\n");

    }

    public Velero crearVelero() {
        crearBarco();
        System.out.println("mastiles");
        int mastiles = sc.nextInt();
        velero.setMastiles(mastiles);
        return velero = new Velero(mastiles, barco.getMatricula(),
                barco.getEslora(), barco.getAnio());
    }

    @Override
    public String toString() {
        return """
               """ + "velero" + velero;
    }

}
