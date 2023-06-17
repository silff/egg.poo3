/* • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
 */
package Servicies;

import Entities.Electrodomesticos;
import Entities.Televisor;

public class TelevisorServicio extends ElectrodomesticosServicio {

    protected Electrodomesticos eL = crearElectrodomestico();
    protected Televisor tv = new Televisor();
    protected double precioPulgadas = 0;
    protected double precioTdt = 0;

    public void crearTelevisor() {
        System.out.println("Resolucion");
        while (!sc.hasNextDouble()) {
            System.out.println("Debe ingresar un numero valido.");
            sc.next();
        }
        double pulgadas = sc.nextDouble();
        tv.setResolucion(pulgadas);
        System.out.println("TDT");
        String tdt = "";
        while (!tdt.equalsIgnoreCase("si") && !tdt.equalsIgnoreCase("no")) {
            System.out.println("debe ingresar si o no");
            tdt = sc.next();
        }
        if (tdt.equalsIgnoreCase("si")) {
            tv.setSintonizadorTDT(true);
        } else if (tdt.equalsIgnoreCase("no")) {
            tv.setSintonizadorTDT(false);
        }

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
        precioPulgadas = (tv.getResolucion() > 40) ? precioPulgadas + (eL.getPrecio() * 1.3) : precioPulgadas;
        precioTdt = (tv.isSintonizadorTDT() == true) ? precioTdt + 500 : precioTdt;
        tv.setPrecio(precioPulgadas + precioTdt + eL.getPrecio());
    }

    @Override
    public String toString() {
        return """
               """ + eL + tv + "| incremento pulgadas " + precioPulgadas + "| incremento sintonizador " + precioTdt
                + "\nPrecio final " + tv.getPrecio();
    }

}
