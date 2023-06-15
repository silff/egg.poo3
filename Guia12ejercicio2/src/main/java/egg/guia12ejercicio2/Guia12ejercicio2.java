/*
 
 */
package egg.guia12ejercicio2;

import Servicies.ElectrodomesticosServicio;
import Servicies.LavadoraServicio;

public class Guia12ejercicio2 {

    public static void main(String[] args) {

        ElectrodomesticosServicio nuevo = new ElectrodomesticosServicio();
        LavadoraServicio l1 =  new LavadoraServicio();
       l1.crearElectrodomestico();
        System.out.println(l1);

    }
}
