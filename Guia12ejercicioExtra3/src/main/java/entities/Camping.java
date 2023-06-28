/*Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. */
package entities;

import Enum.Privado;
import Enum.Restaurante;

public final class Camping extends ExtraHoteleros {

    private int capacidadCarpas;
    private Restaurante restaurante;

    public Camping() {
    }

    public Camping(int capacidadCarpas, Restaurante restaurante) {
        this.capacidadCarpas = capacidadCarpas;
        this.restaurante = restaurante;
    }

    public Camping(int capacidadCarpas, Restaurante restaurante, Privado privado, double m2) {
        super(privado, m2);
        this.capacidadCarpas = capacidadCarpas;
        this.restaurante = restaurante;
    }

    public Camping(int capacidadCarpas, Restaurante restaurante, Privado privado, double m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.restaurante = restaurante;
    }

    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Privado getPrivado() {
        return privado;
    }

    public void setPrivado(Privado privado) {
        this.privado = privado;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override //precios inventados // no los daban //asimilo carpa a habitacion
    public double precio() {
        double pR;
        if (restaurante == Restaurante.SI) {
            pR = 30;
        } else {
            pR = 0;
        }
        return super.precio() + pR;
    }

    @Override
    public String toString() {
        return super.toString()
                + """
                  """ + "\ncapacidadCarpas " + capacidadCarpas + ", restaurante " + restaurante;
    }

}
