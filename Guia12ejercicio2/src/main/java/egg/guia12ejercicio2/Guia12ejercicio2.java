/*
 
 */
package egg.guia12ejercicio2;

import Servicies.ElectrodomesticosServicio;

public class Guia12ejercicio2 {

    public static void main(String[] args) {

        ElectrodomesticosServicio nuevo = new ElectrodomesticosServicio();
        nuevo.crearElectrodomestico();
        nuevo.precioFinal();
        System.out.println(nuevo);

    }
}
