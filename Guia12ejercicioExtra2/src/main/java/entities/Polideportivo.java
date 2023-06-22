/*
 • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package entities;

import interfaces.EdifcioMetodos;

public class Polideportivo extends Edificio implements EdifcioMetodos {

    private String nombre;
    private String tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Polideportivo(String nombre, String tipo, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "Polideportivo{" + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
    
    
}
