/*
 */
package Servicies;

import Entities.Electrodomesticos;
import Enum.Color;
import Enum.Consumo;
import java.util.Scanner;

public class ElectrodomesticosServicio {

    protected Scanner sc;
    protected Electrodomesticos elect;

    public ElectrodomesticosServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.elect = new Electrodomesticos();
    }

    //• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    //usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    //blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    //minúsculas. Este método se invocará al crear el objeto y no será visible.
    private void comprobarColor() {
        System.out.println("colores disponibles");
        for (Color c : Color.values()) {
            System.out.println(c);
        }

        String col = sc.next().toUpperCase();
        if (col.isEmpty()) {
            col = Color.DEFAULT.name();
        }
        boolean verdadero = false;
        for (Color c : Color.values()) {
            if (c.name().equals(col)) {
                verdadero = true;
                break;
            }
        }
        if (verdadero) {
            elect.setColor(Color.valueOf(col));
        } else {
            elect.setColor(elect.getColor());
        }
    }

    //• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    //sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    //objeto y no será visible.
    private void comprobarConsumoEnergetico() {
        System.out.println("consumos energeticos disponibles");
        for (Consumo c : Consumo.values()) {
            System.out.println(c);
        }

        String cons = sc.next().toUpperCase();
        if (cons.isEmpty()) {
            cons = Consumo.DEFAULT.name();
        }
        boolean verdadero = false;
        for (Consumo c : Consumo.values()) {
            if (c.name().equals(cons)) {
                verdadero = true;
                break;
            }
        }
        if (verdadero) {
            elect.setConsumo(Consumo.valueOf(cons));
        } else {
            elect.setConsumo(elect.getConsumo());
        }
    }

    /*• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.(precio, color,
    //consumo energético (letras entre A y F) y peso)*/
    public Electrodomesticos crearElectrodomestico() {
        comprobarColor();
        comprobarConsumoEnergetico();
        double precioBase = 1000;
        System.out.println("precio");
        while (!sc.hasNextDouble()) {
            System.out.println("Debe ingresar precio valido.");
            sc.next();
        }
        double precio = sc.nextDouble();

        elect.setPrecio(precioBase + precio);
        System.out.println("peso");
        while (!sc.hasNextDouble()) {
            System.out.println("Debe ingresar peso valido.");
            sc.next();
        }
        double peso = sc.nextDouble();
        elect.setPeso(peso);
        return elect;
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
    public void precioConsumo() {
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
    public void precioPeso() {
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
