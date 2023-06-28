/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.guia13;

/**
 *
 * @author Silvana
 */
public class Guia13 {

    public static void main(String[] args) {
        
        int[] numeros = new int[5];
        
        try {
            for (int i = 0; i <= 6; i++) {
                System.out.println(numeros[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("se pasa");
        }
    }
}
