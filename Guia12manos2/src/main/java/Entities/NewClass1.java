/*
 
 */
package Entities;

import Interfaces.NewInterface1;

public class NewClass1 implements NewInterface1 {

    @Override
    public void metodo() {

        System.out.println("HOLA " + CONSTANTE);
    }

    @Override
    public int sumar() {
        int suma = 2 + 4;
        return suma;
    }

}
