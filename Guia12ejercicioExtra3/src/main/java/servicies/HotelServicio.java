/*
 
 */
package servicies;

import entities.Hotel;
import java.util.Scanner;

public class HotelServicio {

    private Scanner sc;
    private Hotel hotel;

    public HotelServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.hotel = new Hotel();

    }

    public double precio() {

        return hotel.precio() + 50;
    }
}
