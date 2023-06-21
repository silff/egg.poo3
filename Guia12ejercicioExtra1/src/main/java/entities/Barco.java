/*
En un puerto se alquilan amarres para barcos de distinto tipo. 
 */
package entities;

public class Barco {

    /*Un Barco se caracteriza por: su matrícula, su eslora en metros y año de 
    fabricación. Sin embargo, se pretende diferenciar la información de algunos 
    tipos de barcos especiales:*/
    protected String matricula;
    protected double eslora;
    protected int anio;

    public Barco() {
    }

    public Barco(String matricula, double eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
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
               """ + "matricula " + matricula + "| eslora " + eslora + "| año " + anio;
    }

}
