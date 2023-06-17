/*
 A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
 */
package Entities;

import Enum.Color;
import Enum.Consumo;

public class Lavadora extends Electrodomesticos {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, Color color, Consumo consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return """
               
               Lavadora              
               """ + "carga " + carga;
    }

}
