/*
 
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package servicies;

import entities.Alquiler;
import java.time.LocalDate;
import java.util.Scanner;

public class AlquilerServicio {

    private final Scanner sc;
    private final Alquiler alquiler;
    private final VeleroServicio veleroServicio;
    private final BarcoMotorServicio barcoMotorServicio;
    private final YateServicio yateServicio;

    public AlquilerServicio() {
        this.alquiler = new Alquiler();
        this.barcoMotorServicio = new BarcoMotorServicio();
        this.veleroServicio = new VeleroServicio();
        this.yateServicio = new YateServicio();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Alquiler datosAlquiler() {
        System.out.println("cliente nombre");
        alquiler.getCliente().setNombre(sc.next());
        System.out.println("cliente dni");
        alquiler.getCliente().setDni(sc.nextLong());
        System.out.println("barco tipo - 1 VELERO - 2 BARCO MOTOR - 3 YATE");
        int tipoBarco = sc.nextInt();
        switch (tipoBarco) {
            case 1:
                veleroServicio.crearVelero();
                alquiler.setVelero(alquiler.getVelero());
                break;
            case 2:
                barcoMotorServicio.crearBarcoMotor();
                alquiler.setBarcoMotor(alquiler.getBarcoMotor());
                break;
            case 3:
                yateServicio.crearYate();
                alquiler.setYate(alquiler.getYate());
                break;
            default:
                System.out.println("no es una opcion valida");
        }

        System.out.println("amarre posicion");
        alquiler.setPosAmarre(sc.nextInt());
        System.out.println("fecha inicio DD/MM/AA");
        int dayI = sc.nextInt();
        int monthI = sc.nextInt();
        int yearI = sc.nextInt();
        alquiler.setFechaInicio(LocalDate.of(yearI, monthI, dayI));
        System.out.println("fecha fin");
        int dayF = sc.nextInt();
        int monthF = sc.nextInt();
        int yearF = sc.nextInt();
        alquiler.setFechaFin(LocalDate.of(yearF, monthF, dayF));
        return alquiler;
    }

    /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).*/
    public double calcularAlquiler() {
        double precioAlquiler = 0;

        return precioAlquiler;
    }

    @Override
    public String toString() {
        return """
               Alquiler
               """ + alquiler + "\nVelero " + veleroServicio.toString() + "\nBarco Motor" + barcoMotorServicio.toString()
                + "\nYate " + yateServicio.toString();
    }

}
