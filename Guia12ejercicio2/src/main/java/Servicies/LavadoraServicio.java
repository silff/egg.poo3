/*• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package Servicies;

import Entities.Electrodomesticos;
import Entities.Lavadora;

public class LavadoraServicio extends ElectrodomesticosServicio {

    protected Electrodomesticos eL = crearElectrodomestico();
    protected Lavadora lv = new Lavadora();
    protected double precioCarga = 0;

    public Lavadora crearLavadora() {
        System.out.println("carga");
        while (!sc.hasNextDouble()) {
            System.out.println("Debe ingresar un numero valido.");
            sc.next();
        }
        double carga = sc.nextDouble();
        lv.setCarga(carga);
        return lv;
    }

    @Override
    public void precioFinal() {
        precioConsumo();
        precioPeso();
        precioCarga = (lv.getCarga() > 30) ? precioCarga + 500 : precioCarga;
        lv.setPrecio(precioCarga + eL.getPrecio());
    }

    @Override
    public String toString() {
        return """
                """ + eL + lv + " incremento " + precioCarga
                + "\nPrecio final " + lv.getPrecio();
    }

}
