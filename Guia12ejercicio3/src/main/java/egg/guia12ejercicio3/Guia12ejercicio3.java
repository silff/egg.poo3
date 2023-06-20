/*
 Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package egg.guia12ejercicio3;

import Entities.Electrodomesticos;
import Servicies.LavadoraServicio;
import Servicies.TelevisorServicio;
import java.util.ArrayList;

public class Guia12ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Electrodomesticos> electrodomesticosList = new ArrayList<>();
        LavadoraServicio lvS;
        TelevisorServicio tvS;

        for (int i = 0; i < 1; i++) {
            lvS = new LavadoraServicio();
            electrodomesticosList.add(lvS.crearLavadora());
            lvS.precioFinal();
        }
        for (int i = 0; i < 1; i++) {
            tvS = new TelevisorServicio();
            electrodomesticosList.add(tvS.crearTelevisor());
            tvS.precioFinal();
        }
        double total = 0;
        for (Electrodomesticos next : electrodomesticosList) {
            System.out.println(next);
            System.out.println(next.getPrecio());
            total += next.getPrecio();
        }
        System.out.println("-------------------------------");
        System.out.println("total productos $" + total);
    }
}
