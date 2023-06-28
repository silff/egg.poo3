/*• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
 */
package entities;

import Enum.Gimnasio;

public final class Hotel5 extends Hotel4 {

    private int salonConferencia;
    private int suites;
    private int limosinas;

    public Hotel5() {
    }

    public Hotel5(int salonConferencia, int suites, int limosinas) {
        this.salonConferencia = salonConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Hotel5(int salonConferencia, int suites, int limosinas, Gimnasio gimnasio, String Restaurante, int capacidadRest) {
        super(gimnasio, Restaurante, capacidadRest);
        this.salonConferencia = salonConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Hotel5(int salonConferencia, int suites, int limosinas, Gimnasio gimnasio, String Restaurante, int capacidadRest, int habitaciones, int camas, int pisos) {
        super(gimnasio, Restaurante, capacidadRest, habitaciones, camas, pisos);
        this.salonConferencia = salonConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Hotel5(int salonConferencia, int suites, int limosinas, Gimnasio gimnasio, String Restaurante, int capacidadRest, int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, Restaurante, capacidadRest, habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
        this.salonConferencia = salonConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public int getSalonConferencia() {
        return salonConferencia;
    }

    public void setSalonConferencia(int salonConferencia) {
        this.salonConferencia = salonConferencia;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(int limosinas) {
        this.limosinas = limosinas;
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

    public String getDireccionString() {
        return direccion;
    }

    public void setDireccionString(String direccion) {
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
    + (valor agregado por gimnasio) + (valor agregado por limosinas).*/
    @Override
    public double precio() {
        return super.precio() + limosinas * 15;
    }

    @Override
    public String toString() {
        return super.toString()
        + """
          """ + "\nsalonConferencia " + salonConferencia + ", suites " + suites + ", limosinas " +
            + limosinas;
    }

}
