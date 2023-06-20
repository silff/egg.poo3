/*

 */
package servicies;

import entities.Velero;
import java.util.Scanner;

public class VeleroServicio extends BarcoServicio {

    private final Velero velero;
    private final Scanner sc;

    public VeleroServicio() {
        this.velero = new Velero();
        this.sc = new Scanner(System.in).useDelimiter("\n");

    }

    public Velero crearVelero() {
        crearBarco();
        System.out.println("mastiles");
        int mastiles = sc.nextInt();
        velero.setMastiles(mastiles);
        return velero;
    }

    @Override
    public String toString() {
        return super.toString()
                + """
               """ + velero;
    }

}
