/*
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. 
 */
package servicies;

import emun.Techo;
import entities.Edificio;
import entities.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

public class PolideportivoServicio {

    private final Scanner sc;
    private Polideportivo poli;

    public PolideportivoServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.poli = new Polideportivo();
    }

    public Polideportivo crearPolideportivo() {
        System.out.println("ancho");
        double ancho = sc.nextDouble();
        System.out.println("largo");
        double largo = sc.nextDouble();
        System.out.println("alto");
        double alto = sc.nextDouble();
        System.out.println("nombre");
        String nombre = sc.next();
        System.out.println("techo?");
        Techo techadoTecho = Techo.ABIERTO;
        if (sc.next().equalsIgnoreCase("si")) {
            techadoTecho = Techo.TECHADO;
        } else {
        }
        return poli = new Polideportivo(nombre, techadoTecho, ancho, largo, alto);
    }

    public void cantTechados(ArrayList<Edificio> listaEdificios) {
        int tech = 0;
        int ab = 0;
        for (Edificio listaEdificio : listaEdificios) {
            if (listaEdificio instanceof Polideportivo pol) {
                if (pol.getTecho() == Techo.TECHADO) {
                    tech++;
                } else {
                    ab++;
                }
            }
        }
        System.out.println("polideportivos: ");
        System.out.println("techados " + tech + " abiertos " + ab);
    }

    @Override
    public String toString() {
        return """
               """ + poli;
    }

}
