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
public interface VaateTehdas {
    public abstract Paita makePaita();
    public abstract Farkku makeFarkku();
    public abstract Lippis makeLippis();
    public abstract Kenka makeKenka();
    
}
