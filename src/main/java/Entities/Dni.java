/*
 */
package Entities;

public class Dni {
    
    private Integer dni;
    private String letra;

    public Dni() {
    }

    public Dni(Integer dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
