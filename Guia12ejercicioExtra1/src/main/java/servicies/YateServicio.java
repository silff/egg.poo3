/* 
 */
package servicies;

import entities.Yate;
import java.util.Scanner;

public class YateServicio extends BarcoMotorServicio {

    private final Scanner sc;
    private final Yate yate;

    public YateServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.yate = new Yate();
    }

    public Yate crearYate() {
        crearBarcoMotor();
        System.out.println("camarotes");
        yate.setCamarotes(sc.nextInt());
        return yate;
    }

    @Override
    public double moduloBarco() {
        return super.moduloBarco() + yate.getCamarotes();
    }

    @Override
    public String toString() {
        return super.toString()
                + """
               """ + yate;
    }

}
