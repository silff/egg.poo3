/*Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */

package entities;
import Enum.*;

public final class Residencia extends ExtraHoteleros{
    private int cantHabitaciones;
    private Gremio gremio;
    private CampoDep campoDep;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, Gremio gremio, CampoDep campoDep) {
        this.cantHabitaciones = cantHabitaciones;
        this.gremio = gremio;
        this.campoDep = campoDep;
    }

    public Residencia(Privado privado, double m2, String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, Gremio gremio, CampoDep campoDep) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.gremio = gremio;
        this.campoDep = campoDep;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Gremio getGremio() {
        return gremio;
    }

    public void setGremio(Gremio gremio) {
        this.gremio = gremio;
    }

    public CampoDep getCampoDep() {
        return campoDep;
    }

    public void setCampoDep(CampoDep campoDep) {
        this.campoDep = campoDep;
    }

    @Override
    public double precio() {
        double descGremio;
        double adicCampo;
        if (gremio == Gremio.SI) {
            descGremio = 0.2;
        } else descGremio = 1;
        if (campoDep == CampoDep.SI) {
            adicCampo = 20;
        } else adicCampo = 0;
        return super.precio() * descGremio + adicCampo ;
    }

    @Override
    public String toString() {
        return super.toString()
                + """
                """ + "\ncantHabitaciones " + cantHabitaciones +
                ", gremio " + gremio +
                ", campoDep " + campoDep;
    }
}
