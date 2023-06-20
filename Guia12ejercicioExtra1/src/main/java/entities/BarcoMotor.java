/*
• Potencia en CV para barcos a motor.
 */
package entities;

public class BarcoMotor extends Barco {

    protected double potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(double potenciaCV, String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return """
               """
                + "| potenciaCV " + potenciaCV;
    }

}
