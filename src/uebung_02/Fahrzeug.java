/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uebung_02;

import uebung_02.Auto.color;

/**
 *
 * @author Vincent McCawk
 */
public class Fahrzeug {
    
    
    //Variablen
    private short reifen;
    private color farbe;
    short ps;
    private short tueren;
    boolean gestartet;
    short geschwindigkeit;
    public static int anzahl;
    
    
    //Methoden
    public void starten(){
        gestartet = true;
    }
    
    public void stoppen(){
        gestartet = false;
    }
          
    public void beschleunigen(short gs){
        if(gestartet = true && geschwindigkeit + gs > 250 ){
        geschwindigkeit += gs;}
        else{  
               geschwindigkeit = 250;}
                
    
    }
    
    public void bremsen(short gs){
        if(gestartet = true && geschwindigkeit - gs >= 0){
            geschwindigkeit -= gs;
        }
        
        else{
            geschwindigkeit = 0;
        }
    }
    //Konstruktor
    public Fahrzeug(short reifen, color farbe, short ps, short tueren) {
        this.reifen = reifen;
        farbe = farbe.silver;
        this.ps = ps;
        this.tueren = tueren;
        gestartet = false;
        geschwindigkeit = 0;
        anzahl++;
    }

    
    
    //Getter/Setter
    public short getReifen() {
        return reifen;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public color getFarbe() {
        return farbe;
    }

    public void setFarbe(color farbe) {
        this.farbe = farbe;
    }

    

    

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getTueren() {
        return tueren;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }
   
    
    
}
