/*
 Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package egg.guia12ejercicio2;

import Servicies.LavadoraServicio;
import Servicies.TelevisorServicio;

public class Guia12ejercicio2 {

    public static void main(String[] args) {

        LavadoraServicio l1 = new LavadoraServicio();
        l1.crearLavadora();
        l1.precioFinal();

        TelevisorServicio t1 = new TelevisorServicio();
        t1.crearTelevisor();
        t1.precioFinal();

        System.out.println(l1);
        System.out.println(t1);

    }
}
