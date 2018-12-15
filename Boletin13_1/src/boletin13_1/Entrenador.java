/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_1;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Entrenador extends Seleccion{
   private String idFederacion;

    @Override
    public void viaxar() {
        super.viaxar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void concentrarse() {
        super.concentrarse(); //To change body of generated methods, choose Tools | Templates.
    }
   
   public void dirixirPartido(){}
   
   public void dirixirAdestramento(){}

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
}
