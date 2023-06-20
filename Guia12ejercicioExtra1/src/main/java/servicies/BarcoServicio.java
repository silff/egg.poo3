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
        //String opcion;
        // do {
        barco = new Barco();
        System.out.println("ingrese matricula");
        String matricula = sc.next();
        barco.setMatricula(matricula);
        System.out.println("ingrese eslora");
        int eslora = sc.nextInt();
        barco.setEslora(eslora);
        System.out.println("ingrese el año");
        int anio = sc.nextInt();
        barco.setAnio(anio);

//        System.out.println("quiere ingresar otro?");
//        opcion = sc.next();
        // } while (opcion.equalsIgnoreCase("si"));
        return barco;
    }

//    @Override
//    public String toString() {
//
//        String sb = "";
//        System.out.println("BARCOS");
//        for (Barco barco1 : barcos) {
//            sb += (barco1.toString() + "\n");
//        }
//        return sb;
//
//    }
    @Override
    public String toString() {
        return """
               barco
               """ + barco;
    }

}
