/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Lari
 */
public class Jasper {
    
    private Paita paita = null;
    private Farkku farkku = null;
    private Kenka kenka = null;
    private Lippis lippis = null;
    
    public Jasper(VaateTehdas tehdas){
         paita = tehdas.makePaita();
         farkku = tehdas.makeFarkku();
         kenka = tehdas.makeKenka();
         lippis = tehdas.makeLippis();
    }
    
    
    public void createJasper(){
        
        System.out.println("Jasperilla on päällään: " + paita+", " + farkku+", " + kenka +", " + lippis);
        
    }
    
}

