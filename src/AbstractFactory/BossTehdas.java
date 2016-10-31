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
public class BossTehdas implements VaateTehdas {
    public Paita makePaita(){
        return new BossPaita();
    }
    public Farkku makeFarkku(){
        return new BossFarkut();
    }
    public Lippis makeLippis(){
        return new BossLippis();
    }
    public Kenka makeKenka(){
        return new BossKengat();
    }
    
}
