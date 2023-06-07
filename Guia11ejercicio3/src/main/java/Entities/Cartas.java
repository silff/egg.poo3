/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene 
un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos,
oros y copas). Esta clase debe contener un método toString() que retorne el número
de carta y el palo. 
 */
package Entities;

import Enum.Palo;

public class Cartas {

    int numero;
    Palo palo;

    public Cartas(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        
        return """
               
               """ + numero + " " + palo;

    }

}
