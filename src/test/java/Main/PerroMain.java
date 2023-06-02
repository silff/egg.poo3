/*hora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/

package Main;

import Entities.Perro;

import Entities.PersonaPerro;

public class PerroMain {

    public static void main(String[] args) {
        
        PersonaPerro[] p1 = new PersonaPerro[2];
        Perro[] perro = new Perro[2];
        
        
        p1[0] = new PersonaPerro("A", "A", 20, 2222222, null );   
        p1[1] = new PersonaPerro("B", "B", 23, 222222, null);
        
        perro[0] = new Perro("chiquito", "dogo", 10, "grande");
        perro[1] = new Perro("bob", "doberman", 5, "mediano");
        
        for (int i = 0; i < 2; i++) {
            p1[i].setPerro(perro[i]);
        }
        
        for (PersonaPerro aux : p1) {
            System.out.println(aux);
        }
    }
    
}
