/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package egg.guia13ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Silvana
 */
public class Guia13ejercicio3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("ingrese 2 nuemros");

        try {
//            String numero1 = sc.next();
//            String numero2 = sc.next();

            int num1 = sc.nextInt(); //Integer.parseInt(numero1);
            int num2 = sc.nextInt(); //Integer.parseInt(numero2);
            System.out.println(num1 / num2);

        } catch (InputMismatchException e) {
            System.out.println("error1");
        } catch (NumberFormatException e) {
            System.out.println("error2");
        } catch (ArithmeticException e) {
            System.out.println("error3");
        }

    }
}
