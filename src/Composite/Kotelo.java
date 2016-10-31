/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lari
 */
public class Kotelo implements Laiteosa {
    int hinta;
    
    public Kotelo(){
        this.hinta=30;
    }
    
    Laiteosa[] kotelo = {new Verkkopaneeli(), new Kiintolevy(), new Etupaneeli(), new Etumaski(), new Emolevy()};
    
    List<Laiteosa> laiteList = new ArrayList<Laiteosa>();

    public int laskeHinta() {
        for(Laiteosa o : kotelo){
           hinta = hinta + o.laskeHinta();
        }
        return hinta;
    }

   
        public void addLaiteosa(Laiteosa osaToAddToCurrentLaite) {
        laiteList.add(osaToAddToCurrentLaite);
    }
    
}
