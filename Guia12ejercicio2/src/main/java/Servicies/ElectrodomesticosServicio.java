/*
 */
package Servicies;

import Entities.Electrodomesticos;
import Enum.Color;
import java.util.Arrays;
import java.util.Scanner;

public class ElectrodomesticosServicio {

    private final Scanner sc;
    private Electrodomesticos elect;

    public ElectrodomesticosServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.elect = new Electrodomesticos();
    }

    //• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    //usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    //blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    //minúsculas. Este método se invocará al crear el objeto y no será visible.
    public void comprobarColor() {
        do {
            System.out.println("colores disponibles");
            for (Color c : Color.values()) {
                System.out.println(c);
            }

            boolean colorValido = false;
            String color = sc.next().toUpperCase();

            for (Color c : Color.values()) {
                if (c.name().equals(color)) {
                    colorValido = true;
                    break;
                }
            }
            if (!colorValido) {
                System.out.println("color no valido - volver a seleccionar");
            } else if (color == null) {
                elect.setColor(elect.getColor());
            } else {
                elect.setColor(Color.valueOf(color));
            }

        } while (true);

    }
    //• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    //sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    //objeto y no será visible.

    /*• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.*/
    public void crearElectrodomestico() {
        double precioBase = 1000;
        System.out.println("precio");
        elect.setPrecio(precioBase + sc.nextDouble());
        System.out.println("color");
        comprobarColor();
        System.out.println("consumo");

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
