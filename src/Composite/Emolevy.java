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
public class Emolevy implements Laiteosa{
    int hinta;
    
    public Emolevy (){
        this.hinta=300;
    }
    
            Laiteosa[] emolevy = {new Muistipiiri(), new Prosessori(), new NaytonOhjain()};

    
      List<Laiteosa> laiteList = new ArrayList<Laiteosa>();

    public int laskeHinta() {
        for(Laiteosa o : emolevy){
           hinta = hinta + o.laskeHinta();
        }
        return hinta;
    }

  public void addLaiteosa(Laiteosa osaToAddToCurrentLaite) {
        laiteList.add(osaToAddToCurrentLaite);
    }
    }
    

