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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Laiteosa kaikkiOsatKoneessa = new Kotelo();
        
        Laiteosa muistiOsa = new Muistipiiri();
        
        kaikkiOsatKoneessa.addLaiteosa(muistiOsa);
        
        Laiteosa nayttoOsa = new NaytonOhjain();
        
        kaikkiOsatKoneessa.addLaiteosa(nayttoOsa);
        
        Laiteosa prosessoriOsa = new Prosessori();
        
        kaikkiOsatKoneessa.addLaiteosa(prosessoriOsa);
        
        Laiteosa emoOsa = new Emolevy();
        
        emoOsa.addLaiteosa(prosessoriOsa);
        
        emoOsa.addLaiteosa(nayttoOsa);
        
        emoOsa.addLaiteosa(muistiOsa);
        
        kaikkiOsatKoneessa.addLaiteosa(emoOsa);
        
        Laiteosa etumOsa = new Etumaski();
        
        kaikkiOsatKoneessa.addLaiteosa(etumOsa);
        
        Laiteosa etupOsa = new Etupaneeli();
        
        kaikkiOsatKoneessa.addLaiteosa(etupOsa);
        
        Laiteosa kiintoOsa = new Kiintolevy();
        
        kaikkiOsatKoneessa.addLaiteosa(kiintoOsa);
        
        Laiteosa verkkoOsa = new Verkkopaneeli();
        
        
        kaikkiOsatKoneessa.addLaiteosa(verkkoOsa);
        
        
        
   
        
        System.out.println("Koneen hinta on: " + kaikkiOsatKoneessa.laskeHinta());
        
        
        
        
        
    }
    
}
