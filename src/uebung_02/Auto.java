/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uebung_02;

/**
 *
 * @author Vincent McCawk
 */
public class Auto extends Fahrzeug implements Comparable<Auto> {
    
    //Variablen
   
    private boolean klimaanlage;
    private short airbags;
    private color farbe;
    
    
    
    public enum color{
        silver, red, black, blue, white;
    }

    //Konstruktor
    
    public Auto(short reifen, color farbe, short ps, short tueren, short airbags) {
        super(reifen, farbe, ps, tueren);
        farbe = farbe.silver;
        this.klimaanlage = false;
        this.airbags = airbags;
        anzahl++;
    }
    
    
    //Methoden
    void klimaanlageAus(){
        if(klimaanlage = true){
            klimaanlage = false;
        }
        else{
            System.out.println("Klimaanlage ist bereits aus!");
        }
       }
      void klimaanlageAn(){
        if(klimaanlage = false){
            klimaanlage = true;
        }
        else{
            System.out.println("Klimaanlage ist bereits an!");
        }
       }
      
      @Override
      public String toString(){        
          return "Mein Auto hat " + ps + " PS und fährt mit " + geschwindigkeit + " km/h";
      }

      //Getter/Setter
    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }

    

    @Override
    public int compareTo(Auto o) {
        if(this.getPs() < o.getPs()){
            return 1;
        }
        if(this.getPs() > o.getPs()){
            return -1;
        }
        else return 0;
    }
      
      
}
