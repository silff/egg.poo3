/*
 */
package servicies;

import entities.BarcoMotor;
import java.util.Scanner;

public class BarcoMotorServicio extends BarcoServicio {

    private final BarcoMotor bm;
    private final Scanner sc;

    public BarcoMotorServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.bm = new BarcoMotor();

    }

    public BarcoMotor crearBarcoMotor() {
        crearBarco();
        System.out.println("Ptencia motor");
        bm.setPotenciaCV(sc.nextInt());
        return bm;
    }

    @Override
    public String toString() {
        return """
               """ + "bm" + bm;
    }

}
