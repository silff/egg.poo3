/*

 */
package egg.guia12ejercicioextra1;

import servicies.AlquilerServicio;
import servicies.BarcoServicio;

public class Guia12ejercicioExtra1 {

    public static void main(String[] args) {

        AlquilerServicio aS = new AlquilerServicio();
        aS.datosAlquiler();
        System.out.println(aS.toString());
    }
}
