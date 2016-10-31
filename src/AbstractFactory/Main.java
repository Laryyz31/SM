/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Lari
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Class a = null;
        VaateTehdas atehdas = null;
        Class b = null;
        VaateTehdas btehdas = null;

        Properties properties = new Properties();
        try {
            properties.load(
                    new FileInputStream("tehdas.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //luetaan toteuttava tehdas properties-tiedostosta
            a = Class.forName(properties.getProperty("AdidasTehdas"));
            atehdas = (VaateTehdas) a.newInstance();

            b = Class.forName(properties.getProperty("BossTehdas"));
            btehdas = (VaateTehdas) b.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Jasper jasper1 = new Jasper(atehdas);
        jasper1.createJasper();

        Jasper jasper2 = new Jasper(btehdas);
        jasper2.createJasper();

    }
}
