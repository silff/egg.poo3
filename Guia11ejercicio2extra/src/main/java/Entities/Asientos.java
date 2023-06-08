/*
 */
package Entities;

public class Asientos {
    
    private int filas;
    private String columnas;
    private boolean ocupado;

    public Asientos() {
    }

    public Asientos(int filas, String columnas, boolean ocupado) {
        this.filas = filas;
        this.columnas = columnas;
        this.ocupado = ocupado;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public String getColumnas() {
        return columnas;
    }

    public void setColumnas(String columnas) {
        this.columnas = columnas;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
}
