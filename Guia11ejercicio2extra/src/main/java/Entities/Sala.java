/* 
Para representar la sala con los espectadores vamos a utilizar una matriz. Los
asientos son etiquetados por una letra y un número la fila A1 empieza al final
del mapa como se muestra en la tabla. También deberemos saber si el asiento está 
ocupado por un espectador o no, si esta ocupado se muestra una X, sino un espacio 
vacío.

8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
 */
package Entities;

public class Sala {

    private int filas;
    private int columnas;
    private Asientos[][] sala;

    public Sala() {

    }

    public Sala(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.sala = new Asientos[filas][columnas];
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public Asientos[][] getSala() {
        return sala;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = filas - 1; i >= 0; i--) {
            for (int j = 0; j < columnas; j++) {
                sb.append(sala[i][j].toString());
                if (j < columnas - 1) {
                    sb.append(" | ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
