
import Entities.Dni;
import Entities.Persona;

public class PersonaMain {

    public static void main(String[] args) {
        Dni dni = new Dni();
        dni.setDni(2222222);
        dni.setLetra("L");
        System.out.println(dni.getDni() + dni.getLetra());

        Persona persona = new Persona();
        persona.setNombre("sil ");
        persona.setApellido("fapp ");
        persona.setDni(dni);
        System.out.print(persona.getNombre() + persona.getApellido()
                + persona.getDni().getDni() + persona.getDni().getLetra());
    }

}
