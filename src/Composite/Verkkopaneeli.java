/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Lari
 */
public class Verkkopaneeli implements Laiteosa {
    int hinta;
    
    public Verkkopaneeli(){
        this.hinta=45;
    }

    public int laskeHinta() {
        return hinta;
    }

    public void addLaiteosa(Laiteosa osa) {
        throw new RuntimeException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
