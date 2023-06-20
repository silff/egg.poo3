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
    private BarcoMotor barcoMotor;
    private Velero velero;
    private Yate yate;

    public Alquiler() {
        this.cliente = new Cliente();
        this.barcoMotor = new BarcoMotor();
        this.velero = new Velero();
        this.yate = new Yate();
    }

    public Alquiler(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin, int posAmarre, BarcoMotor barcoMotor, Velero velero, Yate yate) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posAmarre = posAmarre;
        this.barcoMotor = barcoMotor;
        this.velero = velero;
        this.yate = yate;
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

    public BarcoMotor getBarcoMotor() {
        return barcoMotor;
    }

    public void setBarcoMotor(BarcoMotor barcoMotor) {
        this.barcoMotor = barcoMotor;
    }

    public Velero getVelero() {
        return velero;
    }

    public void setVelero(Velero velero) {
        this.velero = velero;
    }

    public Yate getYate() {
        return yate;
    }

    public void setYate(Yate yate) {
        this.yate = yate;
    }

    @Override
    public String toString() {
        return """
               """ + cliente + "\nfechaInicio " + fechaInicio + "\nfechaFin "
                + fechaFin + "\npos amarre " + posAmarre;
    }

}
