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
public class AdidasTehdas implements VaateTehdas{
     public Paita makePaita() {
         return new AdidasPaita();
     }
    public  Farkku makeFarkku() {
        return new AdidasFarkut();
    }
    public  Lippis makeLippis(){
        return new AdidasLippis();
    }
    public  Kenka makeKenka(){
        return new AdidasKengat();
    }
   
}
