/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uebung_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import uebung_02.Auto.color;

/**
 *
 * @author Vincent McCawk
 */
public class Uebung_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Auto bmw = new Auto((short)4, color.silver, (short)220,(short)5, (short)4);
        Auto audi = new Auto((short)4, color.black, (short)180, (short)5, (short) 8);
        Auto bmw1 = new Auto((short)4, color.black, (short)30,(short)5, (short)4);
        Auto audi1 = new Auto((short)4, color.blue, (short)125,(short)5, (short)4);
        Auto audi2 = new Auto((short)4,color.white, (short)180,(short)5, (short)4);
        
        Wasserfahrzeug titanic = new Wasserfahrzeug ((short)0, color.blue, (short)51000, (short)0, 10.54, (short) 3, 100000);
   
        
       /* System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println (titanic.toString()); */ 
        
        
        List<Auto> liste = new ArrayList<>();
       liste.add(audi);
       liste.add(bmw);
       liste.add(bmw1);
       liste.add(audi1);
       liste.add(audi2);
       Collections.sort(liste);
       
        for(Auto a :liste){
            System.out.println(a.toString());       
        }

    }
    
}
