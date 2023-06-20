/*
 
 */
package servicies;

import entities.Cliente;
import java.util.Scanner;

public class ClienteServicio {

    private final Scanner sc;
    private final Cliente cliente;

    public ClienteServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.cliente = new Cliente();

    }

    public Cliente crearCliente() {
        System.out.println("nombre");
        cliente.setNombre(sc.next());
        System.out.println("dni");
        cliente.setDni(sc.nextLong());
        return cliente;

    }

    @Override
    public String toString() {
        return """
               """ + cliente;
    }

}
