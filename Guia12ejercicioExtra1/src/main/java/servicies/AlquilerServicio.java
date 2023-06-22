/*
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package servicies;

import entities.Alquiler;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AlquilerServicio {

    private final Scanner sc;
    private final Alquiler alquiler;
    private final VeleroServicio veleroServicio;
    private final BarcoMotorServicio barcoMotorServicio;
    private final YateServicio yateServicio;
    private int opcion;

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
        do {
            System.out.println("barco tipo - 1 VELERO - 2 BARCO MOTOR - 3 YATE");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 ->
                    alquiler.setBarco(veleroServicio.crearVelero());
                case 2 ->
                    alquiler.setBarco(barcoMotorServicio.crearBarcoMotor());
                case 3 ->
                    alquiler.setBarco(yateServicio.crearYate());
                default ->
                    System.out.println("no es una opcion valida");
            }
        } while (opcion != 1 && opcion != 2 && opcion != 3);

        System.out.println("posicion amarre");
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
multiplicando por 10 los metros de eslora).
    En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.*/
    public void calcularAlquiler() {
        System.out.println("total alquiler en $");
        long dias = ChronoUnit.DAYS.between(alquiler.getFechaInicio(),
                alquiler.getFechaFin());
        switch (opcion) {
            case 1:
                System.out.println(veleroServicio.moduloBarco() * dias);
                break;
            case 2:
                System.out.println(barcoMotorServicio.moduloBarco() * dias);
            case 3:
                System.out.println(yateServicio.moduloBarco() * dias);
                break;
        }
    }

    public void mostrar() {
        switch (opcion) {
            case 1 ->
                System.out.println(veleroServicio.toString());
            case 2 ->
                System.out.println(barcoMotorServicio.toString());
            case 3 ->
                System.out.println(yateServicio.toString());
        }
    }

    @Override
    public String toString() {
        return """
               Alquiler
               """ + alquiler;
    }

}
