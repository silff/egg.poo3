/*
 */
package Entities;

public class Asientos {

    private int filas;
    private char columnas;
    private boolean ocupado;

    public Asientos() {
    }

    public Asientos(int filas, char columnas) {
        this.filas = filas;
        this.columnas = columnas;
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

    public void setColumnas(char columnas) {
        this.columnas = columnas;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return  filas + " " + columnas;
    }

}
