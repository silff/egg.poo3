/*Crear una superclase llamada Electrodoméstico con los siguientes atributos:
 */
package Entities;

import Enum.Color;
import Enum.Consumo;

public class Electrodomesticos {

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
    }

    public Electrodomesticos(double precio, Color color, Consumo consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
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

    //• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    //usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    //blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    //minúsculas. Este método se invocará al crear el objeto y no será visible.
    public void setColor(Color color) {
        if (color == null) {
            this.color = Color.DEFAULT;
        } else {
            this.color = color;
        }
    }

    public Consumo getConsumo() {
        return consumo;
    }

    //• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    //sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    //objeto y no será visible.
    public void setConsumo(Consumo consumo) {
        if (consumo == null) {
            this.consumo = Consumo.DEFAULT;
        } else {
            this.consumo = consumo;
        }
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
                      Electrodomesticos
               """
                + "precio " + precio + "| color " + color + "| consumo " + consumo + "| peso " + peso;
    }
}
