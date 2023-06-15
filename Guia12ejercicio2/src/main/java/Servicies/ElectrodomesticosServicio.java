/*
 */
package Servicies;

import Entities.Electrodomesticos;
import java.util.Scanner;

public class ElectrodomesticosServicio {

    private final Scanner sc;
    private final Electrodomesticos elect;

    public ElectrodomesticosServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.elect = new Electrodomesticos();
    }

    /*• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.*/
    public void crearElectrodomestico() {
        double precioBase = 1000;
        System.out.println("precio");
        elect.setPrecio(precioBase + sc.nextDouble());

        System.out.println("peso");

    }

    /*• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    precio. Esta es la lista de precios:
    LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
     */
    @Override
    public String toString() {
        return """
               """ + elect;
    }

}
