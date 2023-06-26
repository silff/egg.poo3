/*En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. */
package entities;

import Enum.Privado;

public abstract class ExtraHoteleros extends Alojamiento {
    
    protected Privado privado;
    protected double m2;

    public ExtraHoteleros() {
    }

    public ExtraHoteleros(Privado privado, double m2) {
        this.privado = privado;
        this.m2 = m2;
    }

    public ExtraHoteleros(Privado privado, double m2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.m2 = m2;
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

    /*/*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
    PrecioHabitación = $50 + ($1 x capacidad del hotel) ////+ (valor agregado por restaurante) 
    + (valor agregado por gimnasio) + (valor agregado por limosinas).*/
    @Override
    public double precio() {
      return 50;
    }

    @Override
    public String toString() {
        return "ExtraHoteleros{" + "privado=" + privado + ", m2=" + m2 + '}';
    }
    
    
}
