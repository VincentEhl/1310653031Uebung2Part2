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
public class Wasserfahrzeug extends Fahrzeug {
    
    //Variablen
    private double tiefgang;
    private short schrauben;
    private double ladung;

    //Konstruktor
    public Wasserfahrzeug(short reifen, color farbe, short ps, short tueren, double tiefgang, short schrauben, double ladung) {
        super(reifen, farbe, ps, tueren);
        this.tiefgang = tiefgang;
        this.schrauben = schrauben;
        this.ladung = ladung;
        anzahl ++;
    }
    
    
    //Methoden
    void entladen() throws InterruptedException{
        ladung = 0;
        Thread.sleep(5000);
    }
    
     @Override
      public String toString(){
          return "Mein Wasserfahrzeug hat " + ps + " PS und einen Tiefgang von " + tiefgang + " m";
      }

    
    //Getter/Setter
    public double getTiefgang() {
        return tiefgang;
    }

    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public short getSchrauben() {
        return schrauben;
    }

    public void setSchrauben(short schrauben) {
        this.schrauben = schrauben;
    }

    public double getLadung() {
        return ladung;
    }

    public void setLadung(double ladung) {
        this.ladung = ladung;
    }
    
    
}
