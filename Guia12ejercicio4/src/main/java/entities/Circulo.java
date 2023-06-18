/*
 Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
package entities;

import interfaces.CalculoFormas;

public class Circulo implements CalculoFormas {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return PI * radio * 2;
    }

    @Override
    public double area() {
        return PI * radio * radio;
    }

}
