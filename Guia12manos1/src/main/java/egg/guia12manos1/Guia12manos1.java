/*
 
 */
package egg.guia12manos1;

import Entities.Animal;
import Entities.Gato;
import Entities.Perro;
import java.util.ArrayList;

public class Guia12manos1 {

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Animal());
        animales.add(new Perro());
        animales.add(new Gato());

        for (Animal animal : animales) {
            animal.hacerRuido();
        }
    }
}
