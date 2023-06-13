/*

 */

package egg.guia12ejercicio1;

import Entities.Animal;

public class Guia12ejercicio1 {

    public static void main(String[] args) {
     
        Animal gatoAnimal = new Animal("michi", "leche", 5, "siames");
        gatoAnimal.alimento();
        
        Animal perroAnimal = new Animal("boby", "carne", 4, "dogo");
        perroAnimal.alimento();
        
        Animal caballoAnimal = new Animal("relampago", "alfalfa", 10, "alazan");
        caballoAnimal.alimento();
    }
}
