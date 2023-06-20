/*

 */
package egg.guia12ejercicioextra1;

import servicies.BarcoServicio;

public class Guia12ejercicioExtra1 {

    public static void main(String[] args) {

        BarcoServicio bS = new BarcoServicio();
        bS.crearBarco();
        System.out.println(bS.toString());
    }
}
