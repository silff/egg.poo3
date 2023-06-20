/*
 • Potencia en CV y número de camarotes para yates de lujo.
 */
package entities;

public class Yate extends BarcoMotor {

    protected int camarotes;

    public Yate() {
    }

    public Yate(int camarotes) {
        this.camarotes = camarotes;
    }

    public Yate(int camarotes, double potenciaCV, String matricula, double eslora, int anio) {
        super(potenciaCV, matricula, eslora, anio);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
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
        return super.toString() + """
                                  """ + "camarotes " + camarotes;
    }

}
