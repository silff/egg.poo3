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

import Enum.*;
import entities.*;

import java.util.ArrayList;
import java.util.Comparator;

public class Guia12ejercicioExtra3 {

    public static void main(String[] args) {

        ArrayList<Alojamiento> listaAlojamiento = new ArrayList<>();
        listaAlojamiento.add(new Hotel4(Gimnasio.A, "A", 45, 50, 100, 10, "A", "A", "A", "A"));
        listaAlojamiento.add(new Hotel4(Gimnasio.B, "A", 20, 25, 50, 5, "B", "B", "B", "B"));
        listaAlojamiento.add(new Hotel5(2, 5, 10, Gimnasio.A, "C", 200, 100, 200, 10, "C", "C", "C", "C"));
        listaAlojamiento.add(new Hotel5(3, 8, 15, Gimnasio.NO, "D", 100, 80, 180, 8, "D", "D", "D", "D"));
        listaAlojamiento.add(new Camping(200, Restaurante.NO, Privado.NO, 2000, "E", "E", "E", "E"));
        listaAlojamiento.add(new Camping(150, Restaurante.SI, Privado.SI, 1500, "F", "F", "F", "F"));
        listaAlojamiento.add(new Residencia(Privado.SI, 5000, "G", "G", "G", "G", 200, Gremio.SI, CampoDep.NO));
        listaAlojamiento.add(new Residencia(Privado.NO, 5000, "H", "H", "H", "H", 300, Gremio.SI, CampoDep.SI));

        System.out.println(listaAlojamiento);

        System.out.println("----------------------------------");

        listaAlojamiento.stream()
                .filter(a -> a instanceof Hotel)
                .sorted(Comparator.comparingDouble(a -> ((Hotel) a).precio()).reversed())
                .forEach(System.out::println);

        System.out.println("--------------------------------------");

        listaAlojamiento.stream()
                .filter(a -> a instanceof Camping)
                .map(a -> (Camping) a)
                .filter(a -> a.getRestaurante() == Restaurante.SI)
                .forEach(System.out::println);

        System.out.println("------------------------------------------");

        listaAlojamiento.stream()
                .filter(a -> a instanceof Residencia)
                .map(a -> (Residencia) a)
                .filter(a -> a.getGremio() == Gremio.SI)
                .forEach(System.out::print);
    }
}
