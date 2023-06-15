/*
 */
package Servicies;

import Entities.Electrodomesticos;
import java.util.Scanner;

public class ElectrodomesticosServicio {

    private final Scanner sc;
    private Electrodomesticos elect;

    public ElectrodomesticosServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    /*• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.(precio, color,
    //consumo energético (letras entre A y F) y peso)*/
    public void crearElectrodomestico() {
        elect = new Electrodomesticos();
        double precioBase = 1000;
        System.out.println("precio");
        elect.setPrecio(precioBase + sc.nextDouble());
        System.out.println("peso");
        elect.setPeso(sc.nextDouble());
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
     */
    private void precioConsumo() {
        switch (elect.getConsumo()) {
            case A ->
                elect.setPrecio(elect.getPrecio() + 1000);
            case B ->
                elect.setPrecio(elect.getPrecio() + 800);
            case C ->
                elect.setPrecio(elect.getPrecio() + 600);
            case D ->
                elect.setPrecio(elect.getPrecio() + 500);
            case E ->
                elect.setPrecio(elect.getPrecio() + 300);
            case F ->
                elect.setPrecio(elect.getPrecio() + 100);
        }
    }

    /*PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000*/
    private void precioPeso() {
        double pesoPrecio = 0;
        pesoPrecio = (elect.getPeso() > 0 && elect.getPeso() < 20) ? pesoPrecio + 100 : pesoPrecio;
        pesoPrecio = (elect.getPeso() > 19 && elect.getPeso() < 50) ? pesoPrecio + 500 : pesoPrecio;
        pesoPrecio = (elect.getPeso() > 49 && elect.getPeso() < 80) ? pesoPrecio + 800 : pesoPrecio;
        pesoPrecio = (elect.getPeso() > 79) ? pesoPrecio + 1000 : pesoPrecio;
        elect.setPrecio(pesoPrecio + elect.getPrecio());
    }

    public void precioFinal() {
        precioConsumo();
        precioPeso();
    }
    @Override
    public String toString() {
        return """
               """ + elect;
    }

}
// this.color = (color == null) ? Color.DEFAULT : color;
