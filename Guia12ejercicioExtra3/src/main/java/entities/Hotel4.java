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

    /*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) 
    + (valor agregado por gimnasio) /// + (valor agregado por limosinas).
    Donde:
    Valor agregado por el restaurante:
    • $10 si la capacidad del restaurante es de menos de 30 personas.
    • $30 si está entre 30 y 50 personas.
    • $50 si es mayor de 50.
    Valor agregado por el gimnasio:
    • $50 si el tipo del gimnasio es A.
    • $30 si el tipo del gimnasio es B.
    Valor agregado por las limosinas:
    • $15 por la cantidad de limosinas del hotel.*/
    @Override
    public double precio() {
        double pR;
        if (capacidadRest < 30 && capacidadRest > 0) {
            pR = 10;
        } else if (capacidadRest >= 30 && capacidadRest < 50) {
            pR = 30;
        } else if (capacidadRest >= 50) {
            pR = 50;
        } else {
            pR = 0;
        }
        return super.precio() + gimnasio.calcular() + pR;
    }

    @Override
    public String toString() {
        return super.toString()
                + """
                 """ + "\ngimnasio " + gimnasio + ", Restaurante " + Restaurante
                + ", capacidad Rest " + capacidadRest;
    }

}
