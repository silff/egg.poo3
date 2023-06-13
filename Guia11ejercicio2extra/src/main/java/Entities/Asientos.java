/*
 */
package Entities;

public class Asientos {

    private int fila;
    private char columna;
    private boolean ocupado;

    public Asientos() {
    }

    public Asientos(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public Asientos(int fila, char columna, boolean ocupado) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = ocupado;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumnas(char columna) {
        this.columna = columna;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return fila + " " + columna;
    }

}
