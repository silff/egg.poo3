/*La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
 */
package Entities;

import java.util.Arrays;

public class Baraja {

    private Cartas[] c;
    private int mazo = 48;

    public Baraja() {
        c = new Cartas[mazo];
    }

    public Baraja(Cartas[] c, int mazo) {
        this.c = c;
        this.mazo = mazo;
    }

    public Cartas[] getC() {
        return c;
    }

    public void setC(Cartas[] c) {
        this.c = c;
    }

    public int getMazo() {
        return mazo;
    }

    public void setMazo(int mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return Arrays.toString(c);
    }

}
