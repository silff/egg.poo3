/*
 */
package servicies;

import entities.Barco;
import entities.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class PuertoServicio {
    private final Scanner sc;
    private ArrayList<Barco> barcos;
    private final ArrayList<Cliente> clientes;
    
    public PuertoServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.barcos = new ArrayList();
        this.clientes = new ArrayList();
    }
    
    public void listaCliente() {
        
    }
}
