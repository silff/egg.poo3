/* • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
 */
package Servicies;

import Entities.Televisor;

public class TelevisorServicio extends ElectrodomesticosServicio {

    protected Televisor tv;
    protected double precioPulgadas;
    protected double precioTdt;

    public TelevisorServicio() {
        this.tv = new Televisor();
        this.precioPulgadas = 0;
        this.precioTdt = 0;
    }

    public Televisor crearTelevisor() {
        crearElectrodomestico();
        System.out.println("Resolucion");
        while (!sc.hasNextDouble()) {
            System.out.println("Debe ingresar un numero valido.");
            sc.next();
        }
        double pulgadas = sc.nextDouble();
        System.out.println("TDT");
        String tdt = "";
        boolean sinto = false;
        while (!tdt.equalsIgnoreCase("si") && !tdt.equalsIgnoreCase("no")) {
            System.out.println("debe ingresar si o no");
            tdt = sc.next();
        }
        if (tdt.equalsIgnoreCase("si")) {
            sinto = true;
        } else if (tdt.equalsIgnoreCase("no")) {
            sinto = false;
        }
        return tv = new Televisor(pulgadas, sinto, tv.getPrecio(), tv.getColor(), tv.getConsumo(), tv.getPeso());
    }

    /*• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/
    @Override
    public void precioFinal() {
        precioConsumo();
        precioPeso();
        precioPulgadas = (tv.getResolucion() > 40) ? precioPulgadas + (tv.getPrecio() * 1.3) : precioPulgadas;
        precioTdt = (tv.isSintonizadorTDT() == true) ? precioTdt + 500 : precioTdt;
        tv.setPrecio(precioPulgadas + precioTdt + tv.getPrecio());
    }

    @Override
    public String toString() {
        return """
               """ + tv + "| incremento pulgadas " + precioPulgadas + "| incremento sintonizador " + precioTdt
                + "\nPrecio final " + tv.getPrecio();
    }

}
