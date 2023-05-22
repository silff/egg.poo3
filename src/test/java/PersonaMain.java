
import Entities.Dni;
import Entities.Persona;


public class PersonaMain {

    public static void main(String[] args) {
        Dni dni = new Dni();
        dni.setDni(25228070);
        dni.setLetra("L");
        System.out.println(dni);
        
        Persona persona = new Persona();
        persona.setNombre("sil");
        persona.setApellido("fapp");
        persona.setDni(dni);
        System.out.print(persona);
    }
    
}
