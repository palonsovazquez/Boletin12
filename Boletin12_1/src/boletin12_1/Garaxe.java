/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Garaxe {

    public Integer numCochesAparcados;
    private Coche plazaA, plazaB, plazaC, plazaD, plazaE;

    /**
     *
     * @param coche necesita un objeto coche que asignar
     * @param plaza necesita un integer del 0 al 5 para asignar la plaza al
     * hueco
     * @return
     */
    public boolean AsignarPlaza(Coche coche) {

        return AsignarPlaza(coche, detectarHueco());
    }

    public boolean AsignarPlaza(Coche coche, Integer plaza) {
        boolean correcto = false;
        if (plaza >= 0 && plaza <= 5) {

            switch (plaza) {
                case 0:
                    plazaA = coche;
                    break;
                case 1:
                    plazaB = coche;
                    break;
                case 2:
                    plazaC = coche;
                    break;
                case 3:
                    plazaD = coche;
                    break;
                case 4:
                    plazaE = coche;
                    break;
            }
            correcto = true; // si se pudo asignar correctamente el coche devuelve un boolean true;

        }

        return correcto;
    }

    public Coche getPlaza(Integer plaza) {

        Coche coche = null;
        if (plaza >= 0 && plaza <= 5) {

            switch (plaza) {
                case 0:
                    coche = plazaA;
                    break;
                case 1:
                    coche = plazaB;
                    break;
                case 2:
                    coche = plazaC;
                    break;
                case 3:
                    coche = plazaD;
                    break;
                case 4:
                    coche = plazaE;
                    break;
            }

        }

        return coche;
    }

    public Integer detectarHueco() { // ve que hueco esta libre y devuelve null si no hay ninguno
        Integer dev = null;
        if (dev == null) {
            if (plazaA == null) {
                dev = 0;
            }
        }
        if (dev == null) {
            if (plazaB == null) {
                dev = 1;
            }
        }
        if (dev == null) {
            if (plazaC == null) {
                dev = 2;
            }
        }
        if (dev == null) {
            if (plazaD == null) {
                dev = 3;
            }
        }
        if (dev == null) {
            if (plazaE == null) {
                dev = 4;
            }
        }

        return dev;
    }

    @Override
    public String toString() {
        return "Garaxe" + numCochesAparcados + "\nplazaA\n" + plazaA + "\nplazaB\n" + plazaB + "\nplazaC\n" + plazaC + "\nplazaD\n" + plazaD + "\nplazaE\n" + plazaE + '}';
    }

    public Integer PlazasLibres() {
        Integer contador = 0;

        for (int i = 0; i < 5; i++) {
            if (getPlaza(i) == null) {
                contador++;
            }

        }
return contador;
    }
public String factura(int plaza,Double cartosRecividos,Double CartosDevoltos){
String dev;
   dev = "\nFactura\n"
           + "*******************************\n"+
           getPlaza(plaza).toString()+ "\nCartos recividos = "+ cartosRecividos + "\nCartos devoltos = "+ CartosDevoltos+ "\n Gracias por usar o noso aparcadoiro\n";

return dev;
}
}
