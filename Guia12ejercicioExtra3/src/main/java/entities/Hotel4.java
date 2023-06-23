/*
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
package entities;

import Enum.Gimnasio;

public class Hotel4 extends Hotel {

    protected Gimnasio gimnasio;
    protected String Restaurante;
    protected int capacidadRest;

    public Hotel4() {
    }

    public Hotel4(Gimnasio gimnasio, String Restaurante, int capacidadRest) {
        this.gimnasio = gimnasio;
        this.Restaurante = Restaurante;
        this.capacidadRest = capacidadRest;
    }

    public Hotel4(Gimnasio gimnasio, String Restaurante, int capacidadRest, int habitaciones, int camas, int pisos) {
        super(habitaciones, camas, pisos);
        this.gimnasio = gimnasio;
        this.Restaurante = Restaurante;
        this.capacidadRest = capacidadRest;
    }

    public Hotel4(Gimnasio gimnasio, String Restaurante, int capacidadRest, int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.Restaurante = Restaurante;
        this.capacidadRest = capacidadRest;
    }

    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getRestaurante() {
        return Restaurante;
    }

    public void setRestaurante(String Restaurante) {
        this.Restaurante = Restaurante;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "gimnasio=" + gimnasio + ", Restaurante=" + Restaurante + ", capacidadRest=" + capacidadRest + '}';
    }

}
