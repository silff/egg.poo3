/*
 */
package servicies;

import entities.Barco;
import java.util.Scanner;

public class BarcoServicio {

    private Barco barco;
    private final Scanner sc;

    public BarcoServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.barco = new Barco();
    }

    public Barco crearBarco() {
        System.out.println("ingrese matricula");
        String matricula = sc.next();
        barco.setMatricula(matricula);
        System.out.println("ingrese eslora");
        int eslora = sc.nextInt();
        barco.setEslora(eslora);
        System.out.println("ingrese el año");
        int anio = sc.nextInt();
        barco.setAnio(anio);

        return barco = new Barco(matricula, eslora, anio);
    }

    @Override
    public String toString() {
        return """
               """ + barco;
    }

}
