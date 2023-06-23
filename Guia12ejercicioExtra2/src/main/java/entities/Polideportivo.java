/*
 • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package entities;

import emun.Techo;

public class Polideportivo extends Edificio {

    private String nombre;
    private Techo techo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, Techo techo) {
        this.nombre = nombre;
        this.techo = techo;
    }

    public Polideportivo(String nombre, Techo techo, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techo = techo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Techo getTecho() {
        return techo;
    }

    public void setTecho(Techo techo) {
        this.techo = techo;
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
        return """
                 Polideportivo
               """ + super.toString()
                + "\nvol total " + calcularVolumen()
                + "\nsup total " + calcularSuperficie()
                + "\nnombre " + nombre
                + "\ntipo " + techo;
    }
}
