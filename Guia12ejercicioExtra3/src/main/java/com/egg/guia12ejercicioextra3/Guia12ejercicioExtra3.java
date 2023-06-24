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
import entities.Hotel4;
import servicies.HotelServicio;

public class Guia12ejercicioExtra3 {

    public static void main(String[] args) {

        Hotel4 hotel4 = new Hotel4();
        HotelServicio hotelS = new HotelServicio();

        System.out.println("");
        hotel4.setNombre("Paraiso");
        hotel4.setDireccion("Av Sauces");
        hotel4.setLocalidad("olivos");
        hotel4.setGerente("juan");
        hotel4.setHabitaciones(10);
        hotel4.setCamas(100);
        hotel4.setPisos(5);
        hotel4.setGimnasio(Gimnasio.A);
        hotel4.setRestaurante("el diente");
        hotel4.setCapacidadRest(30);
       

        System.out.println(hotel4);
       
    }
}
