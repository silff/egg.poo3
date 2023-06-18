/*
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package entities;

import interfaces.CalculoFormas;

public class Rectangulo implements CalculoFormas {

    private double lado1;
    private double lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double perimetro() {
        return lado1 * lado2;
    }

    @Override
    public double area() {
        return (lado1 + lado2) * 2;
    }

}
