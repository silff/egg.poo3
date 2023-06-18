/*
 
 */
package egg.guia12ejercicio4;

import entities.Circulo;
import entities.Rectangulo;

public class Guia12ejercicio4 {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(20);
        System.out.println("area " + c1.area());
        System.out.println("perimetro " + c1.perimetro());

        Rectangulo r1 = new Rectangulo(10, 20);
        System.out.println("area " + r1.area());
        System.out.println("perimetro " + r1.perimetro());

    }
}
