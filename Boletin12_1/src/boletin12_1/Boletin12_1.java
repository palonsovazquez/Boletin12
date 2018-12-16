/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

import java.util.GregorianCalendar;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Coche x = new Coche("545668552",new GregorianCalendar());
        System.out.println(x.toString());
        
        
        System.out.println((20000000%(60*60*1000))/(60*1000));
       
    }
    
}
