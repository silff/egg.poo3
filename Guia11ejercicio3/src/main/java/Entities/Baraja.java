/*La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
 */
package Entities;

import java.util.ArrayList;

public class Baraja {

    private ArrayList<Cartas> c;

    public Baraja() {
        this.c = new ArrayList<>();
    }

    public Baraja(ArrayList<Cartas> c) {
        this.c = c;
    }

    public ArrayList<Cartas> getC() {
        return c;
    }

    public void setC(ArrayList<Cartas> c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Baraja" + c;
    }

    
}
