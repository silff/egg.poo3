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
        comprobarColor();
        comprobarConsumoEnergetico();

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
            setColor(Color.valueOf(col));
        } else {
            setColor(getColor());
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
            setConsumo(Consumo.valueOf(cons));
        } else {
            setConsumo(getConsumo());
        }
    }

    @Override
    public String toString() {
        return """
                      Electrodomesticos
               """
                + "precio " + precio + "| color " + color + "| consumo " + consumo + "| peso " + peso;
    }
}
