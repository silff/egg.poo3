/*
 Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. 
 */
package Enum;

public enum Gimnasio {
    A, B, NO;

    public int calcular() {
        return switch (this) {
            case A -> 50;
            case B -> 30;
            case NO -> 0;
            default -> 0;
        };
    }
}
