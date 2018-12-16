/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Coche {
    String matricula;
    GregorianCalendar gcTiempoInicioEstacionamiento, gcTiempoFinEstacionamiento;

    public Coche(String matricula, GregorianCalendar gcTiempoInicioEstacionamiento) {
        this.matricula = matricula;
        this.gcTiempoInicioEstacionamiento = gcTiempoInicioEstacionamiento;
    }

   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public GregorianCalendar getGcTiempoInicioEstacionamiento() {
        return gcTiempoInicioEstacionamiento;
    }

    public void setGcTiempoInicioEstacionamiento(GregorianCalendar gcTiempoInicioEstacionamiento) {
        this.gcTiempoInicioEstacionamiento = gcTiempoInicioEstacionamiento;
    }

    public GregorianCalendar getGcTiempoFinEstacionamiento() {
        return gcTiempoFinEstacionamiento;
    }

    public void setGcTiempoFinEstacionamiento(GregorianCalendar gcTiempoFinEstacionamiento) {
        this.gcTiempoFinEstacionamiento = gcTiempoFinEstacionamiento;
    }

    public Double calcularPrezo(){
    Double dev = null;
    long tiempo, horas, minutos,segundos;
    if(this.gcTiempoFinEstacionamiento != null && this.gcTiempoInicioEstacionamiento != null){
    tiempo =this.gcTiempoFinEstacionamiento.getTimeInMillis()- this.gcTiempoInicioEstacionamiento.getTimeInMillis();
    horas = tiempo/(60*60*1000);
    minutos = (tiempo%(60*60*1000))/(1000*60);
    segundos = (tiempo%(60*60*1000))%(1000*60)/1000;
    
    if(horas < 3){
    dev = 1.5;
    
    }else{
    dev = 1.5+(horas -3)*0.2;
    
    }
    
    }
    
    
    
    return dev;
    }
    
    
    
    
    
    @Override
    public String toString() {
        String texto = "";
        if(gcTiempoFinEstacionamiento!= null) {texto = "\nhora del fin de estacionamiento: " + Peticiones.formateadorFechas(gcTiempoFinEstacionamiento);}
        return "Coche\n********************"
                + "\nmatricula: " + matricula +
                "\nHora del principio del estacionamiento: " + Peticiones.formateadorFechas(gcTiempoInicioEstacionamiento) + 
                texto + "\nestacionamiento total = "+ this.calcularPrezo()+ "\n";
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coche other = (Coche) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
    
   
    
}
