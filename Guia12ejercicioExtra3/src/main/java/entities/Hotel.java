/*
 La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
 */
package entities;

public abstract class Hotel extends Alojamiento {

    protected int habitaciones;
    protected int camas;
    protected int pisos;

    public Hotel() {
    }

    public Hotel(int habitaciones, int camas, int pisos) {
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
    }

    public Hotel(int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
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

    /*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
    PrecioHabitación = $50 + ($1 x capacidad del hotel) ////+ (valor agregado por restaurante) 
    + (valor agregado por gimnasio) + (valor agregado por limosinas).*/
    @Override
    public double precio() {
        return 50 + camas;
    }

    @Override
    public String toString() {
        return super.toString()
                + """
                """ + "\nhabitaciones " + habitaciones + ", camas " + camas + ", pisos " + pisos;
    }
}
