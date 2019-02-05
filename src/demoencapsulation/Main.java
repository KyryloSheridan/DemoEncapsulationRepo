/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoencapsulation;

/**
 * 
 * My own comment
 * 
 * - Kyrylo Anisimov
 * 
 */

import content.Employee;
import content.Worker;
/**
 *
 * @author anisi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Worker one = new Worker();
        System.out.println(one.getName());
        one.setName("Kyrylo");
        System.out.println(one.getName());
        Worker Wilma = new Worker(200);
        Wilma.setName("Wilma");
        System.out.println(Wilma.getName());
        System.out.println(Wilma.getNumber());
        System.out.println(one.getNumber());
        Employee three = new Employee();
        System.out.println(three.getPay());
        three.setHours(30);
        three.setRate(15);
        System.out.println(three.getPay());
    }
    
}
