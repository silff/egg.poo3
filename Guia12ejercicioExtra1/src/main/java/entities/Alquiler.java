/*
Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
package entities;

import java.time.LocalDate;

public class Alquiler {

    private Cliente cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int posAmarre;
    private Barco barco;

    public Alquiler() {
        this.cliente = new Cliente();
        this.barco = new Barco();
    }

    public Alquiler(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin, int posAmarre, Barco barco) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return """
               """ + cliente + "\nfechaInicio " + fechaInicio + "\nfechaFin "
                + fechaFin + "\npos amarre " + posAmarre;
    }

}
