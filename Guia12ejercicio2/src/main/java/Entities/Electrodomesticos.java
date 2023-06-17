/*Crear una superclase llamada Electrodoméstico con los siguientes atributos:
 */
package Entities;

import Enum.Color;
import Enum.Consumo;
import java.util.Scanner;

public class Electrodomesticos {

    private Scanner sc;
    //precio, color,
    //consumo energético (letras entre A y F) y peso.
    private double precio;
    private Color color;
    private Consumo consumo;
    private double peso;

    //Los constructores que se deben implementar son los siguientes:
    //• Un constructor vacío.
    //• Un constructor con todos los atributos pasados por parámetro.
    public Electrodomesticos() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Electrodomesticos(double precio, Color color, Consumo consumo, double peso) {
        this.precio = precio;
        this.color = (color == null) ? Color.DEFAULT : color;
        this.consumo = (consumo == null) ? Consumo.DEFAULT : consumo;
        this.peso = peso;
    }

    //Los métodos a implementar son:
    //• Métodos getters y setters de todos los atributos.
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = (color == null) ? Color.DEFAULT : color;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    //• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    //sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    //objeto y no será visible.
    public void setConsumo(Consumo consumo) {
        this.consumo = (consumo == null) ? Consumo.DEFAULT : consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return """
                      Electrodomestico
               """
                + "color " + color + "| consumo " + consumo + "| peso " + peso + "| precio " + precio;
    }
}
