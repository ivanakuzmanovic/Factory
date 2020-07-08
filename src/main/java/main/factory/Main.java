/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factory;

/**
 *
 * @author Ivana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello Java");
        int x = 5;
        Car auto1 = new Car();
        auto1.model = "Audi";
        auto1.buildYear = 2003;
        auto1.ccm = 2000;
        auto1.color = "black";
        auto1.cartype = "hatchback";
        auto1.doornumber = 5;
        
        System.out.println("Model automobila 1 je " + auto1.model );
        
       int y = 29;
       Car auto2 = new Car();
       auto2.model = "Fiat";
       auto2.buildYear = 2019;
       
       System.out.println("Model automobila 2 je " + auto2.model );
        
        
        
    }
    
}
