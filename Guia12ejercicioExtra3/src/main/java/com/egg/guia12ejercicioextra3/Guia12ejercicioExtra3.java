/* En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package com.egg.guia12ejercicioextra3;

import Enum.Gimnasio;
import entities.*;

import java.util.ArrayList;


public class Guia12ejercicioExtra3 {

    public static void main(String[] args) {

        ArrayList<Alojamiento> listaAlojamiento = new ArrayList<>();
        listaAlojamiento.add(new Hotel4(Gimnasio.A, "A", 45, 50, 100, 10, "A", "A", "A", "A"));
        listaAlojamiento.add(new Hotel4(Gimnasio.B, "A", 20, 25, 50, 5, "B", "B", "B", "B" ));
        listaAlojamiento.add(new Hotel5(2,  5,  10,  Gimnasio.A,  "C",  200,  100,  200,  10,  "C",  "C",  "C",  "C"));
        listaAlojamiento.add(new Hotel5( 3,  8,  15, Gimnasio.NO,  "D",  100,  80,  180,  8,  "D",  "D",  "D",  "D"));
        listaAlojamiento.add(new Camping());
        listaAlojamiento.add(new Camping());
        listaAlojamiento.add(new Residencia());
        listaAlojamiento.add(new Residencia());

        System.out.println(listaAlojamiento);
       
    }
}
