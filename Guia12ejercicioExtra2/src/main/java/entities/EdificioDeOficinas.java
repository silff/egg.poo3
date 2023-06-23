/*
 • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
package entities;

public class EdificioDeOficinas extends Edificio {

    private int numeroOficinas;
    private int cantidadPersonas;
    private int pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroOficinas, int cantidadPersonas, int pisos) {
        this.numeroOficinas = numeroOficinas;
        this.cantidadPersonas = cantidadPersonas;
        this.pisos = pisos;
    }

    public EdificioDeOficinas(int numeroOficinas, int cantidadPersonas, int pisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantidadPersonas = cantidadPersonas;
        this.pisos = pisos;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nvol total " + calcularVolumen()
                + "\nsup total " + calcularSuperficie()
                + """
                   Edificio Oficinas
                 """
                + "Oficinas por piso " + numeroOficinas
                + "\npisos " + pisos + "\ntotal oficinas " + pisos * numeroOficinas
                + "\ntotal personas edificio " + cantidadPersonas;
    }
}
